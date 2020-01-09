<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <c:if test="${!empty msg}">
        <span>${msg }</span>
    </c:if>
	<c:forEach items="${categoryList}" var="Item">
	<a href="${picPath}/listByCategory/${Item.id}">${Item.name}</a>
    </c:forEach>
<body>
<div>navigation.全部分类.xx分类.xx分类</div>
</body>
</html>