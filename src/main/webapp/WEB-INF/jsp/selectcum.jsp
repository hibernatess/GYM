<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/1
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>选课列表</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>
    <script src="../../js/jquery-3.3.1.js"></script>
    <script src="../../js/selectcum.js"></script>
    <style>
        tr{
            font-family: 华文行楷;
        }
        span{
            font-family: 华文行楷;
        }
    </style>
</head>
<body>
<div class="demoTable">
    <span>搜索课程：</span>
    <div class="layui-inline">
        <input class="layui-input" name="cname" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
<table class="layui-hide" id="test"></table>

<script type="text/html" id="d1">
    <button class="layui-btn layui-btn-warm">选择教练</button>
</script>



</body>
</html>
