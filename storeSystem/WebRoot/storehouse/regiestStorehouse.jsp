<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
		body{margin: 0;padding: 0;}
		.top{width:100%;height:40px; background-color:blue;
		text-align:center;font-size: 36px;font-family: "华文新魏";color: white; }
		.main{width:100%;height: 100%;background-color:pink; }
		.content{width:100%;margin-top: 50px;float: left;}
		form{width: 50%;margin: 0 auto;}
		table{margin: 0 auto;}
		.msg{color: red;}
	</style>
  </head>
  

  <body><center>
  	<div class="top">新增仓库</div>
	 <div class="main">
	   	<div class="content">
	   	<form action="addUser" method="post">
	   		<table>
	   			<tr>
	   				<td>仓库编号</td>
	   				<td><input type="text" name="id"/></td>
	   				<td><s:fielderror fieldName="id" cssClass="msg"></s:fielderror></td>
	   			</tr>
	   			<tr>
	   				<td>仓库名称</td>
	   				<td><input type="text" name="userName" /></td>
	   				<td><s:fielderror fieldName="userName" cssClass="msg"></s:fielderror></td>
	   			</tr>
	   			<tr>
	   				<td>仓库说明</td>
	   				<td><input type="password" name="password"/></td>
	   				<td><s:fielderror fieldName="password" cssClass="msg"></s:fielderror></td>
	   			</tr>
	   			<tr>
	   				<td></td>
	   				<td>
	   				<input type="submit" value="新增"/>
	   				<input type="reset" value="重置"/>
	   				<a href="main.jsp">返回</a>
	   				</td>
	   			</tr>
	   		</table>
		</form>
		</div>
	</div>
 </center> </body>
</html>
