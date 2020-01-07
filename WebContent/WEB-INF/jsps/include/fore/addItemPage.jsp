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
    <c:if test="${!empty msg}">
        <span>${msg }</span>
    </c:if>

<script>

</script>
物品发布页表单
</br>
<form action="${pageContext.request.contextPath}/addItem" method="post" onsubmit="return submitCheck(this)">
    标题:<input name="title" value=""></br>
    类别:<select> <c:forEach items="${categoryList}" var="Item">
     <option value="${Item.id}">${Item.name}</option>
    </c:forEach></select> 
    内容:<input name="contact" value=""></br>
    租价:<input name="basePayment" type="number" value="">
    <select name="countType">
        <option value="0">小时</option>
        <option value="1">天</option>
    </select></br>
    最短出租时间<input name="minTime" type="number" value=""></br>
    最长出租时间<input name="maxTime" type="number" value=""></br>
    续租价格<input name="overTimeMoney" type="number" value=""></br>
    押金:<input name="deposit" type="number" value=""></br>
    可续借:
    <select name="renewable">
        <option value="0">不可续借</option>
        <option value="1">可续借</option>
    </select>
    <input type="submit" value="提交">
</form>
</body>
</html>