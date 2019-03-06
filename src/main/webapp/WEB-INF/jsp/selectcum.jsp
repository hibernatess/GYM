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
        h3{
            font-family: 华文行楷;
        }
        div{
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
<table class="layui-hide" id="test" lay-filter="demo"></table>

<script type="text/html" id="d1">
    <button class="layui-btn layui-btn-warm"  lay-event="sectcoach">选择教练</button>
</script>





<div style="width: 600px;height: 300px;display: none " id="secoach" >
    <form class="layui-form" action="" lay-filter="example">

        <div class="layui-form-item">

            <div class="layui-inline">
            <label class="layui-form-label"><h3>课&nbsp;程&nbsp;名</h3></label>
            <div class="layui-input-inline">
                <input   name="cname" readonly  class="layui-input">
            </div>
            </div>

            <div class="layui-inline">
            <label class="layui-form-label"><h3>选&nbsp;择&nbsp;教&nbsp;练&nbsp;</h3></label>
            <div class="layui-input-block">
            <h3><select lay-verify="required"  id="scoach" name="scoach"></select></h3>
            </div>
            </div>

        </div>

        <div style="margin-left: 30%;width: 300px;height: 200px;text-align: center;">
            <img src="../../img/timg.jpg"  style="width: 200px;height: 200px">
            <h1><input type="text" readonly style="width: 150px;color: #e60000;border: 0;margin-top: 6%;margin-left: 25%" class="layui-input" name="cprice"></h1>
        </div>
    </form>


</div>

</body>

</html>
