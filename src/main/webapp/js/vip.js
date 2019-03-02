// 我的课程
// <script>
// layui.use(['layer', 'form'], function(){
//var layer = layui.layer
//   ,form = layui.form;
// layer.msg("");
//
// });
// </script>

layui.use('table', function(){
    var table = layui.table;
    var    hid=document.getElementById("hid").value;
    table.render({
        elem: '#test'
        ,url:'/vip/mycum?hid='+hid
        ,cols: [[
            {field:'cname',  title: '课程名', sort: true}
            ,{field:'cattend',  title: '课程时间'}
            ,{field:'cprice',title: '价格', templet:function (d) {
                    return d.cprice+"￥";
                }, sort: true}
            ,{field:'jname',  title: '教练'}
        ]]
        ,page: true
    });
});

/* 点击图片触发 文件选择的click事件*/
function selectfile(){
    document.getElementById("btn_file").click();
}
/*
修改头像
 */
function upload(target) {
    var fileSize = 0;
    fileSize = target.files[0].size;
    var size = fileSize / 1024;
    if(size>3000){
        alert("附件不能大于1M");
        target.value="";
        return false;   //阻止submit提交
    }
    var name=target.value;
    var fileName = name.substring(name.lastIndexOf(".")+1).toLowerCase();
    if(fileName !="jpg" && fileName !="jpeg" && fileName !="pdf" && fileName !="png" && fileName !="dwg" && fileName !="gif" && fileName !="xls" && fileName !="xlsx" && fileName !="word" && fileName !="doc"&& fileName !="docx" && fileName !="txt"){
        alert("请选择图片格式文件上传(jpg,png,gif,dwg,pdf,gif等)！");
        target.value="";
        return false;   //阻止submit提交
    }else{
        document.getElementById("upimg").submit();
    }
}
/*
查询个人信息
 */
$(function () {
    $.ajax({
        type: "POST",
        url:  "/vip/vip",
        // async: false,
    });
});

