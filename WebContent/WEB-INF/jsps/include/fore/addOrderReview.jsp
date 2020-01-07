<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<table>
<form action="${pageContext.request.contextPath}/addOrderReview.do">
<input type="hidden" name="oid" id="oid" value="${oid}">
<select>
<option value="1">好评</option>
<option	value="0" >差评</option>
</select><br>
<input type="text" name="content" id="content"><br>
<input type="submit" value="确认提交">
</form>
</table>
</body>
</html>