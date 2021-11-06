<%-- 
    Document   : signup
    Created on : Nov 5, 2021, 9:34:40 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/login.css" rel="stylesheet" type="text/css"/>
        <title>Signup Page</title>
    </head>
    <body>
        <div class="center">
            <h1>Register</h1>
            <form method="POST" action="signup">
                <div class="txt_field">
                    <input type="text" required name="name">
                    <span></span>
                    <label>Name</label>
                </div>
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
                <input type="submit" value="Register">
                <div class="signup_link">
                    Have an account? <a href="login">Login</a>
                </div>
            </form>
        </div>
    </body>
</html>
