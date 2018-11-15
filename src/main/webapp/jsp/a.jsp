<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>My JSP 'a.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/bootstrap.min.css">
</head>

<body>
	<div class="container">
		<table class="table table-striped table-bordered table-bordered">
			<tr>
				<td>id</td>
				<td>username</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list}" var="v">
				<tr>
					<td>${v.id}</td>
					<td>${v.username}</td>
					<td><button type="button" class="btn btn-primary btn-sm">增加</button>
						<button type="button" class="btn btn-danger btn-sm">删除</button></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<nav>
	<ul class="pagination">
		<li><a href="/maven01/page/${pg.pageNum-1}" aria-label="Previous">
				<span aria-hidden="true">&laquo;</span>
		</a></li>
		<li><a href="/maven01/page/${pg.pageNum}">${pg.pageNum}</a></li>
		<li><a href="/maven01/page/${pg.pageNum+1}" aria-label="Next"> <span
				aria-hidden="true">&raquo;</span>
		</a></li>
	</ul>
	</nav>
</body>
</html>
