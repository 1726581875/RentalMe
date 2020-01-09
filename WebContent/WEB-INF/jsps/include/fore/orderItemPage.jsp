<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<script src="../js/jquery.js"> </script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
商品id:${item.id}<br>
标题：${item.title}<br>
<!-- itemimages.pic 存的是相对路径 -->
<img id='imgSize1ImgSrc' src="${picPath }${item.firstImage.pic}"  height="100" width="100" /><br>
卖家电话:${item.ownUser.phone}.卖家用户名:${item.ownUser.username}<br>
<form action="${pageContext.request.contextPath}/createOrder/${item.id}">
预计借时:<input name="preLoanDate" type="datetime-local" id="preLoanDate" value="" onchange="myFunction1()"> </br>
预计还时:<input name="preReturnDate" type="datetime-local" id="preReturnDate" value="" onchange="myFunction2()"> </br>
需要金额：<span id = "text1"></span><br>\
<input name="preLoanTime" id="preLoanTime"   type="hidden"/>
<input name="preReturnTime" id="preReturnTime"  type="hidden"/>
			<input type="submit" value="下单"></input>
</form><br>

</div>
-----异步下单页面----
选择借时和还时(异步计算金额)
去下单
<script>

Date.prototype.format = function(fmt) { 
    var o = { 
       "M+" : this.getMonth()+1,                 //月份 
       "d+" : this.getDate(),                    //日 
       "h+" : this.getHours(),                   //小时 
       "m+" : this.getMinutes(),                 //分 
       "s+" : this.getSeconds(),                 //秒 
       "q+" : Math.floor((this.getMonth()+3)/3), //季度 
       "S"  : this.getMilliseconds()             //毫秒 
   }; 
   if(/(y+)/.test(fmt)) {
           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
   }
    for(var k in o) {
       if(new RegExp("("+ k +")").test(fmt)){
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
   return fmt; 
}     
function defaultDate(){
    var nowDate = new Date();
    var formatDate = new Date(nowDate).format("yyyy-MM-ddThh:00");
    alert(formatDate);
    document.getElementById("preLoanDate").value = formatDate;
    document.getElementById("preReturnDate").value = formatDate;
}
function myFunction1() {
    var x = document.getElementById("preLoanDate").value;
	var mydate = new Date(x);
    document.getElementById("preLoanTime").value = mydate.getTime();
}
function myFunction2() {
var y = document.getElementById("preReturnDate").value;
var mydate1 = new Date(y);
document.getElementById("preReturnTime").value = mydate1.getTime();
var x = document.getElementById("preLoanDate").value;
var mydate2 = new Date(x);
    var data = {}
    data["iid"] = ${item.id};	
    data["preLoanDate"] = mydate2.getTime();
    data["preReturnDate"] = mydate1.getTime();
  $.ajax({
	  type:'POST',/* 请求类型为post */
	 url:'/RentalMe/orderMoneyAjax',
	 contentType: 'application/json;charset=UTF-8',/* 向服务器提出的请求类型 text*/
	 dataType:'json',
	 data:JSON.stringify(data),/* 请求的数据 */
	  success: function(data){/* 回调函数 */
		//把json格式的字符串转换成json对象
  			var str = "时间："+data.data.time+"金额"+data.data.money;
	        $("#text1").html(str);}
	  
  });
   
}  
defaultDate();
</script>

</body>
</html>