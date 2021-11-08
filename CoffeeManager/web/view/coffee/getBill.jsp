<%-- 
    Document   : getBill
    Created on : Nov 8, 2021, 8:49:15 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="bill" method="POST">
            <input type="date" name="checkin" />
            <input type="date" name="checkout"/>
            <input type="submit" value="Get"/>
            <table border="1px" >
                <tr>
                    <td>Date Checkin</td>
                    <td>Date Checkout</td>
                    <td>Table</td>
                    <td>Status</td>
                </tr>
                <c:forEach items="${requestScope.bills}" var="b">
                    <tr>
                        <td>${b.dateCheckin}</td>
                        <td>${b.dateCheckout}</td>
                        <td>b.table.name</td>
                        <td>b.status</td>
                    </tr>
                </c:forEach>
            </table>
        </form>
    </body>
</html>
