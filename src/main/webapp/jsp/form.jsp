<%--
  Created by IntelliJ IDEA.
  User: HongB
  Date: 2019-12-01
  Time: 下午 06:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/submit.action">
    用户名 <input type="text" name="name"/>
    密码<input type="text" name="password"/>
    <button type="submit">提交</button>
</form>
</body>
</html>
