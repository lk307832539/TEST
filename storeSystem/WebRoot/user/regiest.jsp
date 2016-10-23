<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>新增用户</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
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

        .top {
            width: 100%;
            height: 40px;
            background-color: blue;
            text-align: center;
            font-size: 36px;
            font-family: "华文新魏";
            color: white;
        }

        .main {
            width: 100%;
            height: 100%;
            background-color: pink;
        }

        .content {
            width: 100%;
            margin-top: 50px;
            float: left;
        }

        form {
            width: 50%;
            margin: 0 auto;
        }

        table {
            margin: 0 auto;
        }

        .msg {
            color: red;
        }
    </style>
</head>


<body>
<div class="top">新增用户</div>
<div class="main">
    <div class="content">
        <form action="addUser" method="post">
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
                    <td><input type="submit" value="确认"/>
                        <input type="reset" value="取消"/></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
