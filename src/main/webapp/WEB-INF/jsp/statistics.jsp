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


<!--弹出层-->
<div class="site-text" style="margin: 5%; display: none" id="box1"
     target="test123">
    <form class="layui-form layui-form-pane" onsubmit="return false" id="users">
        <div class="layui-form-item">
            <label class="layui-form-label">课程名称</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="cname" name=cname
                >
            </div>
            <br>
            <label class="layui-form-label">课程时间</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="cattend"
                       name=cattend placeholder=" - "><br>
            </div>

            <label class="layui-form-label">选择教练</label>
            <div class="layui-input-block">
                <select class="layui-select" id="jid" name=jid>
                </select>
            </div>
            <br>
            <label class="layui-form-label"> 是否收费</label>
            <div class="layui-input-block">
                <select class="layui-select" id="sid" name="sid">
                    <option value="1">
                        是
                    </option>
                    <option value="0">
                        否
                    </option>
                </select>
            </div>
            <br>
            <label class="layui-form-label"> 课程价格</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="cprice"
                       name=cprice><br>
            </div>
        </div>
    </form>
</div>

<script type="text/html" id="d1" name="d1">
    <button class="layui-btn layui-btn-warm" lay-event="info">详情</button>
</script>

</body>
</html>
