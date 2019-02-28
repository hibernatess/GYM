const layer = layui.layer;
const table = layui.table;
const element = layui.element;

function getTreeNode() {
    var mid = $("#memu").val();
    $.getJSON("/GYM03/memu", {mid: mid}, function (data) {

        // console.log(data);
        layui.tree({
                elem: '#sidemenubar' //传入元素选择器
                , skin: 'sidebar'
                , nodes: data
                , click: function (node) {//点击tree菜单项的时候
                    var element = layui.element;
                    var exist = $("li[lay-id='" + node.id + "']").length;//判断是不是用重复的选项卡

                    if (exist > 0) {
                        element.tabChange('tabs', node.id);//切换到已有的选项卡

                    } else {
                        if (node.href != null && node.href.length > 0) {//判断是否需要新增选项卡;
                            element.tabAdd('tabs', {
                                title: node.name,
                                content: '<iframe scrolling="yes" frameborder="0"    width="99%" height="80%" src="' + node.href + '" style="color: #009688 "></iframe>'//支持传入html
                                ,
                                id: node.id
                            });
                            element.tabChange('tabs', node.id);//切换到已有的选项卡
                        }
                    }
                }

    });
})
}

// /**
//  *锁屏的方法
//  */
// $(function () {
//     getTreeNode();
//     if (window.sessionStorage.getItem("isLock") == "true") {
//         lockPage();
//     }
//     // 解锁
//     $("body").on("click", "#unlock", function () {
//
//         if ($(this).siblings("#lockPwd").val() == '') {
//             layer.msg('请输入解锁密码！');
//             $(this).siblings(".admin-header-lock-input").focus();
//         } else {
//             //验证密码是否正确
//             if ($(this).siblings(".admin-header-lock-input").val() == vue.user.usr_password) {
//                 window.sessionStorage.setItem("isLock", false);
//                 $(this).siblings(".admin-header-lock-input").val('');
//                 layer.closeAll("page");
//             } else {
//                 layer.msg('密码错误，请重新输入登录密码！');
//                 $(this).siblings(".admin-header-lock-input").val('').focus();
//             }
//         }
//     });
//     $(document).on('keydown', function () {
//         if (event.keyCode == 13) {
//             $("#unlock").click();
//         }
//     });
// })
//
// /**
//  * 退出登录
//  */
// function exit() {
//     $.getJSON("useraction_exitUser.action", function (msg) {
//         if (msg) {
//             layer.msg("退出系统成功", {icon: 1, time: 2000})
//             location.href = "login.html";
//         }
//     })
// }
//
// //锁屏
// function lockScreen() {
//     window.sessionStorage.setItem("isLock", true);
//     lockPage();
// }
//
// //锁屏的方法
// function lockPage() {
//     layer.open({
//         title: false,
//         area: ['1980', '1080'],
//         type: 1,
//         content: '<video class="video-player" preload="auto" autoplay="autoplay" loop="loop" data-height="1080" data-width="1980px" height="1080" width="1980px"> ' +
//             '<source src="images/login.mp4" type="video/mp4"> </video>' +
//             '<div class="lock-content"><div class="admin-header-lock" id="lock-box">' +
//             '<div class="admin-header-lock-img"><img src="images/timg.jpg"/></div>' +
//             '<div class="admin-header-lock-name" id="lockUserName">' + vue.user.usr_name + '</div>' +
//             '<div class="input_btn">' +
//             '<input type="password" class="admin-header-lock-input layui-input" autocomplete="off" placeholder="请输入密码解锁.." name="lockPwd" id="lockPwd" />' +
//             '<button class="layui-btn" id="unlock" style="background-color: #42bdf1">解锁</button>' +
//             '</div>' +
//             '</div></div>',
//         closeBtn: 0,
//         shade: 0.9
//     })
//     $(".admin-header-lock-input").focus();
// }
