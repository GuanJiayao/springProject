<%--
  Created by IntelliJ IDEA.
  User: zhangyao
  Date: 16-3-24
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/register" method="post">
    <input type="text" name="name"/>
    <input type="password" name="password"/>
    <input type="submit" value="注册">
</form>
</body>
</html>
