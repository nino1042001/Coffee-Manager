<%-- 
    Document   : signupform
    Created on : Dec 24, 2021, 10:20:47 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- font awesome cdn link  -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            />
        <link href="assets/css/loginform.css" rel="stylesheet" type="text/css"/>
        <title>Signup Page</title>
    </head>
    <body>
        <div class="header">
            <div class="header-back-homepage">
                <a href="coffee/home" class="header-logo">
                    <i class="fas fa-coffee"></i> coffee family
                </a>
                <div class="header-text">Register</div>
            </div>
            <a href="#" class="help">Cần hỗ trợ?</a>
        </div>

        <div class="register">
            <form action="signup" class="login-form" method="POST">
                <h3>register now</h3>
                <span>${requestScope.isConfirm}</span>
                <span>${requestScope.isExisted}</span>
                <input type="text" name="username" required placeholder="your username" class="box" />
                <input type="password" name="password" required placeholder="your password" class="box" />
                <input type="password" name="repassword" required placeholder="your password again" class="box" />
                <p>have an account <a href="login">login now</a></p>
                <input type="submit" value="create now" class="btn" />
            </form>
        </div>
    </body>
</html>
