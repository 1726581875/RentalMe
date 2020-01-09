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
我的名字:${user.username}.我的余额:${user.money}.</br>
 简介:${user.userDetail.brief}
真实姓名:${user.userDetail.realname}
身份证号:${user.userDetail.idnumber}<br>
修改信息 //估计是页面跳转
管理我的订单
----我发布的(提交一条异步查询请求)----
<%@include file="listItemPage.jsp"%>
----查看我的评价(异步)-----
<%@include file="listReviewPage.jsp"%>
 
 <a href="${picPath}/myOrdersPage">我的订单</a>
</div>
</body>
</html>