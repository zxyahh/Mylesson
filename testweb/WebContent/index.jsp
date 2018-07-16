<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    String msg = "";
    if(null !=request.getParameter("errMsg")&&!request.getPatameter("errMsg").equal(""){
    msg = request.getParameter("errMsg");
    } %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertServlet" method="post">
	标题：<input type="text" name="title" id="title" /><br/>
	
	内容：<textarea name="content" id="content" rows="10" cols=""></textarea><br/>
	作者：<input type ="text" name="author" id="author"/><br/>
	
<input type="submit" value="提交"/>
</form>
</body>
</html>