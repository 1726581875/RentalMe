<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="./include/fore/header.jsp"%>
    <c:if test="${!empty msg}">
        <span>${msg }</span>
    </c:if>
    错误页面
<%@include file="./include/fore/footer.jsp"%>
