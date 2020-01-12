<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 
<meta name="keywords" content=" 无忌租赁,相机租赁,镜头租赁.信用租赁,摄影器材,器材库,色影无忌">
<meta name="description"
	content=" 无忌租赁为摄影爱好者，做一个可以无所顾忌租借摄影器材的地方，满足你的所有拍摄需要。佳能、尼康、索尼、宾得等器材（机身、镜头、附件等）应有尽有。信用免押，全国顺丰，同城极速，价优专业。">
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


<style>
/*
body{background: #f7f7f7;}
.footer{display:none;}*/
.box {
	width: 440px;
	margin: 0 auto;
	background: white;
}

.box-content {
	padding: 40px 10px;
	border-radius: 5px;
	box-shadow: 0px 0px 11px 5px #d6d6d6;
}

.box-title {
	text-align: center;
	padding-bottom: 10px;
}

.login-title {
	font-size: 20px;
}

body {
	background-color: #f2f2f2;
}
</style>
</head>

<body>

	<div class="layui-row ">
		<div class="layui-col-md12 " style="margin: 100px 0px 200px 0px;">
			<div class="box">
				<div class='box-content  '>
					<div class="box-title">
						<img
							src="https://zu.xitek.com/static/res/www/houh/img/logo-index.png"
							style="width: 100px;">
					</div>
         <h2 style="text-align: center;">充值页面</h2>
				
				
				<img alt="" src="upload/511.jpg" style="display: block;">
					<form action="${picPath}/recharge" method="post" class="layui-form"
						style="margin-top: 20px;">
						<div class="layui-form-item">
							<label class="layui-form-label">充值金额</label>
							<div class="layui-input-inline">
								<input  maxlength="11" type="text" name="money" id="money" onchange="userPhone()" placeholder="请输入金额"
									autocomplete="off" class="layui-input"><span id="phoneTips" style="color: red"></span>
							</div>
						</div>
						
						
						

						<div class="layui-form-item">
							<div class="layui-input-block">
								<input type="hidden" name="_config" value='{"reload":1}'>
								<button class="layui-btn btn-main">充值</button>
								&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
								&nbsp;&nbsp; &nbsp;&nbsp; 
							</div>
						</div>

					</form>
				
				</div>
			</div>
		</div>
	</div>

</body>



</html>