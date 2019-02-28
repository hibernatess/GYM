<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>基础数据管理</title>
    <link href="../../layui/css/layui.css" media="all" rel="stylesheet" >
    <link href="../../resource/css/autocomplete.css" media="all" rel="stylesheet" >
    <script src="../../js/jquery-3.3.1.js"></script>
    <script src="../../layui/layui.js"></script>
</head>
<body>



<!--搜索维度-->
<div class="layui-form">
    <div class="layui-form-item">
        <label class="layui-form-label">类别</label>
        <div class="layui-input-inline">
            <select class="layui-select"  id="sname" name=sname>
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


<!--弹出层-->
<div class="site-text" style="margin: 5%; display: none" id="box1"
     target="test123">

    <form class="layui-form " onsubmit="return false" id="users">
        <div class="layui-form-item">
            <label class="layui-form-label">类别</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" name="insname" id="insname"  lay-verify="required" placeholder="请输入类别" autocomplete="true">
            </div>
            <br>
            <label class="layui-form-label">属性值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="stpye"
                       name=stpye placeholder="请输入属性值"><br>
            </div>

            <label class="layui-form-label">数据值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="insvalues"
                       name=insvalues placeholder="请输入显示值">
            </div>
            <br>
            <label class="layui-form-label">可编辑</label>
            <div class="layui-input-block">
                <input type="checkbox" name="sflag" id="sflag" value="0" lay-skin="switch" lay-text="ON|OFF" >
            </div>
        </div>
    </form>

</div>


<!--弹出层-->
<div class="site-text" style="margin: 5%; display: none" id="box2"
     target="test123">

    <form class="layui-form " onsubmit="return false" id="editusers">
        <div class="layui-form-item">
            <label class="layui-form-label">类别</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" name="editsname" id="editsname"  lay-verify="required" placeholder="请输入类别" autocomplete="true">
            </div>
            <br>
            <label class="layui-form-label">属性值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="editstpye"
                       name=editstpye placeholder="请输入属性值"><br>
            </div>

            <label class="layui-form-label">数据值</label>
            <div class="layui-input-block">
                <input type="text" class="layui-input" id="editsvalues"
                       name=editsvalues placeholder="请输入显示值">
            </div>
            <br>
        </div>
    </form>

</div>



</body>
<script type="text/html" id="barDemo">
    {{#  if(d.sflag ==0){ }}
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
    {{#  } }}
</script>

<script src="../../js/dictionaries.js"></script>
</html>
