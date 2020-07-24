<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>无忌租赁</title>

		<meta name="viewport" content="width=device-width, initial-scale=1">
		
				<link href="https://zu.xitek.com/static/res/www/houh/css/style.css" rel="stylesheet" />
		<link href="https://zu.xitek.com/static/res/www/houh/css/iconfont.css" rel="stylesheet" />
		<link href="https://zu.xitek.com/static/res/www/houh/css/animate.css" rel="stylesheet" />
		<link href="https://zu.xitek.com/static/res/www/houh/layui/css/layui.css" rel="stylesheet" />
		<style type="text/css">
            .btn-main{background-color: #333;}
            .main-btn{cursor:pointer;background: #333; color: #fff; border-radius: 6px; padding: 0 30px; height: 35px; line-height: 35px;}
            .cart_num{padding: 0px 7px;position: absolute; top: 8px; display: inline-block; height: 20px; line-height: 20px; text-align: center; background: #c00; border-radius: 20px; vertical-align: bottom; font-size: 12px;}
        </style>
				
		<link rel="stylesheet" type="text/css" href="https://zu.xitek.com/static/res/www/houh/js/datepicker/dateRange.css" />
<link rel="stylesheet" type="text/css" href="https://zu.xitek.com/static/res/www/houh/js/datepicker/monthPicker.css" />

<link href="https://zu.xitek.com/static/res/www/houh/js/citypicker/css/city-picker.css" rel="stylesheet">
<link href="https://zu.xitek.com/static/res/www/houh/js/citypicker/css/main.css" rel="stylesheet">


		    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery-3.4.1.min.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/layui/layui.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery.form.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/common.js?v=2"></script>
        	</head>
	<body>
				
		
<link rel="stylesheet" href="https://zu.xitek.com/static/res/www/houh/js/swiper/css/swiper.min.css">

<style>
.content_box{display:none;    min-height: 800px;}
.flex_menu{
    position: fixed;
    top: 0;
    background: white;
    margin-top: 0;
    width: 100%;
}
table.dateRangeDateTable td {
    font-size: 12px;
    padding: 5px;
	text-align:center;
}
.ta_calendar td.first {
	text-align:center;
    color: #6590c1;
    background-position: -127px 2px  !important;
}
.ta_calendar td.last {
	text-align:center;
    color: #6590c1;
    background-position: -203px 2px !important;
}
.ta_calendar td.today {
	text-align:center;
    color: #fff;
    background-position: -93px 2px  !important;
}
.ta_btn_primary {
    background-color: #333333 ;
    border: 1px solid #000000;
    color: #ffffff;
}
.ta_btn_primary {
    background-color: #333333;
    background-image: -moz-linear-gradient(center top,#C7E184,#A2CC59);
    border: 1px solid #333333;
    color: #fffff8;
}
.parameter .input-text{height:38px; line-height:38px;border-radius:0;width:142px;}
.parameter .form-label{line-height:38px;}
.result section .box-flex {margin: 15px 0;}
.result {
    padding: 25px 0;
}

.city-select a.active{background-color:#5FB878;}
.city-select a:hover,
.city-select a:focus {
    color: #5FB878;
}
.city-select-tab > a.active{color: #5FB878;}
.city-picker-box{border: 1px solid #e6e6e6;}
.city-picker-box span{left:0px !important;height:35px !important; line-height:35px !important;width:340px !important;}
.city-picker-span.focus, .city-picker-span.open {
    border-bottom-color: #999;
}
.city-picker-span{border:0;}

.regular-radio:checked + label:after {
    content: ' √ ';
    color: white;
    text-align: center;
}



.swiper-container {
      width: 100%;
      height: 100%;
    }
    .swiper-slide {
      text-align: center;
      
      /* Center slide text vertically */
    
    }
    .swiper-slide img{max-width:75%;}
    .swiper-button-next, .swiper-button-prev{ background-size: 14px 44px; !important;}
</style>
	<form action="https://zu.xitek.com/houhou/main/submit/model_id/17" id="rentForm" class="ajaxForm" method="post"  autologin="1" login-config='{"success":"window.loginSuccess"}'>

	<div class="box-width">
			<div class="box-flex flex-between">
			
				<!--图片效果-->
				<div class="details-img" style="width: 460px;height:300px;overflow:hidden;">
					<div class="swiper-container">
                        <div class="swiper-wrapper">
						                            <div class="swiper-slide">
						                            <img id='imgSize1ImgSrc' src="${picPath }${item.firstImage.pic}"  height="350" width="350" /></div>
                                                  </div>
                        <!-- Add Pagination -->
                        <div class="swiper-pagination"></div>
                        <!-- Add Arrows -->
                        <div class="swiper-button-next"></div>
                        <div class="swiper-button-prev"></div>
                    </div>
				</div>
				<!--相机信息-->
				<div class="details-info">
					<h3>
						标题：${item.title}				</h3>
					<section class="box-flex flex-center">
						<span class="span-width">
							内容：
						</span>
						<div class="">
							<span class="red">${item.contact}</span>
						
					</section>
					<section class="box-flex flex-center top-margin">
						<span class="span-width">
							基础付款：
						</span>
						<div class="">
							<span class="red">${item.basepayment}</span>
						 	 <c:if test="${item.counttype eq '0'}">
							 /小时
							 </c:if>
						<c:if test="${item.counttype eq '1'}">
							/天
							 </c:if> 
							 
						</div>
					</section>
					<section class="box-flex flex-center tb-margin">
						<span class="span-width">
							卖家电话：
						</span>
						<div>
							<span class="red">${item.ownUser.phone}</span>
							
						</div>
						
						<span class="span-width" style="margin-left: 50px;">
							卖家用户名：
						</span>
						<div>
							<span class="red">${item.ownUser.username}</span>
						</div>
						
					</section>
					
					 <p>&nbsp;</p>
					<section class="box-flex flex-top">
						<span class="span-width">
							
						</span>
						<div>
							<a href="${picPath}/orderItem/${item.id}"><p class="addCart main-btn" model_id="17" >下单</p></a>
						</div>

					</section>
				</div>
			</div>
		</div>
		
	
	<!--tab-->
		<a id="position_menu"></a>
		<ul class="box-flex box-width tab">
			<li rel="parameter" class="current-tab">
				<a href="###" >
					<span class="iconfont icon-biaoge"></span>
					规格
				</a>
			</li>
			<li rel="pic">
				<a href="###" >
					<span class="iconfont icon-tupian"></span>
					样片
				</a>
			</li>
			<li rel="user-eva">
				<a href="###" >
					<span class="iconfont icon-tupian"></span>
					点评
				</a>
			</li>
			<li rel="lab" >
				<a href="###" >
					<span class="iconfont icon-jingxuan"></span>
					评测
				</a>
			</li>
		</ul>
	
		<!-- 多个图片轮播 -->
	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	
	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	&nbsp;	
<c:forEach items="${item.itemimages}" var="itemimages1">
<td><img id='imgSize1Imp' src="${picPath}${itemimages1.pic}"  height="350" width="350" />&nbsp;	&nbsp;	</td>
</c:forEach>
</tr>  
		
		<div id="parameter" class='content_box  table-box box-width' style="display: block;">
		  
		</div>
		
		<div id="pic" class='content_box '>
		 
		</div>
		
		<div id="user-eva" class='content_box'>
		 
		</div>
		
		
		<div id="lab" class='content_box'>
		 
		</div>
	</form>	
		
		
		


	</body>
</html>