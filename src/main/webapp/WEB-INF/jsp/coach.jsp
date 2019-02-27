<%--
  Created by IntelliJ IDEA.
  User: hhh
  Date: 2019/2/26
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../layui/layui.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
    <script type="text/javascript" src="../js/vue.js"></script>
    <script type="text/javascript" src="../js/coach.js"></script>
</head>
<body>
<span id="app">
<div style="padding: 20px; background-color: #F2F2F2;">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <table class="layui-table">
                <tr>
                    <td>教练姓名</td>
                    <td>
                        <input type="text" class="layui-input" name="jnames" id="jnames" placeholder="请输入教练姓名" autocomplete="off">
                    </td>
                    <td>
                        <button class="layui-btn" data-type="reload" id="btn">搜索</button>
                        <button class="layui-btn layui-btn-danger"  id="add">增加</button>
                    </td>
                </tr>
                </table>
            </div>
        </div>
    </div>
    <div class="layui-row layui-col-space15">
    <div class="layui-col-md12">
        <div class="layui-card">
            <!-- 表格-->
            <table class="layui-hide" id="test" lay-filter="test"></table>
        </div>
    </div>
</div>
</div>
</span>
</body>
</html>
