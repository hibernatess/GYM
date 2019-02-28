

layui.use(['form','table','layer','laydate'] ,function () {
    var table = layui.table;
    var $ = layui.$;
    var form = layui.form
        , layedit = layui.layedit
        , laydate = layui.laydate;
    var layer = layui.layer;
    //时间选择器
    laydate.render({
        elem: '#jregister'
    });

    table.render({
        elem: '#test'
        , url: '../coach/getcoach'
        , title: '销售机会管理表'
        , cols: [[
            {field: 'jid', title: '编号', width: '6%'}
            , {field: 'jname', title: '教练姓名', width: '10%'}
            , {field: 'jsex', title: '性别', width: '13%',templet: '<span>{{d.jsex=="0"? "男":"女"}}</span>'}
            , {field: 'svalues', title: '教练类型', width: '10%'}
            , {field: 'jage', title: '年龄', width: '13%'}
            , {field: 'jaddress', title: '地址', width: '10%'}
            , {field: 'cname', title: '课程', width: '10%'}
            , {field: 'jflag', title: '是否预约', width: '10%',templet: '<span>{{d.jflag=="0"? "否":"是"}}</span>'}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: '18%'}
        ]]
        , page: true
        , id: "testReload"
    });
    var $ = layui.$, active = {
        reload: function () {
            //多个条件的查询
            var jname = $('#jnames').val();
            // 执行重载
            table.reload('testReload', {
                where: {
                    jname: jname,
                },
                page: {
                    curr: 1
                    // 重新从第 1 页开始
                }
            });
        }
    };
    /**
     * 点击查询按钮触发的事件
     */
    $('#btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });


    $('#add').on('click', function () {
        layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: true
            ,area: ['1000px', '400px']
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,btnAlign: 'c'
            ,moveType: 0 //拖拽模式，0或者1
            ,content: $("#box1")
            ,btn: ['确定', '取消']
            ,success: function(layero,index){
                form.render('select');
            },yes:function (index,layero) {
                var sex=null;
            if($('input:radio[name="sex"]:checked').val()=='男'){
                sex=0;
            }else{
                sex=1
            }
            $.getJSON("../coach/addcoach",{
                jname:$("#jname").val(),
                jsex:sex,
                sid:$("#sid").find("option:selected").val(),
                jpwd:$("#jpwd").val(),
                jage:$("#jage").val(),
                jregister:$("#jregister").val(),
                jaddress:$("#jaddress").val(),
                cid:$("#cid").find("option:selected").val(),
                jimages:$("#jimages").val(),
                jflag:0,
                jurid:1
            },function (data) {
                layer.close(index)
                table.reload('testReload', {//重载表格
                    page: {
                        curr: 1
                        // 重新从第 1 页开始
                    }
                })
            })
            },btn2:function (index, layero) {
                layer.close(index);//关闭弹出层
                $("#coachform")[0].reset()//重置form
            }, cancel: function (index, layero) {//关闭执行的函数
                layer.close(index);//关闭弹出层
                $("#coachform")[0].reset()
            }
        });
    });
    /**
     * 表格的按钮
     */
    table.on('tool(test)', function(obj) {
        // lay-filter="对应的值"
        var data = obj.data; // 获得当前行数据
        var layEvent = obj.event; // 获得 lay-event 对应的值findmanager（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; // 获得当前行 tr 的DOM对象
        if(layEvent=="del"){//删除
            layer.confirm('确定要删除吗?',{icon:3,title:'提示'}, function(index) {
                $.getJSON("../coach/deletecoach",{
                        jid:data.jid
                },function (data) {
                    layer.close(index);
                    table.reload('testReload', {//重载表格
                        page: {
                            curr: 1
                            // 重新从第 1 页开始
                        }
                    })
                })
            })
        }else if(layEvent=="edit"){
            layer.open({
                type: 1
                ,title: false //不显示标题栏
                ,closeBtn: true
                ,area: ['1000px', '400px']
                ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                ,btnAlign: 'c'
                ,moveType: 0 //拖拽模式，0或者1
                ,content: $("#box1")
                ,btn: ['确定', '取消']
                ,success: function(layero,index){
                    $("#jname").val(data.jname)
                    if(data.jsex==0){
                        $("#nan").attr("checked",true);
                        $("#nv").attr("checked",false);
                    }else{
                        $("#nv").attr("checked",true);
                        $("#nan").attr("checked",false);
                    }
                    form.render('radio');
                    $("#sid").val(data.sid)
                    $("#cid").val(data.cid)
                    form.render();
                    $("#jpwd").val(data.jpwd)
                    $("#jage").val(data.jage)
                    $("#jregister").val(data.jregister)
                    $("#jaddress").val(data.jaddress)
                    $("#jimages").val(data.jimages)
                },yes:function (index,layero) {
                    var sex=null;
                    if($('input:radio[name="sex"]:checked').val()=='男'){
                        sex=0;
                    }else{
                        sex=1
                    }
                    $.getJSON("../coach/updatecoach",{
                        jid:data.jid,
                        jname:$("#jname").val(),
                        jsex:sex,
                        sid:$("#sid").find("option:selected").val(),
                        jpwd:$("#jpwd").val(),
                        jage:$("#jage").val(),
                        jregister:$("#jregister").val(),
                        jaddress:$("#jaddress").val(),
                        cid:$("#cid").find("option:selected").val(),
                        jimages:$("#jimages").val(),
                        jflag:0,
                        jurid:1
                    },function (data) {
                        layer.close(index)
                        table.reload('testReload', {//重载表格
                            page: {
                                curr: 1
                                // 重新从第 1 页开始
                            }
                        })
                    })
                },btn2:function (index, layero) {
                    layer.close(index);//关闭弹出层
                    $("#coachform")[0].reset()//重置form
                }, cancel: function (index, layero) {//关闭执行的函数
                    layer.close(index);//关闭弹出层
                    $("#coachform")[0].reset()
                }
            });
        }
    })
})

/**
 *查询教练的类别
 * @param str
 * @returns {*}
 */
function listdicit(){
    $.ajaxSettings.async=false;
    $.getJSON("../dict/getdicts",{
        sname:'教练'
    },function (data) {
        var html = "";
        html+="<option value=\"\">请选择</option>"
        // 返回处理的方法
        $.each(data, function (index, item) {
            html += "<option value=" + item.sid + ">" + item.svalues
                + "</option>";
        });
        $('#sid').html(html);
    })
}

/**
 * 查询出课程
 * @returns {*}
 */
function listcurr(){
    $.ajaxSettings.async=false;
    $.getJSON("../curriculum/getcurr",function (data) {
        var html = "";
        html+="<option value=\"\">请选择</option>"
        // 返回处理的方法
        $.each(data, function (index, item) {
            html += "<option value=" + item.cid + ">" + item.cname
                + "</option>";
        });
        $('#cid').html(html);
    })
}

$(function () {
    listcurr()
    listdicit()
})