<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基础数据管理</title>
    <link href="layui/css/layui.css" media="all" rel="stylesheet" >
    <script src="layui/layui.js"></script>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>

<table class="layui-table" lay-skin="nob">
    <tr>
        <td><label class="layui-form-label">类别</label></td>
        <td> <input type="text" id='UserName' name="UserName"
                    lay-verify="required" placeholder="请输入操作者姓名" autocomplete="true"
                    class="layui-input"></td>
        <td><label class="layui-form-label">时间范围</label></td>
        <td> <input type="text" id='svalues' name="svalues"
                    lay-verify="required" placeholder="请输入数据值" autocomplete="true"
                    class="layui-input"></td>
        <td>  <button class="layui-btn" data-type="reload">查询</button></td>
    </tr>
</table>
<!--数据表格-->
<table class="layui-hide" id="dictionaries" lay-filter="dictionaries" lay-data="{id:'idTest'}"></table>
</body>
<script src="js/dictionaries.js"></script>
</html>
