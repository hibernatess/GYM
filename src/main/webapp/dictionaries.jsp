<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基础数据管理</title>
    <link href="layui/css/layui.css" media="all" rel="stylesheet" >
    <script src="layui/layui.js"></script>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>



<!--搜索维度-->
<div class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">类别</label>
        <div class="layui-input-inline">
            <select class="layui-select" id="sname" name=sname>
            </select>
        </div>
        <label class="layui-form-label">数据值</label>
        <div class="layui-input-inline">
        <input type="text" id='svalues' name="svalues"
               lay-verify="required" placeholder="请输入数据值" autocomplete="true"
               class="layui-input">
        </div>
        <button class="layui-btn" data-type="reload">查询</button>
        <button class="layui-btn layui-btn-danger" data-type="add">新建</button>
    </div>
</div>

<!--数据表格-->
<table class="layui-hide" id="dictionaries" lay-filter="dictionaries" lay-data="{id:'idTest'}"></table>









</body>
<script src="js/dictionaries.js"></script>
</html>
