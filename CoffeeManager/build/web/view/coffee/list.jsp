<%-- 
    Document   : list
    Created on : Oct 26, 2021, 11:38:05 PM
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
        Id: ${requestScope.food.id} <br/>
        Name: ${requestScope.food.name} <br/>
        Size: ${requestScope.size} <br/>
        Price: ${requestScope.price} <br/>
        Quantity: ${requestScope.quantity} <br/>
        Total:
        <c:set var = "medium" value = "M"/>
        <c:set var = "large" value = "L"/>
        <c:if test="${requestScope.size == medium}">
            ${requestScope.price * requestScope.quantity}
        </c:if>
        <c:if test="${requestScope.size == large}">
            ${(requestScope.price + requestScope.priceSizeL) * requestScope.quantity}
        </c:if>
    </body>
</html>
