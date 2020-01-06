<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<script>
    $(function(){
        var addele;
        var _data;
        $.ajax({
            type: "get",
            url: "./getAllCategory",
            data: "",
            dataType: "json",
            success: function(data){
                 _data = data;
                 alert(_data.status);
                 console.log(_data);
                 var category = _data.data.category;
                for(var i = 0; i < category.length; i++){
                	addele += '<option value= "' + category[i].id + '">' + 
                	category[i].name + '</option>'
                }
                
                $("#category").html(addele);
                console.log(addele);

            }
        });
    })
</script>
物品发布页表单
</br>
<form action="${pageContext.request.contextPath}/addItem" method="post">
    标题:<input name="title" value=""></br>
    类别:<select id="category"></select>
    内容:<input name="contact" value=""></br>
    租价:<input name="basePayment" value="">
    <select name="countType">
        <option value="0">小时</option>
        <option value="1">天</option>
    </select></br>
    最短出租时间<input name="minTime" value=""></br>
    最长出租时间<input name="maxTime" value=""></br>
    续租价格<input name="overTimeMoney" value=""></br>
    押金:<input name="deposit"></br>
    可续借:
    <select name="countType">
        <option value="0">不可续借</option>
        <option value="1">可续借</option>
    </select>
    
</form>
</body>
</html>