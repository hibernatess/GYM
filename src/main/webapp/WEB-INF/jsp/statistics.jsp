<%--
  Created by IntelliJ IDEA.
  User: LQ
  Date: 2019/3/4
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>算钱的</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>
    <script src="../../js/jquery-3.3.1.js"></script>
    <script src="../../js/statistics.js"></script>
</head>
<body>

<div class="demoTable">
    <span>搜索用户：</span>
    <div class="layui-inline">
        <input class="layui-input" name="hname" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">搜索</button>
</div>
<table class="layui-hide" id="test" lay-filter="demo"></table>

<script type="text/html" id="d1">
    <button class="layui-btn layui-btn-warm">详情</button>
</script>

</body>
</html>
