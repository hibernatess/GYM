
layui.use(['form','table'], function(){
    var table = layui.table,
     form = layui.form;
    table.render({
        elem: '#test'
        ,url:'/selectcum/selectcum'
        ,cols: [[
            {field:'cname',  title: '课程名', sort: true}
            ,{field:'cattend',title: '课程时间'}
            ,{field:'cprice',title: '价格',templet:function (d) {
                    return d.cprice+"￥";
                },sort: true}
            ,{fixed: 'right',title: '操作',toolbar: '#d1',align: 'center',width :250}
        ]]
        ,id: 'testReload'
        ,page: true
    });
    //选择教练
    table.on('tool(demo)', function(obj){
        var data = obj.data;
     if(obj.event === 'sectcoach'){
         // layer.alert(data.cprice)
            // layer.alert('编辑行：<br>'+ JSON.stringify(data))
         layer.open({
             title:'选择教练',
             area: ['700px', '400px'],
             type: 1,
             content: $('#secoach') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
         });
         form.val('example', {
             "cname":data.cname,
             "cprice":'价格:'+data.cprice+'￥'
         });


     }
    });
//搜素课程
    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload');
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                        cname:demoReload.val()
                }
            });
        }
    };
    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

});

//获取全部的教练
$.getJSON("/coach/getCoachs",{
},function (data) {
    var html = "";
    html+="<option value=\"\">请选择</option>"
    // 返回处理的方法
    $.each(data, function (index, item) {
        html += "<option value=" + item.jid + ">" + item.jname
            + "</option>";
    });
    $('#scoach').html(html);
});
