//课程管理
layui.use(['table', 'form'],
    //, 'from'
    function () {
        var table = layui.table;
        // 第一个实例
        table.render({
            elem: '#LAY_table_user',
            // height: 300,
            url: '/damage/Dlist' // 数据接口
            ,
            // defaultToolbar : [ 'filter', 'print', 'exports' ],
            page: true // 开启分页
            ,
            limit: 10,
            limits: [5, 10, 15],
            cellMinWidth: 80,
            cols: [[
                {
                    field: 'qhid',
                    title: '编号',
                    sort: true,
                    // width: 80,
                }, {
                    field: 'qname',
                    title: '器材名',
                    // width: 80,
                },{
                    field: 'qhprice',
                    title: '赔偿价格',
                    // width: 180,
                },{
                    field: 'qhremark',
                    title: '损坏原因',
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


        $('.layui-form .layui-btn').on('click', function () {
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });

        //table菜单
        table.on('tool(user)', function (obj) {
            var data = obj.data;//获得当前行数据
            var layEvent = obj.event; // 获得 lay-event 对应的值（也可以是表头的event参数对应的值）
            var tr = obj.tr; // 获得当前行 tr 的DOM对象
            if (layEvent == 'del') {//编辑
                layer.confirm('确定删除吗???', {icon: 3, title: '提示'}, function (index) {
                    $.getJSON("damage/del", {
                        qhid: data.qhid
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


