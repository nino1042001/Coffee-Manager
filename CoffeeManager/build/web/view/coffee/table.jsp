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

            .grid-container .empty {
                background-color: #33ffff;
                text-align: center;
                padding: 20px 0;
                font-size: 30px;
            }

            .grid-container .empty:hover, .grid-container .booked:hover{
                cursor: pointer;
            }

            .grid-container .booked{
                background-color: #ffb3d9;
                text-align: center;
                padding: 20px 0;
                font-size: 30px;
            }
        </style>
        <script>
            function showBill(id) {
                window.location.href = "showBill?id=" + id;
            }
            function showOrder(id) {
                window.location.href = "listByCategory?id=" + id;
            }
        </script>
    </head>
    <body>

        <h1>List Table In Coffee Shop</h1>

        <div class="grid-container">
            <c:forEach items="${requestScope.tables}" var="t">
                <c:set var="status" value="Empty"/>
                <c:choose>
                    <c:when test = "${t.status == status}">
                        <div class="item${t.id} empty" onclick="showOrder(${t.id});">
                            <span>${t.name}</span>
                            <p>${t.status}</p>
                        </div>
                    </c:when>

                    <c:otherwise>
                        <div class="item${t.id} booked" onclick="showBill(${t.id});">
                            <span>${t.name}</span>
                            <p>${t.status}</p>
                        </div>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </div>
       
    </body>
</html>
