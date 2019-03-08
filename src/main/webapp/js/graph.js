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
        data:['课程人数','课程收入']
    },
    xAxis: [
        {
            type: 'category',
            data: ['瑜伽课','器材课','体操课','减脂课','增肌课'],
            axisPointer: {
                type: 'shadow',
                width:'20px'
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
            name:'课程人数',
            type:'bar',
            color:'#030303',

            data:[2, 5]
        },
        {
            name:'课程收入',
            type:'line',
            yAxisIndex: 1,
            data:[2000, 5000]
        }
    ]
};

myChart.setOption(option);