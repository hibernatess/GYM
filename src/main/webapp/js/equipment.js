//课程管理
layui.use(['table', 'form'],
    //, 'from'
    function () {
        var table = layui.table;
        // 第一个实例
        table.render({
            elem: '#LAY_table_user',
            // height: 300,
            url: '/equipment/Elist' // 数据接口
            ,
            // defaultToolbar : [ 'filter', 'print', 'exports' ],
            page: true // 开启分页
            ,
            limit: 10,
            limits: [5, 10, 15],
            cellMinWidth: 80,
            cols: [[
                {
                    field: 'qid',
                    title: '编号',
                    sort: true,
                    // width: 80,
                }, {
                    field: 'qname',
                    title: '器材名字',
                    // width: 80,
                }, {
                    field: 'sid',
                    title: '类型',templet:function(a){
                        if (a.sid== 1){
                            return"一级"
                        }else if(a.sid==2){
                            return "二级"
                        }else{
                            return "三级"
                        }
                    }
                    // width: 80,

                }, {
                    field: 'qprice',
                    title: '价格',
                    // width: 180,
                },{
                    field: 'qsum',
                    title: '数量',
                },{
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
                var qname = $('#qname');//用户名
                // var usr_role_id = $('#usr_role_id');//角色
                // 执行重载
                table.reload('testReload', {
                    page: {
                        curr: 1
                        // 重新从第 1 页开始
                    },
                    where: {
                        key: 'qname',
                        qname: qname.val()
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
                        $.getJSON("/equipment/add", {
                            qname: $('#name').val(),//器材名字
                            sid: $('#sid').val(),//类型
                            qprice: $('#qprice').val(),//价格
                            qdamage: $('#qdamage').val(),//是否损坏
                            qsum: $('#qsum').val(),//器材数量
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
            }, damage: function () { //添加
                layer.open({
                    type: 1,
                    title: '损坏',
                    maxmin: true,
                    shadeClose: true, //点击遮罩关闭层
                    area: ['80%', '80%'],
                    content: $('#box2'),
                    btn: ['确定', '取消'],
                    yes: function (index, layero) {//确定执行函数
                        //执行添加方法
                        $.getJSON("/damage/add", {
                            qid: $('#did').val(),//器材名字
                            qhprice: $('#qhprice').val(),//教练id
                            qhremark: $('#qhremark').val(),//是否损坏
                        }, function (data) {
                            if (data) {
                                layer.alert('OK', {icon: 1, title: '提示'}, function (i) {
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
                    title: '编辑器材',
                    maxmin: true,
                    shadeClose: true, //点击遮罩关闭层
                    area: ['80%', '80%'],
                    content: $('#box1'),
                    btn: ['确定', '取消'],
                    success: function (layero, index) {//弹出后执行的函数
                        $('#name').val(data.qname);//器材名称
                        $('#sid').val(data.sid);//器材类型
                        $('#qprice').val(data.qprice);//价格
                        $('#qdamage').val(data.qdamage);//是否损坏
                        $('#qsum').val(data.qsum);//数量
                        $('#qid').val(data.qid)
                        layui.form.render();
                    }, yes: function (index, layero) {//确定回调函数
                        $.ajaxSettings.async = false;
                        $.getJSON('/equipment/update', {
                            qname: $('#name').val(),//课程名字
                            sid: $('#sid').val(),//课程时间
                            qprice: $('#qprice').val(),//教练id
                            qdamage: $('#qdamage').val(),//课程价格
                            qsum: $('#qsum').val(),//编号
                            qid:$('#qid').val()
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
                    $.getJSON("equipment/del", {
                        qid: data.qid
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
下拉框加载
 */
function coach() {
    $.ajaxSettings.async = false;
    $.getJSON('damage/qname', {}, function (data) {
        var html = "";
        // 返回处理的方法
        $.each(data, function (index, item) {
            // if(!data.contains(item)){
            html += "<option value=" + item.qid + ">" + item.qname
                + "</option>";
            //}
        });
        $('#did').html(html);
    })
}

$(function () {
    coach();
})