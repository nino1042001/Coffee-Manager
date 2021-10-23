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
        <form action="cart" method="POST">
            <table>
                <tr>
                    <td>
                        Quantity:
                    </td>
                    <td><input type="number" id="quantity" name="quantity" value="1" min="1"/> </td>
                </tr>
                <tr>
                    <td>
                        Choose Size (Rquired):
                    </td>

                    <td>
                        <c:forEach items="${requestScope.food.fps}" var="fp">
                            ${fp.s.size} <input type="radio" value="${fp.s.id}" name="size">  <br/>
                        </c:forEach>
                    </td>
                </tr>
            </table>
            <input type="submit" value="Add Food"/>
        </form>
    </body>
</html>
