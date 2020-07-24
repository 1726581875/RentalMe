<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
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


<style>
/*
body{background: #f7f7f7;}
.footer{display:none;}*/
.box {
	width: 680px;
	
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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <c:if test="${!empty msg}">
        <span>${msg }</span>
    </c:if>

<script type="text/javascript">

function submitImgSize1Upload(){
	var option={
			type:'POST',
			url:'${picPath}/uploadPicAjax',
			dataType:'text',
			data:{
				fileName : 'imgSize1File'
			},
			success:function(data){
				//把json格式的字符串转换成json对象
				var jsonObj = $.parseJSON(data);
				
				var addImage = "<img id='" + jsonObj.fullPath + 
				"' src=\"" + jsonObj.fullPath + "\"  height=\"100\" width=\"100\" />";
				//jq：返回服务器图片路径，把图片路径设置给img标签			
     //$("#divtest").prepend(<input type='file' id='imgSize1File' name='imgSize1File' class=\"file\" onchange='submitImgSize1Upload()'/>");
              // imgArray.push(jsonObj.relativePath);

		$("#divtest").append(addImage);	
				
			}
			
		};
	$("#itemForm").ajaxSubmit(option);
	
}
 

</script>



</br>

	<div class="layui-row ">
		<div class="" style="margin: 100px 0px 200px 0px;">
			<div class="box">
				<div class='box-content  '>
					<div class="box-title">
						<img
							src="https://zu.xitek.com/static/res/www/houh/img/logo-index.png"
							style="width: 100px;">
					</div>
         <h2 style="text-align: center;">物品发布页表单</h2>
				
					<form action="${pageContext.request.contextPath}/addItem" method="post"  onsubmit="return submitCheck(this)"
					class="layui-form"
						style="margin-top: 20px;">
						<div class="layui-form-item">
							<label class="layui-form-label">标题:</label>
							<div class="layui-input-inline">
								<input   name="title" value="" placeholder="标题"
									autocomplete="off" class="layui-input"><span id="phoneTips" style="color: red"></span>
							</div>
						</div>
						  
						
						<div class="layui-form-item">
							<label class="layui-form-label">类别:</label>
						<select  name="cid" style="display: block;height: 34px;">
						 <c:forEach items="${categoryList}" var="Item">
                           <option value="${Item.id}">${Item.name}</option> 
                         </c:forEach>
                           </select>
						</div>
						
						<div class="layui-form-item">
							<label class="layui-form-label">内容:</label>
							<div class="layui-input-inline">	
						<textarea placeholder="内容" name="contact" cols="40" rows="4" style="OVERFLOW: hidden"></textarea>					
							</div>
						</div>
						
                         <div class="layui-form-item">
							<label class="layui-form-label">租价:</label>
							<div class="layui-input-inline">
								<input name="basepayment" type="number" placeholder="请输入租价"
									 class="layui-input">
									 <select name="counttype" style="display: block;height: 34px;">
                      <option value="0">小时</option>
                     <option value="1">天</option>
                       </select>
							</div>
						</div>
						
							<div class="layui-form-item">
							<label class="layui-form-label">最短时间:</label>
							<div class="layui-input-inline">	
						<input  name="mintime" type="number" placeholder="最短出租时间"
									 class="layui-input">					
							</div>
						</div>

					<div class="layui-form-item">
							<label class="layui-form-label">最长时间:</label>
							<div class="layui-input-inline">	
						<input name="maxtime" type="number" placeholder="最长时间"
									 class="layui-input">					
							</div>
						</div>


					<div class="layui-form-item">
							<label class="layui-form-label">续租价格:</label>
							<div class="layui-input-inline">	
						<input name="overtimemoney" type="number" placeholder="续租价格"
									 class="layui-input">					
							</div>
						</div>
						
					<div class="layui-form-item">
							<label class="layui-form-label"> 押金:</label>
							<div class="layui-input-inline">	
						<input name="deposit" type="number" placeholder="押金"
									 class="layui-input">					
							</div>
						</div>
						
						
					<div class="layui-form-item">
							<label class="layui-form-label">可续借:</label>
						<select name="renewable" style="display: block;height: 34px;">
                          <option value="0">不可续借</option>
                          <option value="1">可续借</option>
                            </select>
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
	
	<form id="itemForm" enctype="multipart/form-data">
	<table width="100%" border=1>

    <tr>
		<td>商品图片</td>
    <td>
        <div id="divtest">
		</div>
            <input type='file' id='imgSize1File' name='imgSize1File' class="file" onchange='submitImgSize1Upload()'/>
		 
		 <span class="pos" id="imgSize1FileSpan">请上传图片的大小不超过3MB</span>   	
	</td> 
	</tr> 

	
	</table>
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