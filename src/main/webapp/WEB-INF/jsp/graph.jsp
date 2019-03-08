<%--
  Created by IntelliJ IDEA.
  User: LQ
  Date: 2019/3/8
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>统计图</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <script src="../../echarts/echarts.js"></script>
    <script src="../../layui/layui.js"></script>
    <script src="../../js/jquery-3.3.1.js"></script>
    <%--<script src="../../js/graph.js"></script>--%>
</head>
<body>
<div id="main" style="width: 100%;height:100%;"></div>

<script>

function get(list){

    var myChart = echarts.init(document.getElementById('main'));
    var option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                crossStyle: {
                    color: '#999'
                }
            }
        },
        toolbox: {
            feature: {
                dataView: {show: true, readOnly: false},
                magicType: {show: true, type: ['line', 'bar']},
                restore: {show: true},
                saveAsImage: {show: true}
            }
        },
        legend: {
            data: ['课程人数', '课程收入']
        },
        xAxis: [
            {
                type: 'category',
                data:list[0],
                axisPointer: {
                    type: 'shadow',
                    width: '20px'
                }
            }
        ],
        yAxis: [
            {
                type: 'value',
                name: '人数',
                min: 0,
                max: 30,
                interval: 5,
                axisLabel: {
                    formatter: '{value} 个'
                }
            },
            {
                type: 'value',
                name: '收入',
                min: 0,
                max: 50000,
                interval: 3000,
                axisLabel: {
                    formatter: '{value} ￥'
                }
            }
        ],
        series: [

            {
                name: '课程人数',
                type: 'bar',
                color: '#030303',
                data: list[1]
            },
            {
                name: '课程收入',
                type: 'line',
                yAxisIndex: 1,
                data: list[2]
            }
        ]
    };
    myChart.setOption(option);
}


    $(function () {
        $.ajax({
            url: '/selectsta/selectGraph',                   　　  //地址
            type: 'get',　　　　 //请求方式 还可以是get type不可写成Type 不让会导致数据发送不过去,使用post无法接受
            dataType: 'json',　　　　//返回格式 ,还可以是json
            async: false,　　　 　　 //同步异步 ,一般为异步flase
            //参数值
            success: function (data) {　　//请求成功时的处理
                var obj=[];
                var cname=new Array();
                var sum=new Array();
                var cprice=new Array();
                $.each(data,function(idx,obj) {
                    cname[idx]=obj.cname;
                    sum[idx]=obj.sum;
                    cprice[idx]=obj.cprice;
                });
                obj.push(cname);
                obj.push(sum);
                obj.push(cprice);

                get(obj);
            }
        })
        ;
    });

</script>
</body>
</html>
