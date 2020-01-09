<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
-----下单的订单信息------
<a href="${picPath}/buyerPayOrder/${orders.id }">去付款</a>|<a href="${picPath}/buyerCancelOrder/${orders.id }">取消订单</a>
</body>
</html>