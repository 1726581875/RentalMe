<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="${picPath}/login" method="post">
    <input name="phone" value="">
    <input name="password" value="">
    <input type="submit">
</form>
<a href="${pageContext.request.contextPath}/registerPage">注册</a>
</body>
</html>