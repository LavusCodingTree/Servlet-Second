<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%! int[] arr={1,2,3,4,5,6,7,8,9}; %>
	
	<% for(int i=0; i<arr.length;i++){  %>
		<h1><%= arr[i] %></h1>
	<% } %>

</body>
</html>