<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/2/25
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的信息</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../layui/layui.js"></script>
    <script>
        layui.use(['layer', 'form'], function(){
            var layer = layui.layer
                ,form = layui.form;

            layer.msg('Test succeed');
        });
    </script>

    <script>
        layui.use('element', function(){
            var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

            //监听导航点击
            element.on('nav(curriculum)', function(elem){
                //console.log(elem)
                layer.msg(elem.text());
            });
        });
    </script>
</head>

<body>


<div style="width: 300px;height:40%;float: left;margin-left: 250px;margin-top:20px;">
    <%--<blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 20%">--%>
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
         <legend style="margin-left:33%">个人资料</legend>
    </fieldset>

    <form>
        <div class="layui-inline" style="margin-left:30%">
        <img src="/img/3.jpg" class="layui-circle">
        <hr class="layui-bg-orange">
        </div>
    </form>
        <div style="text-align:center;width: 100px;margin-left: 30%;">
       <h2 style="margin-left: 12%">小明</h2><br>
            <h3 style="margin-left: 12%">贤心</h3><br>
            <h3 style="margin-left: 12%">北极科考站</h3>
        </div>
        <hr class="layui-bg-orange">
    <div style="margin-top: 8%;">

        <div style="text-align:center;width: 70px;height: 50px;float: left;">
            <p>13</p><br>
            <h3>年&nbsp;龄</h3>
        </div>

        <div  style="text-align:center;width: 70px;height: 50px;margin-top: -2px;float: left;margin-left: 13%;">
            <p>男</p><br>
            <h3>性&nbsp;别</h3>
        </div>

        <div  style="text-align:center;width: 70px;height: 50px;float: left;margin-left: 10%;">
            <p>17674941300</p><br>
            <h3>&nbsp;联&nbsp;系&nbsp;电&nbsp;话</h3>
        </div>

    </div>

    <div style="margin-top: 40%;height: 200px;width: 300px;">

        <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
            <legend style="margin-left: 30%">我的课程</legend>
        </fieldset>

        <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="curriculum" style="margin-right: 10px;width: 300px;background-color: #9F9F9F">
            <li class="layui-nav-item ">
                <a href="javascript:;">课程名称</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">课程一</a></dd>
                    <dd><a href="javascript:;">课程二</a></dd>
                    <dd><a href="javascript:;">课程三</a></dd>
                </dl>
            </li>


        </ul>


    </div>
</div>

<div style="float: left;margin-left: 100px;">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top:50px;">
        <legend style="margin-left: 40%">我的信息</legend>
    </fieldset>
    <form class="layui-form" action="" lay-filter="example" >
        <div class="layui-form-item">

            <div class="layui-inline">
                <label class="layui-form-label">用&nbsp;&nbsp;户&nbsp;&nbsp;名</label>
                <div class="layui-input-inline">
                    <input type="text" name="username" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input">
                </div>
            </div>

            <div class="layui-inline">
                <label class="layui-form-label">真实姓名</label>
                <div class="layui-input-block">
                    <input type="text" value="小明" name="realname"  readonly placeholder="请输入真实姓名" autocomplete="off" class="layui-input">
                </div>
            </div>

        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">年龄</label>
            <div class="layui-input-inline">
                <input type="text" name="age" value="13" lay-verify="required" placeholder="请输入年龄" autocomplete="off" class="layui-input">
            </div>
        </div>

            <div class="layui-form-item">
                <label class="layui-form-label">密码</label>
                <div class="layui-input-inline">
                    <input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
            </div>



        <div class="layui-form-item">
            <label class="layui-form-label">性&nbsp;&nbsp;&nbsp;&nbsp;别</label>
            <div class="layui-input-block">
                <select name="sex" lay-filter="aihao" lay-verify="required">
                    <option value=""></option>
                    <option value="0">男</option>
                    <option value="1">女</option>
                </select>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-form-label">联系电话</label>
                <div class="layui-input-block">
                    <input type="tel" name="phone" placeholder="请输入联系电话" lay-verify="required|phone" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">详细地址</label>
            <div class="layui-input-block">
                <input type="text" name="address" value="北极科考站" lay-verify="title" autocomplete="off" placeholder="请输入详细地址" class="layui-input">
            </div>
        </div>




        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">个人简介</label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" class="layui-textarea" name="desc"></textarea>
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn layui-btn-warm layui-btn-radius" lay-submit="" lay-filter="demo1" style="margin-left: 28%">更新信息</button>
            </div>
        </div>
    </form>
</div>





<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });
        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '至少得5个字符';
                }
            }
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });


        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });
        //表单初始赋值
        form.val('example', {
            "username": "贤心" // "name": "value"
            ,"password": "123456"
            ,"interest": 1
            ,"like[write]": true //复选框选中状态
            ,"close": true //开关状态
            ,"sex": "女"
            ,"desc": "我aini"
        })


    });
</script>




</body>
</html>
