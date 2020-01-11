<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/RentalMe/js/jquery.js"></script>
<script src="/RentalMe/js/jquery.form.js"></script>
<c:set var="picPath" value="http://localhost:8080/RentalMe"></c:set>

</head>
<body>
	<header class="header">
		<div class="box-flex box-width flex-between">
			<h1>
				<a href="${picPath}/forehome"> <img
					src="https://zu.xitek.com/static/res/www/houh/img/logo-header.png"
					style="height: 18px;">
				</a>
			</h1>
			<nav class="nav">
				<!-- 
					<a href="https://zu.xitek.com/houhou/main/index/rel/menu" >
						首页
					</a>
					 -->
				<c:if test="${empty user}">
					<a href="${picPath}/loginPage">请登录</a>
					<a href="${picPath}/registerPage">免费注册</a>
				</c:if>
               <c:if test="${!empty user}">
				<a href="${picPath}/myDetailPage">${user.username} 个人中心 </a> 
				 余额:${user.money}
				 <a href="${picPath}/addItemPage">发布租物</a>
				<a href="${picPath}/forelogout">退出</a>
				</c:if>
			</nav>
		</div>
	</header>
</body>
</html>