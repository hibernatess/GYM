<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
        .new-btn-login {
            background-color: #02aaf1;
            color: #FFFFFF;
            font-weight: bold;
            border: none;
            width: 200px;
            height: 30px;
            border-radius: 5px;
            font-size: 16px;
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
    <form class="layui-form" action="/vip/pay" lay-filter="example" method="post">
<input type="text" name="cid" id="cid">

        <div class="layui-form-item">
            <label class="layui-form-label"><h2>订单号</h2></label>
            <div class="layui-input-block">
                <h2><input  readonly style="color: #e60000;border: 0;" class="layui-input" id="WIDout_trade_no" name="WIDout_trade_no"></h2>
            </div>
        </div>



        <div class="layui-form-item">

            <div class="layui-inline">
            <label class="layui-form-label"><h2>订单名</h2></label>
                <div class="layui-input-inline">
                <input   name="WIDsubject" id="WIDsubject" readonly  class="layui-input">
                </div>
            </div>

            <div class="layui-inline">
            <label class="layui-form-label"><h2>选教练</h2></label>
                <div class="layui-input-inline">
            <h3><select lay-verify="required"  id="scoach" name="scoach"></select></h3>
                </div>
            </div>

        </div>

        <div class="layui-form-item">
            <label class="layui-form-label"><h2>价格:</h2></label>
            <div class="layui-input-block">
        <h2><input  readonly style="color: #e60000;border: 0;" class="layui-input" id="WIDtotal_amount" name="WIDtotal_amount"></h2>
            </div>
            </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
        <button class="layui-btn" lay-submit="" lay-filter="demo1">去付款</button>
            </div>
        </div>
    </form>


</div>




</body>

</html>
