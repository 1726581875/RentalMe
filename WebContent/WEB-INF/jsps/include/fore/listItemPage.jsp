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
<img id='imgSize1Imp' src="${picPath}${item.firstImage.pic}"  height="100" width="100" /><br>
	卖家信息:{item.User.username}<br>
	标题：${item.title}<br>租用价格：${item.basepayment}<br>
	<a href="${pageContext.request.contextPath}/itemDetailPage/${item.id}">查看详情</a>
</td>

      <c:if test="${s.index%6 ==5}">
      </tr>
      </c:if>
</c:forEach>
</table>
</div>
</body>
</html>