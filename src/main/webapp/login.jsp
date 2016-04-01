<%--
  Created by IntelliJ IDEA.
  User: zhangyao
  Date: 16-4-1
  Time: 下午8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/user/login" method="post">
    <input type="text" name="name"/>
    <input type="password" name="password"/>
    <input type="submit" value="登陆"/>


</form>

</body>
</html>
