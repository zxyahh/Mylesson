<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>show</title>
</head>

  <body>
    <table>
    	<tr>
    		<td>序号</td>
    		<td>标题</td>
    		<td>内容</td>
    		<td>上传时间</td>
    		<td>作者</td>
    	</tr>
    	<c:forEach items="${infolist}" var="rec">
    	<tr>
    		<td>${rec.info_id }</td>
    		<td>${rec.info_title }</td>
    		<td>${rec.info_content }</td>
    		<td>${rec.info_datetime }</td>
    		<td>${rec.info_author }</td>
    	</tr>
    	</c:forEach>
    </table>
  </body>
</html>