<%-- 
    Document   : home.jsp
    Created on : Dec 22, 2021, 10:55:48 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Coffee Family - Version Never Die</title>
        <link
            rel="stylesheet"
            href="https://unpkg.com/swiper@7/swiper-bundle.min.css"
            />

        <!-- font awesome cdn link  -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            />

        <!-- custom css file link  -->
        <link href="../assets/css/home.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <!-- header section starts  -->

        <header class="header">
            <a href="#" class="logo">
                <i class="fas fa-coffee"></i> coffee family
            </a>

            <nav class="navbar">
                <a href="#home">home</a>
                <a href="#features">features</a>
                <a href="#products">products</a>
                <a href="#categories">categories</a>
                <a href="#review">review</a>
                <a href="#blogs">blogs</a>
            </nav>

            <div class="icons">
                <div class="fas fa-bars" id="menu-btn"></div>
                <div class="fas fa-search" id="search-btn"></div>
                <div class="fas fa-shopping-cart" id="cart-btn"></div>
                <div class="fas fa-user" id="login-btn"></div>
            </div>

            <form action="" class="search-form">
                <input type="search" id="search-box" placeholder="search here..." />
                <label for="search-box" class="fas fa-search"></label>
            </form>

            <div class="shopping-cart">
                <div class="box">
                    <i class="fas fa-trash"></i>
                    <img src="../assets/img/cat-1.png" alt=""/>
                    <div class="content">
                        <h3>watermelon</h3>
                        <span class="price">$4.99/-</span>
                        <span class="quantity">qty : 1</span>
                    </div>
                </div>
                <div class="box">
                    <i class="fas fa-trash"></i>
                    <img src="image/cart-img-2.png" alt="" />
                    <div class="content">
                        <h3>onion</h3>
                        <span class="price">$4.99/-</span>
                        <span class="quantity">qty : 1</span>
                    </div>
                </div>
                <div class="box">
                    <i class="fas fa-trash"></i>
                    <img src="image/cart-img-3.png" alt="" />
                    <div class="content">
                        <h3>chicken</h3>
                        <span class="price">$4.99/-</span>
                        <span class="quantity">qty : 1</span>
                    </div>
                </div>
                <div class="total">total : $19.69/-</div>
                <a href="#" class="btn">checkout</a>
            </div>

            <div class="login-form">
                <c:choose>
                    <c:when test = "${sessionScope.account ne null}">
                        <ul class="dropdown-user-infor">
                            <li><a class="dropdown-user-infor-link" href="../view/auth/infor.jsp">Account</a></li>
                            <li><a class="dropdown-user-infor-link" href="../logout">Logout</a></li>
                        </ul>
                    </c:when>

                    <c:when test = "${sessionScope.account eq null}">
                        <ul class="dropdown-user">
                            <li><a class="dropdown-user-link" href="../login">Login</a></li>
                            <li><a class="dropdown-user-link" href="../signup">Signup</a></li>
                        </ul>
                    </c:when>
                </c:choose>
            </div>
        </header>
        <!-- header section ends -->

        <!-- home section starts  -->

        <section class="home" id="home">
            <div class="content">
                <h3>wake up and <span>smell</span> the coffee</h3>
                <p>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam
                    libero nostrum veniam facere tempore nisi.
                </p>
                <a href="#" class="btn">shop now</a>
            </div>
        </section>

        <!-- home section ends -->

        <!-- features section starts  -->

        <section class="features" id="features">
            <h1 class="heading">our <span>features</span></h1>

            <div class="box-container">
                <div class="box">
                    <img src="image/feature-img-1.png" alt="" />
                    <h3>fresh and organic</h3>
                    <p>
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,
                        earum!
                    </p>
                    <a href="#" class="btn">read more</a>
                </div>

                <div class="box">
                    <img src="image/feature-img-2.png" alt="" />
                    <h3>free delivery</h3>
                    <p>
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,
                        earum!
                    </p>
                    <a href="#" class="btn">read more</a>
                </div>

                <div class="box">
                    <img src="image/feature-img-3.png" alt="" />
                    <h3>easy payments</h3>
                    <p>
                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,
                        earum!
                    </p>
                    <a href="#" class="btn">read more</a>
                </div>
            </div>
        </section>

        <!-- features section ends -->

        <!-- products section starts  -->

        <section class="products" id="products">
            <h1 class="heading">our <span>products</span></h1>

            <div class="product-slider">

                <c:forEach items="${requestScope.foods}" var="f">
                    <div class="box">
                        <img src="../assets/img/product-1.png" alt="" />
                        <h3>${f.name}</h3>
                        <div class="price">
                            <c:forEach items="${f.fps}" var="fp">
                                ${fp.price}đ
                            </c:forEach>
                        </div>
                        <div class="stars">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star-half-alt"></i>
                        </div>
                        <a href="#" class="btn">add to cart</a>
                    </div>
                </c:forEach>
            </div>
            <div id="paggerbottom" class="pagger"></div>
        </section>

        <!-- products section ends -->

        <!-- categories section starts  -->

        <section class="categories" id="categories">
            <h1 class="heading">product <span>categories</span></h1>

            <div class="swiper box-container">
                <div class="swiper-wrapper">
                    <c:forEach items="${requestScope.categories}" var="fc">
                        <div class="swiper-slide box">
                            <img src="../assets/img/cat-1.png" alt="" />
                            <h3>${fc.name}</h3>
                            <p>upto 45% off</p>
                            <a href="#" class="btn">shop now</a>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </section>

        <!-- categories section ends -->

        <!-- review section starts  -->

        <section class="review" id="review">
            <h1 class="heading">customer's <span>review</span></h1>

            <div class="swiper review-slider">
                <div class="swiper-wrapper">
                    <div class="swiper-slide box">
                        <img src="../assets/img/pic-1.png" alt="" />
                        <p>
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde
                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.
                        </p>
                        <h3>john deo</h3>
                        <div class="stars">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star-half-alt"></i>
                        </div>
                    </div>

                    <div class="swiper-slide box">
                        <img src="../assets/img/pic-2.png" alt="" />
                        <p>
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde
                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.
                        </p>
                        <h3>john deo</h3>
                        <div class="stars">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star-half-alt"></i>
                        </div>
                    </div>

                    <div class="swiper-slide box">
                        <img src="../assets/img/pic-3.png" alt="" />
                        <p>
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde
                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.
                        </p>
                        <h3>john deo</h3>
                        <div class="stars">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star-half-alt"></i>
                        </div>
                    </div>

                    <div class="swiper-slide box">
                        <img src="../assets/img/pic-4.png" alt="" />
                        <p>
                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde
                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.
                        </p>
                        <h3>john deo</h3>
                        <div class="stars">
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star"></i>
                            <i class="fas fa-star-half-alt"></i>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!-- review section ends -->

        <!-- blogs section starts  -->

        <section class="blogs" id="blogs">
            <h1 class="heading">our <span>blogs</span></h1>

            <div class="box-container">
                <div class="box">
                    <img src="../assets/img/blog-1.jpg" alt="" />
                    <div class="content">
                        <div class="icons">
                            <a href="../auth/loginpage.jsp"> <i class="fas fa-user"></i> by user </a>
                            <a href="#"> <i class="fas fa-calendar"></i> 1st may, 2021 </a>
                        </div>
                        <h3>fresh and organic vegitables and fruits</h3>
                        <p>
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,
                            expedita.
                        </p>
                        <a href="#" class="btn">read more</a>
                    </div>
                </div>

                <div class="box">
                    <img src="../assets/img/blog-2.jpg" alt="" />
                    <div class="content">
                        <div class="icons">
                            <a href="#"> <i class="fas fa-user"></i> by user </a>
                            <a href="#"> <i class="fas fa-calendar"></i> 1st may, 2021 </a>
                        </div>
                        <h3>fresh and organic vegitables and fruits</h3>
                        <p>
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,
                            expedita.
                        </p>
                        <a href="#" class="btn">read more</a>
                    </div>
                </div>

                <div class="box">
                    <img src="../assets/img/blog-3.jpg" alt="" />
                    <div class="content">
                        <div class="icons">
                            <a href="#"> <i class="fas fa-user"></i> by user </a>
                            <a href="#"> <i class="fas fa-calendar"></i> 1st may, 2021 </a>
                        </div>
                        <h3>fresh and organic vegitables and fruits</h3>
                        <p>
                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,
                            expedita.
                        </p>
                        <a href="#" class="btn">read more</a>
                    </div>
                </div>
            </div>
        </section>

        <!-- blogs section ends -->

        <!-- footer section starts  -->

        <section class="footer">
            <div class="box-container">
                <div class="box">
                    <h3>coffee family <i class="fas fa-coffee"></i></i></h3>
                    <p>
                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aliquam,
                        saepe.
                    </p>
                    <div class="share">
                        <a href="https://www.facebook.com/profile.php?id=100024798456936" class="fab fa-facebook-f"></a>
                        <a href="#" class="fab fa-twitter"></a>
                        <a href="#" class="fab fa-instagram"></a>
                        <a href="#" class="fab fa-linkedin"></a>
                    </div>
                </div>

                <div class="box">
                    <h3>contact info</h3>
                    <a href="tel:+0971941831" class="links">
                        <i class="fas fa-phone"></i> +097-194-1831
                    </a>
                    <a href="tel:+0989945514" class="links">
                        <i class="fas fa-phone"></i> +098-994-5514
                    </a>
                    <a href="mailto: cuongtv2001zxc@gmail.com" class="links">
                        <i class="fas fa-envelope"></i> cuongtv2001zxc@gmail.com
                    </a>
                    <a href="https://goo.gl/maps/i9Q2nsZZPcHpWyKv7" target="blank" class="links">
                        <i class="fas fa-map-marker-alt"></i> Vĩnh Phúc, Việt Nam - 15000
                    </a>
                </div>

                <div class="box">
                    <h3>quick links</h3>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> home
                    </a>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> features
                    </a>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> products
                    </a>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> categories
                    </a>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> review
                    </a>
                    <a href="#" class="links">
                        <i class="fas fa-arrow-right"></i> blogs
                    </a>
                </div>

                <div class="box">
                    <h3>newsletter</h3>
                    <p>subscribe for latest updates</p>
                    <input type="email" placeholder="your email" class="email" />
                    <input type="submit" value="subscribe" class="btn" />
                    <img src="image/payment.png" class="payment-img" alt="" />
                </div>
            </div>

            <div class="credit">
                created by <span> mr.cuong web designer </span> | all rights reserved
            </div>
        </section>


        <!-- footer section ends -->

        <script src="https://unpkg.com/swiper@7/swiper-bundle.min.js"></script>

        <!-- custom js file link  -->
        <script src="../assets/js/pagger.js" type="text/javascript"></script>
        <script src="../assets/js/home.js" type="text/javascript"></script>
        <script>
            generatePagger('paggerbottom', ${requestScope.pageindex}, ${requestScope.totalpage}, 2);
        </script>
    </body>
</html>
