<%-- 
    Document   : homepage
    Created on : Nov 5, 2021, 10:38:21 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link href="../assets/css/homepage.css" rel="stylesheet" type="text/css"/>
        <link href="../assets/css/pagger.css" rel="stylesheet" type="text/css"/>
        <script>
            function loginUser() {
                window.location.href = "../login";
            }
        </script>
    </head
    <body>
        <header class="header">

            <a href="#" class="logo">
                <img src="../assets/img/logo.png" alt=""/>
            </a>

            <nav class="navbar">
                <a href="#home">home</a>
                <a href="#about">about</a>
                <a href="#menu">menu</a>
                <a href="table">book</a>
                <a href="table">table status</a>
            </nav>

            <div class="icons">
                <div class="far fa-user-circle" id="user-btn" onclick="loginUser();"></div>
            </div>

        </header>

        <!-- header section ends -->

        <!-- home section starts  -->

        <section class="home" id="home">


            <div class="content">
                <h3>fresh coffee in the morning</h3>
                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Placeat labore, sint cupiditate distinctio tempora reiciendis.</p>
                <a href="#" class="btn">get yours now</a>
            </div>

        </section>

        <!-- home section ends -->

        <!-- about section starts  -->

        <section class="about" id="about">

            <h1 class="heading"> <span>about</span> us </h1>

            <div class="row">

                <div class="image">
                    <img src="../assets/img/about-img.jpeg" alt=""/>
                </div>

                <div class="content">
                    <h3>what makes our coffee special?</h3>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatibus qui ea ullam, enim tempora ipsum fuga alias quae ratione a officiis id temporibus autem? Quod nemo facilis cupiditate. Ex, vel?</p>
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Odit amet enim quod veritatis, nihil voluptas culpa! Neque consectetur obcaecati sapiente?</p>
                    <a href="#" class="btn">learn more</a>
                </div>

            </div>

        </section>

        <!-- about section ends -->

        <!-- menu section starts  -->

        <section class="menu" id="menu">

            <h1 class="heading"> our <span>menu</span> </h1>

            <div class="box-container">
                <c:forEach items="${requestScope.foods}" var="f">
                    <div class="box">
                        <img src="../assets/img/menu-1.png" alt=""/>
                        <h3>${f.name}</h3>
                        <a href="#" class="btn">add to cart</a>
                    </div>
                </c:forEach>
            </div>


        </section>
        <div id="paggerbottom" class="pagger"></div>
        <script>
            generatePagger('paggerbottom', ${requestScope.pageindex}, ${requestScope.totalpage}, 2);
        </script>
    </body>
</html>
