<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</script>
<script type="text/javascript">
function userNameCheck(){	
	$("#nameTips").html("");
	var regm="^[A-z0-9\\u4e00-\\u9fa5]*$";
	
	if(document.all.username.value !=""&&!document.all.username.value.match(regm))
		{
		var str = "*格式不对";
        $("#nameTips").html(str);
		form.phone.focus();
		return false;
		}	
	
	
    //取到输入的用户名
     var username = document.all.username.value;
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
	
	$("#phoneTips").html("");
	
	var regm = /^[0-9]+$/;
	if(document.all.phone.value !=""&&!document.all.phone.value.match(regm))
		{
			var str = "*格式不对";
	        $("#phoneTips").html(str);
		document.all.phone.focus();
		return false;
		}	
	
    //取到输入的用户名
     var phone = document.all.phone.value;
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

</head>
<body>
<span>${msg}</span><br>
<form action="${picPath}/insertUser" method="post">
电话：<input maxlength="11" type="text" name="phone" id="phone" onchange="userPhone()"><span id="phoneTips" style="color: red"></span><br>
用户名：<input type="text" name="username" id="username" onchange="userNameCheck()"><span id="nameTips" style="color: red"></span><br>
密码：<input type="password" name="password" id="password" onchange="checkPassword()"><span id="passwordTips" style="color:red"></span><br>
确认密码：<input type="password" name="password2" id="password2" onchange="checkPasswordeq()"><span id="passwordTips2" style="color:red"></span><br>
<input type="submit" value="register">
</form>
</body>
</html>