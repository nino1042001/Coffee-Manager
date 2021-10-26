<%-- 
    Document   : cart
    Created on : Oct 23, 2021, 10:09:08 AM
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
        <form action="list" method="POST">
            Id: ${requestScope.food.id}<input type="hidden" name="id" value="${requestScope.food.id}"> <br/>
            Name: ${requestScope.food.name} <br/>
            Price:  
            <c:forEach items="${requestScope.food.fps}" var="fp">
                <c:set var = "medium" value = "M"/>
                <c:if test="${fp.size.size == medium}">
                    ${fp.price}<input type="hidden" name="price" value="${fp.price}">
                </c:if>
            </c:forEach>
            <br/>
            <table>
                <tr>
                    <td>
                        Quantity:
                    </td>
                    <td><input type="number" id="quantity" name="quantity" value="1" min="1"/> </td>
                </tr>
                <tr>
                    <td>
                        Choose Size (Required):
                    </td>

                    <td>
                        <c:forEach items="${requestScope.food.fps}" var="fp">
                            <c:set var = "medium" value = "M"/>
                            <c:if test="${fp.size.size == medium}">
                                <input type="radio" 
                                       checked="checked"
                                       value="${fp.size.size}" name="size">  ${fp.size.size} <br/> <span>+ ${fp.price - fp.price}đ</span>
                                <c:set var = "curentPrice" value = "${fp.price}"/>
                            </c:if>
                            <br/>
                            <c:set var = "large" value = "L"/>
                            <c:if test="${fp.size.size == large}">
                                <input type="radio" 
                                       value="${fp.size.size}" name="size">  ${fp.size.size} <br/> <span>+ ${fp.price - curentPrice}đ</span>
                                <input type="hidden" value="${fp.price - curentPrice}" name="priceSizeL"/>
                            </c:if>
                        </c:forEach>
                    </td>
                </tr>

            </table>
            <input type="submit" value="Add Food"/>
        </form>
    </body>
</html>
