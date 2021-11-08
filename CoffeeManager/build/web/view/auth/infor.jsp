<%-- 
    Document   : infor
    Created on : Nov 7, 2021, 4:44:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Personal Information Page</title>
    </head>
    <body>
        Name: ${sessionScope.account.displayName} <br/>
        Account: ${sessionScope.account.username}
    </body>
</html>
