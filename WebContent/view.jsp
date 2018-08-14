<%@page import="java.util.Map" %>
<%@page import="java.util.Map.Entry" %>
<%@page import="objects.Book" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Books</title>
</head>
<body>
<form action = "/PurchasingServlet">
<h3>Here are the list of books in the database.</h3>

<% Map<Book, Integer> bookList = (Map<Book, Integer>)request.getAttribute("stock");
	
	for(Entry<Book, Integer> entry : bookList.entrySet()) {
		Book book = entry.getKey();
		out.print("Title " + book.getTitle());
        out.print("<br/>");
        out.print("<br/>");
	}

%>
</body>
</html>