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
我的借出页, 列出一些订单,还有卖家的操作

<c:if test="${empty myRentalList}">难道你借牙刷了? 都没人借你的东西</c:if>
<c:if test="${!empty myRentalList}">
    <c:forEach items="${myRentalList}" var="order">
        <div>
            <img src="${picPath}${order.item.firstImage.pic}" height="100" width="100" />
             标题:${order.item.title }
             买家:${order.buyUser.username }
             状态:${order.status }
             
             操作:
             <c:if test="${order.status eq '卖家已取消' }"></c:if>
             <c:if test="${order.status eq '买家已取消' }"></c:if>
             <c:if test="${order.status eq '买家未付款' }"><a href="sellerCancelOrder/${order.id }">取消订单</a></c:if>
         <c:if test="${order.status eq '卖家未借出' }"><a href="sellerCancelOrder/${order.id }">取消订单</a></c:if>
         <c:if test="${order.status eq '买家未还' }"><a href="sellerConfirmOrder/${order.id }">已收到买家还的商品</a></c:if>
         <c:if test="${order.status eq '买家未付尾款' }">打电话催债呗</c:if>
         <c:if test="${order.status eq '未评价' }"><a href="addOrderReviewPage/${order.id }">去评价</a></c:if>
         <c:if test="${order.status eq '卖家已评价' }"></c:if>
         <c:if test="${order.status eq '买家已评价' }"><a href="addOrderReviewPage/${order.id }">去评价</a></c:if>
         <c:if test="${order.status eq '双方已评价' }"></c:if>
         
        </div>
    </c:forEach>
</c:if>
</body>
</html>