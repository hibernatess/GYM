<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/25
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--3.4--%>
<head>

    <title>Title</title>
    <link rel="stylesheet" href="layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="css/login.css" media="all"/>
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<style type="text/css">
    *{
        margin: 0px;
        padding: 0px;
    }
    video{
        /*position: fixed;*/
        /*right: 0px;*/
        /*bottom: 0px;*/
        /*min-width: 100%;*/
        /*min-height: 100%;*/
        /*height: auto;*/
        /*width: auto;*/
        /*加滤镜*/
        /*-webkit-filter: grayscale(100%);*/



        /*filter:grayscale(100%);*/
    }
    source{
        /*min-width: 100%;*/
        /*min-height: 100%;*/
        /*height: auto;*/
        /*width: auto;*/
    }
</style>
<body>
<video class="video-player" preload="auto" autoplay="autoplay" loop="loop" data-height="980" data-width="1024" width="auto" height="auto">
    <source src="mp4/login.mp4" type="video/mp4">
</video>
<div class="video_mask"></div>
<div class="login">
    <h1>登录</h1>
    <form class="layui-form">
        <div class="layui-form-item">
            <input class="layui-input" name="username" placeholder="用户名" value="" lay-verify="required"
                   lay-verType="tips" type="text" autocomplete="off">
        </div>
        <div class="layui-form-item">
            <input class="layui-input" name="password" placeholder="密码" value="" lay-verify="required"
                   lay-verType="tips" type="password" autocomplete="off">
        </div>
        <button class="layui-btn login_btn" lay-submit="" lay-filter="login">登录</button>
    </form>
</div>
<script type="text/javascript" src="layui/layui.js"></script>
<script>
    layui.use(['form', 'layer'], function () {
        var form = layui.form,
            layer = layui.layer
        $ = layui.jquery;
        //登录按钮事件
        form.on("submit(login)", function (data) {
            $.getJSON("/login", {
                name: data.field.username,
                pword: data.field.password
            }, function (data) {
                if (data) {
                    layer.msg("登录成功", {
                        time: 600
                    });
                    parent.location.href = 'index.jsp';
                }else{
                    layer.msg("账户密码错误", {
                        time: 600
                    });
                }
            });
            return false;
        })
    });

</script>
</body>
</html>