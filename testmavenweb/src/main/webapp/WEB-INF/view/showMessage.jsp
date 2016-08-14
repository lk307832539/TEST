<%--
  Created by IntelliJ IDEA.
  User: LK
  Date: 2016/8/14
  Time: 17:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>getUserMessage</title>
</head>
<body>
<c:forEach items="${list}" var="user">
    <div>${user.id}&${user.userName}&${user.password}</div>
</c:forEach>
</body>
</html>
