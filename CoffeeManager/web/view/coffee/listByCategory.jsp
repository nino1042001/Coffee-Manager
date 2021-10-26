<%-- 
    Document   : order.jsp
    Created on : Oct 20, 2021, 11:20:01 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Page</title>
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

            .grid-container .item {
                background-color: #33ffff;
                text-align: center;
                padding: 20px 0;
                font-size: 30px;
            }

            .grid-container .item:hover{
                cursor: pointer;
            }

        </style>
        <script>
            function addToCart(id) {
                window.location.href = "cart?fid=" + id;
            }
        </script>
    </head>
    <body>
        <form action="listByCategory" method="POST">
            Food Category: <select name="fcid" onchange="this.form.submit()">
                <option value="-1">All</option>
                <c:forEach items="${requestScope.fcs}" var="fc">
                    <option 
                        <c:if test="${fc.id eq param.fcid}">
                            selected="selected"
                        </c:if>
                        value="${fc.id}"> ${fc.name} </option>
                </c:forEach>
            </select>
            <br/>
        </form>

        <h1>List Drinks</h1>
        <div class="grid-container">
            <c:forEach items="${requestScope.foods}" var="f">
                <div class="item data-index-${f.id}" onclick="addToCart(${f.id});">
                    <span>${f.name}</span>
                    <p>
                        <c:forEach items="${f.fps}" var="fp">
                            <c:set var = "medium" value = "${2}"/>
                            <c:if test="${fp.size.id == medium}">
                                ${fp.price}đ
                            </c:if>
                        </c:forEach>
                    </p>
                </div>
            </c:forEach>
        </div>


    </body>
</html>
