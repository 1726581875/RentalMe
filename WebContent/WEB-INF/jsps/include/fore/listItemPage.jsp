<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无忌租赁</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://zu.xitek.com/static/res/www/houh/css/style.css"
	rel="stylesheet" />
<link href="https://zu.xitek.com/static/res/www/houh/css/iconfont.css"
	rel="stylesheet" />
<link href="https://zu.xitek.com/static/res/www/houh/css/animate.css"
	rel="stylesheet" />
<link
	href="https://zu.xitek.com/static/res/www/houh/layui/css/layui.css"
	rel="stylesheet" />
<style type="text/css">
.btn-main {
	background-color: #333;
}

.main-btn {
	cursor: pointer;
	background: #333;
	color: #fff;
	border-radius: 6px;
	padding: 0 30px;
	height: 35px;
	line-height: 35px;
}

.cart_num {
	padding: 0px 7px;
	position: absolute;
	top: 8px;
	display: inline-block;
	height: 20px;
	line-height: 20px;
	text-align: center;
	background: #c00;
	border-radius: 20px;
	vertical-align: bottom;
	font-size: 12px;
}
</style>


<link href="https://zu.xitek.com/static/res/www/houh/css/page.css"
	rel="stylesheet" />
<style type="text/css">
.highlight {
	color: #0083ff;
}

.autocomplete-suggestions {
	overflow-y: auto;
	background: white;
	border: 1px solid black;
	border-radius: 5px;
	margin-top: 4px;
	box-shadow: 0 0 5px 0px #adadad;
	width: 560px !important;
}

.autocomplete-suggestion {
	padding: 15px 10px;
	box-sizing: border-box;
}

.autocomplete-selected {
	background: #535353;
	color: white;
	cursor: pointer;
}

.autocomplete-suggestions::-webkit-scrollbar { /*滚动条整体样式*/
	width: 10px; /*高宽分别对应横竖滚动条的尺寸*/
	height: 1px;
}

.autocomplete-suggestions::-webkit-scrollbar-thumb { /*滚动条里面小方块*/
	border-radius: 10px;
	-webkit-box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.2);
	background: #535353;
}

.autocomplete-suggestions::-webkit-scrollbar-track { /*滚动条里面轨道*/
	-webkit-box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.2);
	border-radius: 10px;
	background: #EDEDED;
}
</style>
<script
	src="https://zu.xitek.com/static/res/www/houh/js/jquery-3.4.1.min.js"></script>
<script src="https://zu.xitek.com/static/res/www/houh/layui/layui.js"></script>
<script src="https://zu.xitek.com/static/res/www/houh/js/jquery.form.js"></script>
<script src="https://zu.xitek.com/static/res/www/houh/js/common.js?v=2"></script>
</head>
<body>
	<div>
		<%-- <table>
			<c:forEach items="${itemList}" var="item" varStatus="s">

				<c:if test="${s.index%6 ==0}">
					<tr>
				</c:if>
				<td><img id='imgSize1Imp'
					src="${picPath}${item.firstImage.pic}" height="100" width="100" /><br>
					卖家信息:<a href="${picPath}/otheruserDetailPage/${item.uid}">${item.ownUser.username}</a><br>
					标题：${item.title}<br>租用价格：${item.basepayment}<br> <a
					href="${picPath}/itemDetailPage/${item.id}">查看详情</a></td>

				<c:if test="${s.index%6 ==5}">
					</tr>
				</c:if>
			</c:forEach>
		</table> --%>
	</div>
</body>
</html>