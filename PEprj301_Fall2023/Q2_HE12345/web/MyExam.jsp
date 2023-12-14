<%-- 
    Document   : MyExam.jsp
    Created on : 13 Dec, 2023, 1:38:37 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .label {
                display: inline-block;
                min-width: 150px;
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <form action="addServlet">
            <div class="label">Code:</div> <input type="text" name="code" value="${code}"/><br>
            <div class="label">Name:</div> <input type="text" name="name" value="${name}"/><br>
            <div class="label">Number of carriages:</div> <input type="number" name="number" value="${number}"/><br>
            <button type="submit">Add</button>
        </form>
        <h3>${mess}</h3>

        <c:set var="list" value="${sessionScope.list}" />
        <c:if test="${not empty list}">
            <table border="1">
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Number of carriages</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="train" items="${list}">
                    <tr>
                        <td>${train.code}</td>
                        <td>${train.name}</td>
                        <td>${train.number}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        </c:if>
    </body>
</html>
