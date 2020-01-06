<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<select id="cid">
</select>
<script>


    $(function(){
        var ulbox;
        var _data;
        $.ajax({
            type: "get",
            url: "./package01",
            data: "",
            dataType: "json",
            success: function(data){
                 _data = data.employees;

                console.log(_data);
                for(var i = 0; i < _data.length; i++){
                    ulbox += '<option value= "' + _data[i].cid + '">' + 
                    _data[i].categoryname + '</option>'
                }
                $("#cid").html(ulbox);
                console.log(ulbox);

            }
        });
    })
</script>
物品发布页表单
<form action="${pageContext.request.contextPath}/addItem" method="post">
    <input >
    
    
    
</form>
</body>
</html>