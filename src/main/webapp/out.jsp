<%@ page import="com.gym.ssm.entity.peng.Login" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/3/6
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>


</body>
</html>
