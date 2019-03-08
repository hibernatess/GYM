layui.use('table', function () {
    var table = layui.table;
    var hname=$('#hname').val()
    table.render({
        elem: '#test'
        , url: '/selectsta/selectinfo?hname='+hname
        , cols: [[
            {field: 'cname', title: '课程名', sort: true}
            , {field: 'jname', title: '教练名'}
            , {field: 'cattend', title: '课程时间'}
            , {
            field: 'cprice', title: '课程价格', templet: function (d) {
                    return d.cprice + "￥";
                },sort: true
        }
        ]]
        , id: 'testReload'
        , page: true
    });

    $('.demoTable .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

});


