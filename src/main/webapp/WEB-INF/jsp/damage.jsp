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

    <div class="layui-form">
        <div class="layui-form-item">
            <button class="layui-btn layui-btn-danger" data-type="damage">损坏</button>
        </div>
    </div>
<!--显示数据的表格-->
<div class="demoTable">
    <div class=layui-form>
        <table class="layui-table" id="LAY_table_user" lay-filter="user"
               lay-data="{id: 'idTest'}">
        </table>
    </div>
</div>

<!--弹出层-->
<div class="site-text" style="margin: 5%; display: none" id="box2"
     target="test123">
    <form class="layui-form layui-form-pane" onsubmit="return false" id="users2">
        <label class="layui-form-label">器材类型</label>
        <div class="layui-input-block">
            <select class="layui-select" id="did" name="did">
            </select>
        </div>
        <br>
        <label class="layui-form-label"> 赔偿价格</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input" id="qhprice"
                   name=qhprice><br>
        </div>
        <label class="layui-form-label">损坏原因</label>
        <div class="layui-input-block">
            <input type="text" class="layui-input" id="qhremark"
                   name=qhremark ><br>
        </div>
    </form>
</div>

<!--按钮菜单-->
<script type="text/html" id="barDemo">
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
