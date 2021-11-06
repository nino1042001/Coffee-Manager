<%-- 
    Document   : login
    Created on : Oct 13, 2021, 9:33:42 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/login.css" rel="stylesheet" type="text/css"/>
        <title>Login Page</title>
    </head>
    <body>
        <h2 class="text_fail">${requestScope.fail}</h2>
        <div class="center">
            <h1>Login</h1>
            <form method="POST" action="login">
                <div class="txt_field">
                    <input type="text" required name="username">
                    <span></span>
                    <label>Username</label>
                </div>
                <div class="txt_field">
                    <input type="password" required name="password">
                    <span></span>
                    <label>Password</label>
                </div>
                <input type="submit" value="Login">
                <div class="signup_link">
                    Not a member? <a href="signup">Signup</a>
                </div>
            </form>
        </div>
    </body>
</html>
