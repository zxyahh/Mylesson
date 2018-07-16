<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎光临</title>
</head>
<body>
<script type="text/javascript">
function doReset() {
	var theform = document.getElementById("form1");
	theform.name.value="";
	theform.psw.value="";
	theform.name.focus();
}
function doSubmit() {
	var theform = document.getElementById("form1");
	if(theform.name.value==""){
		alert("请输入用户名！");
		theform.name.focus();
		return false;
	}
	if(theform.psw.value==""){
		alert("请输入密码！");
		theform.psw.focus();
		return false;
	}
	return true;
}
</script>
<form action="userLogin" method="post" name="form1" id="form1" onsubmit="javascript:return doSubmit()">
用户名：<input type="text" name="name" id="name"/><br/>
密码:<input type="password" name="psw" id="psw"/><br/>
<input type="submit"  value="登陆"/>
<input type="button" onclick="javascript:doReset()" value="重置"/>
</form>

</body>
</html>