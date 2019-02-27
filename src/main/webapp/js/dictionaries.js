layui.use(['table', 'layer'], function () {
    var table = layui.table, layer = layui.layer;

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



    });


})