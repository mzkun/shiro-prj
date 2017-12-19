<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <%@ include file="meta.jsp"%>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/user/login.js"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/login">
    <input type="text" name="userName" ><br><br>
    <input type="password" name="password"><br><br>
    <input type="checkbox" name="rememberMe" value="true"/>Remember Me?<br>
    <button type="submit" id="loginbtn">登录</button>
</form>
<div>
    <button href="javascript:void(0);" type="button" id="registerbtn" onclick="registerbtn()">注册</button>
</div>
</body>
</html>