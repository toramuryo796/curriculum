<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HEllo World</h1>
	<div>
		<% 
			Date date = new Date();
		   	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		   	String formatDate = sdf.format(date); 
		%>
		<%= formatDate %>
	</div>
</body>
</html>