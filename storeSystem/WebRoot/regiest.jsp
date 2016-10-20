<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>注册页面</title>

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
        }
    </style>
</head>
<body>
<%@ taglib uri="/struts-tags" prefix="struts" %>
<div
        style="width: 100%; height: 100%; display: inline; position: absolute; margin-top: 0px;">
    <img src="back.jpg" style="width: 100%; height: 100%;"/>
</div>
<div
        style="display: inline; position: absolute; margin-top: 5%; margin-left: 30%;">
    <p style="font-size: 50px; font-family:'隶书'; color: #666666;">
        农产品仓库管理管理系统</p>

</div>
<div
        style="display: inline; position: absolute; margin-top: 20%; margin-left: 40%; width: 100%;">
    <form action="updateUser" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="userName"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td>角色</td>
                <td><select name="role">
                    <option value="0">操作员</option>
                    <option value="1">管理员</option>
                </select></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="登录"/> <input type="reset"
                                                             value="取消"/></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
