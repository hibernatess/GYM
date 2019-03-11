<%--
  Created by IntelliJ IDEA.
  User: hhh
  Date: 2019/3/1
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--3.4--%>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../layui/layui.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <script type="text/javascript" src="../js/coachdetails.js"></script>
</head>
<body>
<div style="padding: 20px; background-color: #F2F2F2;">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <!-- 表格-->
                <table class="layui-hide" id="test" lay-filter="test"></table>
            </div>
        </div>
    </div>
</div>


<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">完成课程</a>
</script>



</body>
</html>
