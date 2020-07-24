<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<link href="https://zu.xitek.com/static/res/www/houh/css/page.css" rel="stylesheet" />
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
		    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery-3.4.1.min.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/layui/layui.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery.form.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/common.js?v=2"></script>
        	</head>
<body>



	<!--searchbox-->
	<div class="main-search text-c">
		<div class="box-width">
			<h3></h3>
			<form action="" method="get" id="form">
				<section class="box-flex flex-between">
					<input type="text" placeholder="输入用品关键字" id="keyword"
						name="keyword" value="" />
					<button type="submit" id='search'
						style="cursor: pointer; outline: none;">
						<span class="iconfont icon-sousuo"></span> 搜索
					</button>
					<a name="box"></a>
				</section>
			</form>
		</div>
	</div>
	<!-- 主体 -->
	<div class="mainbox box-width box-flex flex-between animated pulse ">
		<!--aside-->
		<aside class="aside">
			<div class="box-flex aside-title flex-between">
				<span>查看全部</span> <a>所有物品&nbsp;&gt;&gt;</a>
			</div>
			<div class="aside-title">
				<span> </span>
			</div>
		
			<section class="modular">
				<a class="pitchon">
					全部 </a>
					
				<c:if test="${!empty msg}">
					<span>${msg }</span>
				</c:if>
				<c:forEach items="${categoryList}" var="Item">
					<a href="${picPath}/listByCategory/${Item.id}">${Item.name}</a>
				</c:forEach>
			</section>




		</aside>


		<!--content-->
		<div class="main-content">
			<div class="reading-area">
				<span id="current-brand">全品牌</span> <span id="current-brand">全类型</span>
				<span id="current-brand">全场景</span>
			</div>

			<ul class="camera-list">
				
		<c:forEach items="${itemList}" var="item" varStatus="s">		
				
				<li class="box-flex"><a
					href=""
					target="_blank" class="img-camera"> <img id='imgSize1Imp'
					src="${picPath}${item.firstImage.pic}" height="100" width="100" />
				</a>
					<div class="camera-info">
						<h5>
							<a href=""
								target="_blank"> ${item.title}</a>
						</h5>
						<div class="box-flex flex-between price-list">
							<div class="gray">
								<p>
									租金: &nbsp;&nbsp; <font class="red">${item.basepayment}</font> 
								</p>
								<p>
									卖家信息: &nbsp;&nbsp; <font class="red"><a href="${picPath}/otheruserDetailPage/${item.uid}">${item.ownUser.username}</a></font> 
								</p>
							</div>
						<a href="${picPath}/itemDetailPage/${item.id}">查看详情</a>
							</a>
						</div>
					</div></li>
				</c:forEach>
				
		</div>

	</div>
</body>
