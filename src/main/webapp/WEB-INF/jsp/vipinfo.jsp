<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/6
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>
    <script src="../../js/vipinfo.js"></script>
    <style>
        tr{
            font-family: 华文行楷;
        }
        span{
            font-family: 华文行楷;
        }
        h2{
            font-family: 华文行楷;
        }
    </style>
</head>
<body>
<div class="demoTable">
    <span>用户名：</span>
    <div class="layui-inline">
        <input class="layui-input" name="cname" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload"><h2>搜索</h2></button>
</div>
<table class="layui-hide" id="test" lay-filter="demo"></table>
</body>
<script type="text/html" id="d1">
    <button class="layui-btn  layui-btn-danger" id="del" lay-event="del"><h2>注销</h2></button>
</script>
</html>
