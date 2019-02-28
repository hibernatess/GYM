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
    <script type="text/javascript" src="../js/vue.js"></script>
    <script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../layui/layui.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css" media="all">
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
                        <input type="text" class="layui-input" name="jnames" id="jnames" placeholder="请输入教练姓名"
                               autocomplete="off">
                    </td>
                    <td>
                        <button class="layui-btn" data-type="reload" id="btn">搜索</button>
                        <button class="layui-btn layui-btn-danger" id="add">增加</button>
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

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del">删除</a>
</script>

    <!--弹出层-->
    <!--编辑客户信息-->
    <div style="margin:3px; display: none" id="box1" target="customer">
        <div class="layui-row layui-col-space15">
            <div class="layui-col-md12">
                <div class="layui-card">
                    <form class="layui-form" id="coachform">
                        <table class="layui-table">
                            <tr>
                                <td>教练名字</td>
                                <td>
                                    <input type="text" style="width: 346px;" placeholder="输入教练名字"
                                           lay-verify="required" class="layui-input"
                                           id="jname" name="jname">
                                </td>
                                <td>性别</td>
                                <td>
                                    <div class="layui-input-block">
                                    <input type="radio" name="sex" value="男" id="nan" title="男" checked>
                                    <input type="radio" name="sex" value="女" id="nv" title="女">
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>教练类型</td>
                                <td>
                                    <select lay-verify="required" lay-search="" id="sid" name="sid">

                                    </select>
                                </td>
                                <td>密码</td>
                                <td>
                                    <input type="text" style="width: 346px;" placeholder="输入教练登陆的密码"
                                                     lay-verify="required" class="layui-input"
                                                     id="jpwd" name="jpwd">
                                </td>
                            </tr>
                            <tr>
                                <td>年龄</td>
                                <td>
                                    <input type="text" style="width: 346px;" placeholder="输入教练年龄"
                                           lay-verify="required" class="layui-input"
                                           id="jage" name="jage">
                                </td>
                                <td>入职时间</td>
                                <td>
                                     <input type="text" class="layui-input" id="jregister" placeholder="yyyy-MM-dd">
                                </td>
                            </tr>
                            <tr>
                                <td>住址</td>
                                <td>
                                    <input type="text" style="width: 346px;" placeholder="输入住址"
                                           lay-verify="required" class="layui-input"
                                           id="jaddress" name="jaddress">
                                </td>
                                <td>课程</td>
                                <td>
                                    <select lay-verify="required" lay-search="" id="cid" name="cid">
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>添加教练的经历</td>
                                <td colspan="3">
                                      <textarea placeholder="请输入内容" class="layui-textarea" id="jimages"></textarea>
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
            </div>
        </div>
    </div>


</span>
</body>
</html>
