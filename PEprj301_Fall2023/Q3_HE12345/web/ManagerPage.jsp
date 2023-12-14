<%-- 
    Document   : ManagerPage
    Created on : 14 Dec, 2023, 2:27:47 AM
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
            .label, .btn {
                display: inline-block;
                min-width: 100px;
            }
            .box {
                border: 1px solid #333;
                width: fit-content;
            }
            .title {
                margin-bottom: 40px;
            }
            
        </style>
    </head>
    <body>
        <h3 class="title">Supplier filter:</h3>
        
        <form>
            <div class="box">
                <span class="label">Supplier name:</span>
                <input type="text" value="" name="supplierName" />
                <input type="text" value="filterByName" name="Service" hidden/>
                <button class="btn" type="submit">Fiter by name</button>
            </div>
        </form>
        
        <form>
            <div class="box">
                <span class="label">Year of birth:</span>
                <input type="text" value="" name="supplierYear"/>
                <input type="text" value="filterByYear" name="Service" hidden/>
                <button class="btn" type="submit">Fiter by year</button>
            </div>
        </form>
        
        <c:set var="list" value="${requestScope.list}"/>
        <h3 class="title">List of Supplier:</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Date of birth</th>
                    <th>Gender</th>
                    <th>Address</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="supplier" items="${list}">
                   <tr>
                    <td>${supplier.getSupplierID()}</td>
                    <td>${supplier.getSupplierName()}</td>
                    <td>${supplier.getBirthDate()}</td>
                    <td>${supplier.getGender()}</td>
                    <td>${supplier.getAddress()}</td>
                    <td><a href="?Service=delete&supplierID=${supplier.getSupplierID()}">delete</a></td>
                </tr> 
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
