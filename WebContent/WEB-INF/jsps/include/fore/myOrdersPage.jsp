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
<c:if test="${empty myOrdersList}">这里啥都没有你还来看</c:if>
<c:if test="${!empty myOrdersList}">
    <c:forEach items="${myOrdersList}" var="order">
        <div>
            <img src="${picPath}${order.item.firstImage.pic}" height="100" width="100" />
             标题:${order.item.title }
             卖家:${order.ownUser.username }
             状态:${order.status }
             
             操作:
             <c:if test="${order.status eq '卖家已取消' }"></c:if>
             <c:if test="${order.status eq '买家已取消' }"></c:if>
             <c:if test="${order.status eq '买家未付款' }"><a href="buyerPayOrder/${order.id }">去付款</a>|<a href="buyerCancelOrder/${order.id }">取消订单</a></c:if>
         <c:if test="${order.status eq '卖家未借出' }"><a href="buyerConfirmOrder/${order.id }">我已收到卖家的货</a></c:if>
         <c:if test="${order.status eq '买家未还' }"><c:if test="${order.item.renewable == 1 }"><a href="buyerRenewOrder/${order.id }">续借</a></c:if></c:if>
         <c:if test="${order.status eq '买家未付尾款' }"><a href="payBalance/${order.id }">去付尾款</a></c:if>
         <c:if test="${order.status eq '未评价' }"><a href="addOrderReviewPage/${order.id }">去评价</a></c:if>
         <c:if test="${order.status eq '买家已评价' }"></c:if>
         <c:if test="${order.status eq '卖家已评价' }"><a href="addOrderReviewPage/${order.id }">去评价</a></c:if>
         <c:if test="${order.status eq '双方已评价' }"></c:if>
         
        </div>
    </c:forEach>
</c:if>

</body>
</html>