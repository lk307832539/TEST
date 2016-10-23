<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>库存管理</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        body {
            margin: 0;
            padding: 0;
            background-color: pink;
        }

        .t {
            width: 100%;
            text-align: center;
            font-family: "隶书";
            font-size: 60px;
            color: blue;
        }

        .main {
            width: 100%;
            margin: 0 auto;
            text-align: center;
            font-size: 24px;
        }

        .top {
            width: 100%;
            height: 40px;
            background-color: blue;
            text-align: center;
            font-size: 36px;
            font-family: "华文新魏";
            color: white;
        }

        table {
            width: 100%;
            text-align: center;
        }
    </style>
    <script>
        function del() {
            var msg = "您确定要删除该记录吗？";
            if (confirm(msg) == true) {
                return true;
            }
            else
                return false;
        }
    </script>
</head>

<body>
<div class="t">操作员管理</div>
<br>
<br>
<br>
<div class="main">
    <div class="left" style="width: 20%;float: left;">
        <div><a href="login.jsp">返回登录</a></div>
        <br><br>
    </div>
    <div class="right" style="width: 78%;float: left;">
        <div class="top">操作员管理</div>
        <div>
            <table border="1">
                <tr>
                    <td>Id</td>
                    <td>用户名</td>
                    <td>密码</td>
                    <td colspan="2">操作</td>
                </tr>
                <s:if test="${userList}!=null">
                    <c:forEach items="${userList}" var="user">
                        <tr>
                            <td>${user.userId}</td>
                            <td>${user.username}</td>
                            <td>${user.password}</td>
                            <td><a href="delUser?userId=${user.userId}" onclick="javascript:return del();">删除</a>
                                <a href="updateUserInfo?userId=${user.userId}">修改</a></td>
                        </tr>
                    </c:forEach>
                </s:if>
            </table>
            <a href="regiest.jsp">新增操作员</a>
            <a href="../index.jsp">返回</a>
        </div>
    </div>
${a}
</div>

</body>
</html>





