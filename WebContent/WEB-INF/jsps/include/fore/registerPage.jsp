<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录- 同城租借</title>

<script type="text/javascript">
function userNameCheck(){
	
    //取到输入的用户名
    var username = $("#username").val();
	$("#nameTips").html("");
	var regm="^[A-z0-9\\u4e00-\\u9fa5]*$";
	
	if(username.value !=""&&!username.match(regm))
		{
		var str = "*格式不对";
        $("#nameTips").html(str);
		return false;
		}	
	
	

     var data = {}
     data["username"] = username;	  		  
	  $.ajax({
		  type:'POST',/* 请求类型为post */
		 url:'./UserNameAjax',
		 contentType: 'application/json;charset=UTF-8',/* 向服务器提出的请求类型 text*/
		 dataType:'json',
		  data:JSON.stringify(data),/* 请求的数据 */
		  success: function(result){/* 回调函数 */
			//把json格式的字符串转换成json对象
      		if(result.flag==1){

      		}
      		else{
      			var str = "*用户名已存在";
      			$("#nameTips").html(str);
		        }
		  }
		  
	  });

}

function userPhone(){	
    var phone = $("#phone").val();

	$("#phoneTips").html("");
	
	var regm = /^[0-9]+$/;
	if(phone !=""&&!phone.match(regm))
		{
			var str = "*格式不对";
	        $("#phoneTips").html(str);
		
		return false;
		}	
	
   
     
        var data = {}
        data["phone"] = phone;	
	  $.ajax({
		  type:'POST',/* 请求类型为post */
		 url:'./UserPhoneAjax',
		 contentType: 'application/json;charset=UTF-8',/* 向服务器提出的请求类型 text*/
		 dataType:'json',
		 data:JSON.stringify(data),/* 请求的数据 */
		  success: function(data){/* 回调函数 */
			//把json格式的字符串转换成json对象
		
      		if(data.flag==1){
      		}
      		else{
      			
      			var str = "*该电话已注册";
		        $("#phoneTips").html(str);}
		  }
		  
	  });
	  
}
	  
function checkPassword(){
	       $("#passwordTips").html("");
			var regm =/^[0-9a-zA-Z]*$/;
			if(document.all.password.value !=""&&!document.all.password.value.match(regm))
				{
				var str = "*密码格式不对";
		        $("#passwordTips").html(str);
		        document.all.password.focus();
				return false;
				}	
		}
	  
function checkPasswordeq(){
	      $("#passwordTips2").html("");
			if(document.all.password.value != document.all.password2.value)
				{
				var str = "*确认密码不对应";
		        $("#passwordTips2").html(str);
		        document.all.password.focus();
				return false;
				}	
		}		
		
</script>


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
         <h2 style="text-align: center;">注册页面</h2>
				
					<form action="${picPath}/insertUser" method="post" class="layui-form"
						style="margin-top: 20px;">
						<div class="layui-form-item">
							<label class="layui-form-label">手机号</label>
							<div class="layui-input-inline">
								<input  maxlength="11" type="text" name="phone" id="phone" onchange="userPhone()" placeholder="请输入手机号"
									autocomplete="off" class="layui-input"><span id="phoneTips" style="color: red"></span>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">用户名</label>
							<div class="layui-input-inline">
								<input type="text" name="username" id="username" onchange="userNameCheck()"
								 required lay-verify="required|phone" placeholder="请输入用户名"
									autocomplete="off" class="layui-input"><span id="nameTips" style="color: red"></span>
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">密码</label>
							<div class="layui-input-inline">
								<input type="password" name="password" id="password" onchange="checkPassword()" 
								required	lay-verify="required|phone" placeholder="请输入密码"
									autocomplete="off" class="layui-input"><span id="passwordTips" style="color:red"></span>
							</div>
						</div>
                         <div class="layui-form-item">
							<label class="layui-form-label">确认密码</label>
							<div class="layui-input-inline">
								<input type="password" name="password2" id="password2" onchange="checkPasswordeq()" required
									lay-verify="required|phone" placeholder="请输入密码"
									autocomplete="off" class="layui-input"><span id="passwordTips2" style="color:red"></span>
							</div>
						</div>

						<div class="layui-form-item">
							<div class="layui-input-block">
								<input type="hidden" name="_config" value='{"reload":1}'>
								<button class="layui-btn btn-main">提交</button>
								&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
								&nbsp;&nbsp; &nbsp;&nbsp; 
							</div>
						</div>

					</form>
					<a
						style="float: right; text-decoration: underline; padding: 0px 5px;"
						href="${picPath}/forehome"> <img
						style="width: 18px; margin-right: 4px;"
						src="https://zu.xitek.com/static/res/www/houh/img/back.png">返回
					</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
