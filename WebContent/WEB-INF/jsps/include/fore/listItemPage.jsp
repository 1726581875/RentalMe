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
<div>
<table>
<c:forEach items="${itemList}" var="item" varStatus="s">

      <c:if test="${s.index%6 ==0}">
      <tr>
      </c:if> 
<td>
<img id='imgSize1Imp' src="${picPath}${item.firstImage.pic}"  height="100" width="100" />
	卖家信息:卖家电话：${item.ownUser.phone}.卖家用户名：${item.ownUser.username}
	<a href="${pageContext.request.contextPath}/itemDetail/iid = ${item.id}"></a>
</td>

      <c:if test="${s.index%6 ==5}">
      </tr>
      </c:if>
</c:forEach>
</table>
</div>
</body>
</html>