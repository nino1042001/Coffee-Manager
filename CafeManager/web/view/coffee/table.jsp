<%-- 
    Document   : table
    Created on : Oct 14, 2021, 8:53:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table Controller</title>
        <style>
            h1{
                text-align: center;
            }
            .grid-container {
                display: grid;
                grid-template-columns: auto auto auto auto;
                grid-gap: 20px;
                padding: 20px;
            }

            .grid-container > div {
                background-color: #33ffff;
                text-align: center;
                padding: 20px 0;
                font-size: 30px;
            }
            .grid-container > div:nth-child(5){
                background-color: #ffb3d9;
            }
        </style>
    </head>
    <body>

        <h1>List Table In Coffee Shop</h1>

        <div class="grid-container">
            <c:forEach items="${requestScope.tables}" var="t">
                <div class="item${t.id}">
                    <span>${t.name}</span>
                    <p>${t.status}</p>
                </div>
            </c:forEach>
        </div>
        
        
    </body>
</html>
