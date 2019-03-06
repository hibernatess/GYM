layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#test'
        ,url:'/selectsta/selectsta'
        ,cols: [[
            {field:'hname',  title: '用户名', sort: true}
            ,{field:'svalues',title: '会员等级'}
            ,{field:'cprice',title: '总消费金额',templet:function (d) {
                    return d.cprice+"￥";
                },sort: true}
            ,{fixed: 'right',title: '操作',templet:function (d) {
                    return $('#d1').html();
                },align: 'center'}
        ]]
        ,id: 'testReload'
        ,page: true
    });

    //搜素
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

    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

});