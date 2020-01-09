<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>商品id:${item.id}</td>
<td>标题：${item.title}</td>
<td>内容：${item.contact}</td>
<td>基础付款：${item.basepayment}</td>
<!-- itemimages.pic 存的是相对路径 -->
<td>
<img id='imgSize1ImgSrc' src="${picPath }${item.firstImage.pic}"  height="100" width="100" />
</td>
<!-- 多个图片轮播 -->
</tr>
  <tr>
<c:forEach items="${item.itemimages}" var="itemimages1">
<td><img id='imgSize1Imp' src="${picPath}${itemimages1.pic}"  height="100" width="100" /></td>
</c:forEach>
</tr>  
<tr>卖家电话：${item.ownUser.phone}.卖家用户名：${item.ownUser.username}</tr>
</table>
<a href="${picPath}/orderItem/${item.id}">下单</a>

</body>
</html>