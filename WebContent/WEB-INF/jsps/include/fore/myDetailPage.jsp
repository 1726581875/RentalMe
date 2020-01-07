<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
我的名字:${user.username }.我的余额:${user.money}.</br>
简介<div class="">${user.brief}.</div>
修改信息
管理我的订单
----我发布的(提交一条异步查询请求)----
<%@include file="listItemPage.jsp"%>
----查看我的评价(异步)-----
<%@include file="listReviewPage.jsp"%>
 
</div>
</body>
</html>