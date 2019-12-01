<%--
  Created by IntelliJ IDEA.
  User: HongB
  Date: 2019-12-01
  Time: 下午 07:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userAction2.action" method="post">
    用户名：<input type="text" name="user.username"><br>
    密码： <input type="password" name="user.password"><br>
    年龄：<input type="text" name="user.age"><br>
    工资：<input type="text" name="user.salary"/><br>
    生日：<input type="date" name="user.date"><br>
    <button type="submit">提交</button>
</form>
</body>
</html>
