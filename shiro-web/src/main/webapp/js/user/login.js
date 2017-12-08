jQuery(document).ready(function () {
    //登录操作
    $('#login').click(function () {
        var userName = $('#userName').val();
        var password = $('#password').val();

        var data = {userName:userName, password:password};

        $.ajax({
            url: "shiro/succ.jsp",
            // data: data,
            type: "post",
            dataType: "text",
            success: function (result) {
                if (result == 'succ'){
                    alert("登录成功");
                } else {
                    alert("登录失败")
                }
            },
            error: function (e) {
                alert("error" + e.message);
                layer.msg('请看后台Java控制台，是否报错，确定已经配置数据库和Redis', new Function());
            }
        });
    });
});