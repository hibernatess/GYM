layui.use(['table', 'layer','form'], function () {
    var table = layui.table, layer = layui.layer,form=layui.form;

    table.render({
        elem: "#dictionaries",
        url: "/dict/getdictionaries",
        limit: 10
        , limits: [5, 10, 20, 30]
        , cellMinWidth: 80
        , cols: [[
            {field: 'sid', title: 'id', width: 80, sort: true}
            ,{field:'sname',title:'类别'}
            ,{field:'svalues',title:'数据值'}
            ,{field:'sflag',title:'可编辑',templet:function(d){
                if(d.sflag==0){
                    return "<span style=color: #c00;>可编辑</span>"
                }else{
                    return "<span style=color: #c00;>不可编辑</span>"
                }
                }}
        ]]
        , page: true
        , id: "testReload"


    });


    var $ = layui.$, active = {//datatype
        //查询的方法
        reload: function () {
            // 执行重载
            table.reload('testReload', {
                page: {
                    curr: 1
                },
                where: {
                    key:'sname',
                    sname:$("#sname").val(),
                    key: 'svalues',
                    svalues: $("#svalues").val()
                }
            });
        }
    };


    //绑定事件
    $('.layui-form .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });

})


/**
 * 下拉框加载数据类型
 */

function   loadSNmae(){

    $.ajaxSettings.async = false;
    $.getJSON('dict/getdict', function (data) {
        var html = "<option value=''>请选择</option>";
        // 返回处理的方法
        $.each(data, function (index, item) {
            html += "<option value=" + item.sname + ">" + item.sname
                + "</option>";
        });
        $('#sname').html(html);
    })

}

$(function () {
    loadSNmae();
})