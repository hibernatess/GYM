// 会员信息
layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#test'
        ,url:'/vip/listvip'
        ,cols: [[
            {field:'svalues',  title: '会员等级'}
            ,{field:'hname',  title: '用户名'}
            ,{field:'realname',  title: '真实姓名'}
            ,{field:'hsex',  title: '性别'}
            ,{field:'hage',  title: '年龄'}
            ,{field:'haddress',  title: '地址'}
            ,{field:'hregister',  title: '注册时间'}
            ,{fixed: 'right',title: '操作',toolbar: '#d1',align: 'center'}
        ]]
        ,id:'testReload'
        ,page: true
    });

//搜素用户名
    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    hname:demoReload.val()
                }
            });
        }
    };

//注销用户
    table.on('tool(demo)', function(obj){
        var data = obj.data;
        var layer = layui.layer;
        if(obj.event === 'del'){
            layer.confirm('！确定要注销该用户吗？', {
                btn: ['确定', '取消']
            }, function(index, layero){
                var hid=data.hid
                $.ajax({
                    type: "POST",
                    url: "/vip/delvip?hid="+hid,
                    success: function(msg){
                        var demoReload = $('#demoReload');
                        table.reload('testReload', {
                            page: {
                                curr: 1 //重新从第 1 页开始
                            }
                            ,where: {
                                hname:demoReload.val()
                            }
                        });
                    layer.msg("该用户已注销");
                    }
                })
            }, function(index){
                layer.close(index)
            });
        }
    });
    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

});