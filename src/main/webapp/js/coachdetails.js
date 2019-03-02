layui.use(['form','table','layer','laydate'] ,function () {
    var table = layui.table;
    var $ = layui.$;
    var form = layui.form
        , layedit = layui.layedit
        , laydate = layui.laydate;
    var layer = layui.layer;

    table.render({
        elem: '#test'
        , url: '../coach/getcoachandvip'
        , title: '销售机会管理表'
        , cols: [[
            {field: 'realname', title: '会员名', width: '18%'}
            , {field: 'hsex', title: '性别', width: '18%'}
            , {field: 'hage', title: '年龄', width: '18%'}
            , {field: 'svalues', title: '会员级别', width: '16%'}
            , {field: 'reservedata', title: '预约时间', width: '14%'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: '15%'}
        ]]
        , page: true
        , id: "testReload"
    });

    table.on('tool(test)', function(obj) {
        // lay-filter="对应的值"
        var data = obj.data; // 获得当前行数据
        var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; // 获得当前行 tr 的DOM对象
        if(layEvent=="edit"){
            layer.confirm('是否确定?',{icon:1,title:'提示'}, function(index) {
                //修改中间表状态
                $.ajaxSettings.async=true
                $.getJSON("../coach/updatemiddle",{
                    sta:0,
                    id:data.mid
                })
                table.reload('testReload', {//重载表格
                    page: {
                        curr: 1
                        // 重新从第 1 页开始
                    }
                })
                layer.close(index);
            })
        }
    })

})