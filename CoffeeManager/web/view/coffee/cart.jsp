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
        <title>Cart Page</title>
    </head>
    <body>
    <center>
        <h2>Coffee Cart</h2>
        <a href="" ></a> 
        <table width="75%" border="1">
            <tr bgcolor="#CCCCCC">
                <td>Name</td>
                <td>Size</td>
                <td>Quantity</td>
                <td>Unit Price</td>
                <td>Total Price</td>
            </tr>
            <jsp:useBean id="cart" scope="session" class="model.CartDrink" />

            <c:if test="${cart.lineItemCount == 0}">
                <tr> <td colspan="5">- Cart is currently empty -</td></tr>
            </c:if>

            <c:forEach var="cartItem" items="${cart.carts}" varStatus="counter">
                <form method="POST" action="cart">
                    <tr>
                        <td><c:out value="${cartItem.name}"/></td>
                        <td><c:out value="${cartItem.size}"/></td>
                        <td>
                            <input type="hidden" name="number" value="<c:out value="${counter.count}"/>"/>
                            <input type="number" name="quantity" value="<c:out value="${cartItem.quantity}"/>"/> 
                            <input type="submit" name="action" value="Update"/>
                            <input type="submit" name="action" value="Delete"/>
                        </td>
                        <td>$<c:out value="${cartItem.price}"/></td>
                        <td>$<c:out value="${cartItem.totalPrice}"/></td>
                    </tr>
                </form>
            </c:forEach>
            <!--Total-->
            <tr>
                <td colspan="4"> </td>
                <td>Total: $<c:out value="${cart.total}"/></td>
            </tr>
        </table>
    </center>
</body>
</html>
