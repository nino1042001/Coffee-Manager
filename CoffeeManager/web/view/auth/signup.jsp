<%-- 
    Document   : signup
    Created on : Nov 5, 2021, 9:34:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/login.css" rel="stylesheet" type="text/css"/>
        <title>Signup Page</title>
    </head>
    <body>
        <h2 class="text_existed">${requestScope.isExisted}</h2>
        <div class="center">
            <h1>Register</h1>
            <form method="POST" action="signup">
                <div class="txt_field">
                    <input type="text" required name="name">
                    <label>Name</label>
                    <span></span>
                </div>
                <div class="txt_field">
                    <input type="text" required name="username">
                    <label>Username</label>
                    <span></span>
                </div>
                <div class="txt_field">
                    <input type="password" required name="password">
                    <label>Password</label>
                    <span></span>
                </div>
                <div class="txt_field">
                    <input type="password" required name="repassword">
                    <label>Confirm Password</label>
                    <span></span>
                </div>
                <span class="text_confirm">${requestScope.isConfirm}</span>
                <input type="submit" value="Register">
                <div class="signup_link">
                    Have an account? <a href="login">Login</a>
                </div>
            </form>
        </div>
    </body>
</html>
