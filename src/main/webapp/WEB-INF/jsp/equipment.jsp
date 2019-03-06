<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/4
  Time: 16:18
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
<!--搜索维度-->
<div class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">器材名</label>
        <div class="layui-input-inline">
            <input type="text" id='qname' name="qname"
                   lay-verify="required" placeholder="请输入器材名" autocomplete="true"
                   class="layui-input">
        </div>
        <button class="layui-btn" data-type="reload">查询</button>
        <button class="layui-btn layui-btn-danger" data-type="add">新建</button>
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
<div class="site-text" style="margin: 5%; display: none" id="box1"
     target="test123">
    <form class="layui-form layui-form-pane" onsubmit="return false" id="users">
        <input type="hidden" class="layui-input" id="qid" name=qid
        >
        <div class="layui-form-item">
            <label class="layui-form-label">器材名称</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="name" name=qname
                >
            </div>
            <br>
            <label class="layui-form-label">类型</label>
            <div class="layui-input-block">
                <select class="layui-select" id="sid" name="sid">
                    <option value="1">
                        一级
                    </option>
                    <option value="2">
                        二级
                    </option>
                    <option value="3">
                        三级
                    </option>
                </select>
            </div>
            <br>
            <label class="layui-form-label"> 是否损坏</label>
            <div class="layui-input-block">
                <select class="layui-select" id="qdamage" name="qdamage">
                    <option value="1">
                        是
                    </option>
                    <option value="0">
                        否
                    </option>
                </select>
            </div>
            <br>
            <label class="layui-form-label"> 器材价格</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="qprice"
                       name=qprice><br>
            </div>
            <label class="layui-form-label">数量</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="qsum"
                       name=qsum ><br>
            </div>
        </div>
    </form>
</div>

<!--弹出层-->
<div class="site-text" style="margin: 5%; display: none" id="box2"
     target="test123">
    <form class="layui-form layui-form-pane" onsubmit="return false" id="users2">
        <%--<input type="hidden" class="layui-input" id="qhid" name=qhid--%>
        <%-->--%>
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
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
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
<script src="../../js/equipment.js"></script>
</body>
</html>
