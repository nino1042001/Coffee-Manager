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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <title>Cart Page</title>
    </head>
    <body>
    <center>
        <h2>Coffee Cart</h2>
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
                            <input type="number" name="quantity" value="<c:out value="${cartItem.quantity}"/>" min="1"/> 
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
        <a class="btn btn-primary mt-3" href="/CoffeeManager/coffee/listByCategory?id=${tid}">Add More</a>
        <br/>
        <form method="POST" action="update">
            <input type="submit" name="action" value="Book"/>
        </form>
    </center>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
