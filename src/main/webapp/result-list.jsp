<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 12.12.19
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Books</h1>
<a href='<c:url value="/mvc13" />'>dodaj książkę</a>
<table>
    <tr>
        <th>title</th>
        <th>author</th>
        <th>isbn</th>
        <th>action</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.isbn}</td>
            <td>
                <a href='<c:url value="/mvc15?isbn=${book.isbn}"></c:url> '>usuń</a>
                <a href='<c:url value="/mvc16?isbn=${book.isbn}"></c:url> '>edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
