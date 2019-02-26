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
                    title: '是否收费',templet :function(d){
                        if(d.sid==1){
                            return "是"
                        }else{
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
            },add: function () { //添加
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
                            cprice :$('#cprice').val(),//课程价格
                        }, function (data) {
                            if (data ) {
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
                            }else {
                                layer.msg('添加失败')
                            }
                        })

                    },cancel:function (index, layero) {
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

    })