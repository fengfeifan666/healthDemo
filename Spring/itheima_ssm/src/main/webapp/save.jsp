<%--
  Created by IntelliJ IDEA.
  User: feifan
  Date: 2020/8/28
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加账户信息表单</h1>
    <from name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
        账户名称:<input type="text" name="name"><br>
        账户金额:<input type="text" name="money"><br>
        <input type="submit" name="保存"><br>
    </from>
</body>
</html>
