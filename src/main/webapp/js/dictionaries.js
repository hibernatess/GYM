layui.config({
        base: "autocomplete/"
    }
).extend({
    autocomplete: "autocomplete"
}).use(['table', 'layer', 'form', 'autocomplete', 'jquery'], function () {
    var table = layui.table, layer = layui.layer, form = layui.form,
        $ = layui.$,
        autocomplete = layui.autocomplete;
    autocomplete.render({
        elem: $('#insname'),
        url: 'dict/getsname',
        template_val: '{{d.sname}}',
        template_txt: '{{d.sname}}',
        onselect: function (resp) {
        }
    })
    table.render({
        elem: "#dictionaries",
        url: "/dict/getdictionaries",
        limit: 10
        , limits: [5, 10, 20, 30]
        , cellMinWidth: 80
        , cols: [[
            {field: 'sid', title: 'id', width: 80, sort: true}
            , {field: 'sname', title: '类别'}
            , {field: 'svalues', title: '数据值'}
            , {
                field: 'sflag', title: '可编辑', templet: function (d) {
                    if (d.sflag == 0) {
                        return "<span style=color: #c00;>可编辑</span>"
                    } else {
                        return "<span style=color: #c00;>不可编辑</span>"
                    }
                }
            },
            {
                fixed: 'right',
                title: '操作',
                align: 'center',
                toolbar: '#barDemo'
            }
        ]]
        , page: true
        , id: "testReload"


    });

    //table菜单
    table.on('tool(dictionaries)', function (obj) {
        var data = obj.data;//获得当前行数据
        var layEvent = obj.event; // 获得 lay-event 对应的值（也可以是表头的event参数对应的值）
        var tr = obj.tr; // 获得当前行 tr 的DOM对象
        if (layEvent == "del") {
            layer.alert("你确定要删除这个基础数据么?", {icon: 3}, function (index) {
                $.post("/dict/del", {sid: data.sid}, function (msg) {
                    if (msg) {
                        layer.close(index);
                        table.reload('testReload', {
                            page: {
                                curr: 1
                                // 重新从第 1 页开始
                            }
                        })
                    } else {
                        layer.msg("删除失败")
                    }
                });

            })

        } else {
            $("#editsname").val(data.sname);
            $("#editstpye").val(data.stpye);
            $("#editsvalues").val(data.svalues);
            layer.open({
                title: '编辑基础数据',
                type: 1,
                area: ['72%', '80%'],
                fixed: false, // 不固定
                maxmin: true,
                shadeClose: true,
                content: $('#box2'),
                btn: ['确认', '取消'],
                yes: function (index) {
                    if (!$("#editsname").val() || !$("#editsvalues").val() || !$("#editstpye").val()) {
                        layer.msg("请将信息补全")
                        return;
                    }

                    $.ajaxSettings.async = false;
                    $.getJSON("/dict/put", {
                        sid:data.sid,
                        sname: $("#editsname").val(),
                        stpye: $("#editstpye").val(),
                        svalues: $("#editsvalues").val(),
                        sflag: data.sflag
                    }, function (data) {
                        if (data) {
                            layer.alert('编辑成功', {icon: 1, title: '提示'}, function (i) {
                                layer.close(i);
                                layer.close(index);//关闭弹出层
                                $("#editusers")[0].reset()//重置form
                            })
                            table.reload('testReload', {//重载表格
                                page: {
                                    curr: 1
                                    // 重新从第 1 页开始
                                }
                            })
                        } else {
                            layer.msg('编辑失败')
                        }})

                }
            })


        }


    })


    var $ = layui.$, active = {//datatype
        //查询的方法
        reload: function () {
            // 执行重载
            table.reload('testReload', {
                page: {
                    curr: 1
                },
                where: {
                    key: 'sname',
                    sname: $("#sname").val(),
                    key: 'svalues',
                    svalues: $("#svalues").val()
                }
            });
        }, add: function () {

            layer.open({
                title: '增加基础数据',
                type: 1,
                area: ['72%', '80%'],
                fixed: false, // 不固定
                maxmin: true,
                shadeClose: true,
                content: $('#box1'),
                btn: ['确认', '取消'],
                yes: function (index) {
                    if (!$("#insname").val() || !$("#insvalues").val() || !$("#stpye").val()) {
                        layer.msg("请将信息补全")
                        return;
                    }
                    var sflag = 0;
                    if (!$("#sflag").is(":checked")) {
                        sflag = 1;
                    }

                    $.ajaxSettings.async = false;
                    $.getJSON("/dict/post", {
                        sname: $("#insname").val(),
                        stpye: $("#stpye").val(),
                        svalues: $("#insvalues").val(),
                        sflag: sflag
                    }, function (data) {
                        if (data) {
                            layer.alert('增加成功', {icon: 1, title: '提示'}, function (i) {
                                layer.close(i);
                                layer.close(index);//关闭弹出层
                                $("#users")[0].reset()//重置form
                            })
                            table.reload('testReload', {//重载表格
                                page: {
                                    curr: 1
                                    // 重新从第 1 页开始
                                }
                            })
                        } else {
                            layer.msg('增加失败')
                        }

                    })
                }
            })
        }
    };


    //绑定事件
    $('.layui-form .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

})


/**
 * 下拉框加载数据类型
 */

function loadSNmae() {

    $.ajaxSettings.async = false;
    $.getJSON('dict/getdict', function (data) {
        var html = "<option value=''>请选择</option>";
        // 返回处理的方法
        $.each(data, function (index, item) {
            html += "<option value=" + item.sname + ">" + item.sname
                + "</option>";
        });
        $('#sname').html(html);
    })

}

$(function () {
    loadSNmae();
})