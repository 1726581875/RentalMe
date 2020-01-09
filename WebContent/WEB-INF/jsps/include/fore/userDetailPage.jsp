<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
名字:${user.username}</br>
 简介:${user.userDetail.brief}<br>
真实姓名:${user.userDetail.realname}<br>
其他人的评价: <br>
<table>
<tr>
<td>用户</td>
<td>评价</td>
<td>满意度</td>
<td>评价时间</td>
</tr>
<c:forEach items="${targetReviewList}" var="review">
<tr>
<td>${review.id}</td>
<td>${review.content}</td>
<c:if test="${review.review} == 0"><td>差评</td></c:if>
<c:if test="${review.review} == 1"><td>好评</td></c:if>
<td>${review.submitDate}</td>
</tr>
</c:forEach>
</table><br>
</div>
</body>
</html>