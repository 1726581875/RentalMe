<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
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
物品发布页表单
</br>
<form action="${pageContext.request.contextPath}/addItem" method="post" onsubmit="return submitCheck(this)">
    标题:<input name="title" value=""></br>
    类别:<select name="cid"> <c:forEach items="${categoryList}" var="Item">
     <option value="${Item.id}">${Item.name}</option>
    </c:forEach></select> 
    内容:<input name="contact" value=""></br>
    租价:<input name="basepayment" type="number"	 value="">
    <select name="counttype">
        <option value="0">小时</option>
        <option value="1">天</option>
    </select></br>
    最短出租时间<input name="mintime" type="number" value=""></br>
    最长出租时间<input name="maxtime" type="number" value=""></br>
    续租价格<input name="overtimemoney" type="number" value=""></br>
    押金:<input name="deposit" type="number" value=""></br>
    可续借:
    <select name="renewable">
        <option value="0">不可续借</option>
        <option value="1">可续借</option>
    </select>
    
	
    <input type="submit" value="提交">
</form>
	修改商品信息：
	<form id="itemForm" >
	<table width="100%" border=1>

    <tr>
		<td>商品图片</td>
    <td>
        <div id="divtest">
		</div>
            <input type='file' id='imgSize1File' name='imgSize1File' class="file" onchange='submitImgSize1Upload()'/>
		 
		 <!-- <span class="pos" id="imgSize1FileSpan">请上传图片的大小不超过3MB</span> -->   
        <input id='imgSize1' name='pic' value='' reg="^.+$" tip="亲！您忘记上传图片了。" /> 
	
	</td> 
	</tr> 

	
	</table>
    </form>
</body>
</html>