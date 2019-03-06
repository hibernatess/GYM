<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/5
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../layui/css/layui.css" media="all">
    <script type="text/javascript" src="../../layui/layui.js"></script>
    <script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
</head>
<body>

<!--显示数据的表格-->
<div class="demoTable">
    <div class=layui-form>
        <table class="layui-table" id="LAY_table_user" lay-filter="user"
               lay-data="{id: 'idTest'}">
        </table>
    </div>
</div>


<!--按钮菜单-->
<script type="text/html" id="barDemo">
    <%--<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;
        //时间范围
        laydate.render({
            elem: '#cattend'
            , type: 'time'
            , range: true
        });
    });
</script>
<script src="../../js/damage.js"></script>
</body>
</html>
