<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 12.12.19
  Time: 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edycja książki</h1>
<form action="/mvc16" method="post">

    <input type="text" name="title" value="${book.title}"/>
    <input type="text" name="author" value="${book.author}"/>
    <input type="hidden" name="isbn" value="${book.isbn}"/>
    <input type="submit"/>
</form>
</body>
</html>
