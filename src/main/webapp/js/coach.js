layui.use(['form','table','layer'] ,function () {
    var table = layui.table;
    var $ = layui.$;
    var form = layui.form
        , layedit = layui.layedit
        , laydate = layui.laydate;
    var layer = layui.layer;
    table.render({
        elem: '#test'
        , url: '../coach/getcoach'
        , title: '销售机会管理表'
        , cols: [[
            {field: 'jid', title: '编号', width: '6%', edit: 'text'}
            , {field: 'jname', title: '教练姓名', width: '10%', edit: 'text'}
            , {field: 'jsex', title: '性别', width: '18%', edit: 'text'}
            , {field: 'svalues', title: '教练类型', width: '10%'}
            , {field: 'jage', title: '年龄', width: '18%'}
            , {field: 'jaddress', title: '地址', width: '10%'}
            , {field: 'cname', title: '课程', width: '10%'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: '18%'}
        ]]
        , page: true
        , id: "testReload"
    });
    var $ = layui.$, active = {
        reload: function () {
            //多个条件的查询
            var jname = $('#jnames').val();
            // 执行重载
            table.reload('testReload', {
                where: {
                    jname: jname,
                },
                page: {
                    curr: 1
                    // 重新从第 1 页开始
                }
            });
        }
    };
    /**
     * 点击查询按钮触发的事件
     */
    $('#btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

})