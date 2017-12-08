<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
    <%--<script type="text/javascript" src="/js/jquery/jquery-3.2.1.min.js" />--%>
    <script type="text/javascript" src="<%=basePath%>/js/jquery/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="<%=basePath%>/js/user/login.js"></script>
</head>
<body>
<%--<%@ include file="/WEB-INF/top.jsp"%>--%>
<form method="post" id="form" action="">
    <table>
        <tr>
            <th><span class="rq">*</span><label>用户名:</label></th>
            <td><input type="text" name="userName" id="userName" class="px" size="25" maxlength="15" /></td>
        </tr>
        <tr>
            <th><span class="rq">*</span><label>密&nbsp; &nbsp;码:</label></th>
            <td><input type="password" class="px" id="password" name="password" size="25" maxlength="15" /></td>
        </tr>
        <%--<tr >
            <th><span class="rq">*</span><label for="ZODRdi">验证码:</label></th>
            <td style="height: 56px;">
                <input style="width: 125px;margin-top: -20px;" type="text" name="yanzhengma" id="yanzhengma" class="px"  size="4" maxlength="4"  onblur="isyanzhengma();"/>
                <img src="${path}/yanzhengma/index.do" alt="验证码" height="30px;" id="yanzhengmaimg" onclick="updateyanzhengma();"/>
            </td>
            <td class="tipcol" colspan="3">
                <i id="yanzhengmaspan" class="p_tip"></i>
            </td>
        </tr>--%>
    </table>
    <div id="div1">
        <button type="button" id="login">登录</button>
        <%--<span id="btn"> <em>&nbsp;</em> <input class="btn" id="loginbtn" type="button" value="登录" onclick="submitlogin();"/> </span>--%>
    </div>
</form>
<%--<%@ include file="/WEB-INF/foot.jsp"%>--%>


</body>
</html>