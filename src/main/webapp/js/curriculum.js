//课程管理
layui.use(['table', 'form'],
    //, 'from'
    function () {
        var table = layui.table;
        // 第一个实例
        table.render({
            elem: '#LAY_table_user',
            // height: 300,
            url: 'curriculum/getcurriculum' // 数据接口
            ,
            // defaultToolbar : [ 'filter', 'print', 'exports' ],
            page: true // 开启分页
            ,
            limit: 10,
            limits: [5, 10, 15],
            cellMinWidth: 80,
            cols: [[
                {
                    field: 'cid',
                    title: '编号',
                    sort: true,
                    // width: 80,
                }, {
                    field: 'cname',
                    title: '课程名字',
                    // width: 80,
                }, {
                    field: 'cattend',
                    title: '课程时间',
                    // width: 80,
                }, {
                    field: 'jname',
                    title: '教练姓名',
                    // width: 180,
                }, {
                    field: 'sid',
                    title: '是否收费', templet: function (d) {
                        if (d.sid == 1) {
                            return "是"
                        } else {
                            return "否"
                        }

                    }
                    // width: 180,
                }, {
                    fixed: 'right',
                    title: '操作',
                    align: 'center',
                    toolbar: '#barDemo'
                }]],
            id: 'testReload',

        });
        table.on('checkbox(user)', function (obj) {
            console.log(obj)
        });

        //上方菜单
        var $ = layui.$, active = {
            //查询
            reload: function () {
                var cnames = $('#cnames');//用户名
                // var usr_role_id = $('#usr_role_id');//角色
                // 执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1
                        // 重新从第 1 页开始
                    },
                    where: {
                        key: 'cname',
                        cname: cnames.val()
                    }
                });
            }, add: function () { //添加
                layer.open({
                    type: 1,
                    title: '添加课程',
                    maxmin: true,
                    shadeClose: true, //点击遮罩关闭层
                    area: ['80%', '80%'],
                    content: $('#box1'),
                    btn: ['确定', '取消'],
                    yes: function (index, layero) {//确定执行函数
                        //执行添加方法
                        $.getJSON("curriculum/post", {
                            cname: $('#cname').val(),//课程名字
                            cattend: $('#cattend').val(),//课程时间
                            jid: $('#jid').val(),//教练id
                            sid: $('#sid').val(),//是否收费
                            cprice: $('#cprice').val(),//课程价格
                        }, function (data) {
                            if (data) {
                                layer.alert('添加成功', {icon: 1, title: '提示'}, function (i) {
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
                                layer.msg('添加失败')
                            }
                        })

                    }, cancel: function (index, layero) {
                        $("#users")[0].reset()//重置form
                        layer.close(index)
                    }
                });
            }
        }
        $('.layui-form .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        //table菜单
        table.on('tool(user)', function (obj) {
            var data = obj.data;//获得当前行数据
            var layEvent = obj.event; // 获得 lay-event 对应的值（也可以是表头的event参数对应的值）
            var tr = obj.tr; // 获得当前行 tr 的DOM对象
            if (layEvent == 'edit') {//编辑
                layer.open({
                    type: 1,
                    title: '编辑课程',
                    maxmin: true,
                    shadeClose: true, //点击遮罩关闭层
                    area: ['80%', '80%'],
                    content: $('#box1'),
                    btn: ['确定', '取消'],
                    success: function (layero, index) {//弹出后执行的函数
                        $('#cname').val(data.cname);//课程名
                        $('#cattend').val(data.cattend);//课程时间
                        $('#jid').val(data.jid);//教练
                        $('#sid').val(data.sid);//是否收费
                        $('#cprice').val(data.cprice)//价格
                        layui.form.render('select');
                    }, yes: function (index, layero) {//确定回调函数
                        $.ajaxSettings.async = false;
                        $.getJSON('curriculumf/put', {
                            cname: $('#cname').val(),//课程名字
                            cattend: $('#cattend').val(),//课程时间
                            jid: $('#jid').val(),//教练id
                            sid: $('#sid').val(),//是否收费
                            cprice: $('#cprice').val(),//课程价格
                            cid:data.cid//编号
                        }, function (data) {
                            if (data) {
                                layer.alert('编辑成功', {icon: 1, title: '提示'}, function (i) {
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
                                layer.msg('编辑失败')
                            }
                        })
                    }, cancel: function (index, layero) {
                        $("#users")[0].reset()//重置form
                        layer.close(index)
                    }
                })
            } else if (layEvent == 'del') {//删除
                layer.confirm('确定删除吗???', {icon: 3, title: '提示'}, function (index) {
                    $.getJSON("curriculum/delete", {
                        cid: data.cid
                    }, function (data) {
                        layer.close(index);
                        table.reload('testReload', {
                            page: {
                                curr: 1
                                // 重新从第 1 页开始
                            }
                        })
                    });
                })
            }
        });
    });

/*
下拉框教练加载
 */
function coach() {
    $.ajaxSettings.async = false;
    $.getJSON('coach/getcoach', {}, function (data) {
        var html = "";
        // 返回处理的方法
        $.each(data, function (index, item) {
            html += "<option value=" + item.role_id + ">" + item.role_name
                + "</option>";
        });
        $('#jid').html(html);
    })
}
$(function () {
    coach();
})
