<%--
  Created by IntelliJ IDEA.
  User: 1925
  Date: 2017/12/18
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/user/register">
    <input type="text" name="userName" ><br><br>
    <input type="password" name="password"><br><br>
    <button type="submit" id="loginbtn">注册</button>
</form>
</body>
</html>
