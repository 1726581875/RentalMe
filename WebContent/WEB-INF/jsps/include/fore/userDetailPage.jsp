<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
用户的名字.
简介.
----用户发布的(提交一条异步查询请求)----
<%@include file="listItemPage.jsp"%>
----查看该用户的评价(异步)-----
<%@include file="listReviewPage.jsp"%>
</body>
</html>