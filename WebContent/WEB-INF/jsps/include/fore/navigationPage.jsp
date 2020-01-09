<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<a href="${picPath}">logo</a>.定位.下拉选择分类搜索.
    <c:if test="${!empty user}">
        <a href="${picPath}/myDetailPage">${user.username}</a>
        <a href="forelogout">退出</a>
    </c:if>
    <c:if test="${empty user}">
        <a href="loginPage">请登录</a>
        <a href="registerPage">免费注册</a>
    </c:if>