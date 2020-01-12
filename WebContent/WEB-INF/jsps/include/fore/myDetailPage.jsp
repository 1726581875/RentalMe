<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
				<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title> 无忌租赁-租相机，来无忌</title>
		<meta name="keywords" content=" 无忌租赁,相机租赁,镜头租赁.信用租赁,摄影器材,器材库,色影无忌" >
		<meta name="description" content=" 无忌租赁为摄影爱好者，做一个可以无所顾忌租借摄影器材的地方，满足你的所有拍摄需要。佳能、尼康、索尼、宾得等器材（机身、镜头、附件等）应有尽有。信用免押，全国顺丰，同城极速，价优专业。">
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
				
						    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery-3.4.1.min.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/layui/layui.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/jquery.form.js"></script>
    		<script src="https://zu.xitek.com/static/res/www/houh/js/common.js?v=2"></script>
        	</head>
	<body>
				
			<style>
        .left{width:200px;display:inline-block;}
        .right{display:inline-block;    vertical-align: top;padding:0px 20px;box-sizing:border-box;width:900px;}
        .right .content{display:inline-block;  }
.right .content img{max-width:100%;}
        .title{font-size:15px;padding-bottom:15px;font-weight:bold;}
        .menu a{display:block;padding:5px;}
        .menu .current{font-weight:bold;}
        .my-title{    border-left: 5px solid black;
    margin-bottom: 1.2rem;
    padding-left: 1rem;}

.orderdetails-info {
    width: calc(900px - 40px);
}
.operation-box a{margin-bottom:1rem;}
    </style>
	<div style="margin-top:5rem;"></div>
	<div class="box-width">
		<div class="left">
    		<div class="layui-collapse" lay-accordion>
              <div class="layui-colla-item">
                <h2 class="layui-colla-title">个人中心</h2>
                <div class="layui-colla-content layui-show menu">
                	<a href="${picPath}/myDetailPage"   class="current" >账号信息</a>
                	<a href="${picPath}/myOrdersPage"  >我借到的订单</a>
                		<a href="${picPath}/myRentalPage"  >我的借出订单</a>
 
                </div>
              </div>
            </div>
        </div>
        
        <div class="right">
        	<div class="content">
        		<link href="https://zu.xitek.com/static/res/www/houh/css/page.css" rel="stylesheet" />


<style>
.my-value{line-height:36px;}
.layui-form-label{text-align:left;}
</style>

<div class="my-box" style="min-height:500px;">
	<h3 class="my-title">
		账号信息
	</h3>
	<br>
	
	<div>
		<form class="layui-form" action="" 	>
            <div class="layui-form-item">
              <label class="layui-form-label">真实姓名</label>
              <div class="layui-input-block my-value">
              	<div class="layui-form-mid layui-word-aux">${user.userDetail.realname}</div>
               	
               	<a href="${picPath}/forelogout" style="margin-left:15px;text-decoration: underline;"> <div class="layui-icon layui-icon-unlink" style="display: inline;"></div> 退出登录 </a>
              </div>
            </div>
            
            <div class="layui-form-item">
              <label class="layui-form-label">余额</label>
              <div class="layui-input-block my-value">
          			          				<div class="layui-form-mid layui-word-aux">
    						<div class="layui-icon layui-icon-close-fill" style="display: inline;color:red;"></div>
    							${user.money}
    				
    					</div>
    					 	<a href="${picPath}/toRecharge" style="margin-left:15px;text-decoration: underline;"> <div class="layui-icon layui-icon-unlink" style="display: inline;"></div> 充值 </a>
          			              </div>
            </div>
            
            <div class="layui-form-item">
              <label class="layui-form-label">简介</label>
              <div class="layui-input-block my-value">
          			          				<div class="layui-form-mid layui-word-aux">
    						<div class="layui-icon layui-icon-close-fill" style="display: inline;color:red;"></div>
    							${user.userDetail.brief}
    				
    					</div>
          			              </div>
              
              <div class="layui-form-item">
              	<label class="layui-form-label">身份证号</label>
              	<div class="layui-input-block my-value">
    				<div class="layui-form-mid layui-word-aux">
    					${user.userDetail.idnumber}
            					
            				    					    				</div>
              	</div>
               </div>
            </div>
      	</form>
	</div>
</div>
	
        	</div>


        </div>
</div>
	
		
        
       	</body>
</html>