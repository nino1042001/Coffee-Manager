<%-- 
    Document   : order.jsp
    Created on : Oct 20, 2021, 11:20:01 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link
            rel="stylesheet"
            href="https://unpkg.com/swiper@7/swiper-bundle.min.css"
            />
        <!-- font awesome cdn link  -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            />
        <link href="../../assets/css/home.css" rel="stylesheet" type="text/css"/>
        <link href="../../assets/css/category.css" rel="stylesheet" type="text/css"/>
        <title>Category Page</title>
        <script>
            function addToCart(id) {
                window.location.href = "order?fid=" + id;
            }
        </script>
    </head>
    <body>

        <div class="app-header">
            <!--header section starts-->  
            <header class="header">
                <a href="home" class="logo">
                    <i class="fas fa-coffee"></i> coffee family
                </a>

                <nav class="navbar">
                    <a href="#home">home</a>
                    <a href="#features">features</a>
                    <a href="#products">products</a>
                    <a href="#categories">categories</a>
                    <a href="#review">review</a>
                    <a href="#blogs">blogs</a>
                    <a href="#">Booking</a>
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
        </div>


        <!-- container block starts -->
        <div class="app-container">
            <div class="category-side">
                <nav class="category-navigation">
                    <h3 class="category-heading">
                        <i class="category__heading-icon fas fa-list"></i>
                        Tất cả danh mục
                    </h3>
                    <ul class="category-list">
                        <li><a href="" class="category-item-link">Coffee</a></li>
                        <li><a href="" class="category-item-link">Coffee</a></li>
                        <li><a href="" class="category-item-link">Coffee</a></li>
                        <li><a href="" class="category-item-link">Coffee</a></li>
                    </ul>
                </nav>
            </div>

            <!-- product side starts -->
            <div class="product-side">
                <div class="product-filter">
                    <span class="product-filter__label">Sắp xếp theo</span>
                    <button class="product-filter__btn btn">Phổ Biến</button>
                    <button class="product-filter__btn btn btn--primary">
                        Mới Nhất
                    </button>
                    <button class="product-filter__btn btn">Bán Chạy</button>

                    <div class="select-input">
                        <span class="select-input__label">Giá</span>
                        <i class="select-input__icon fas fa-angle-down"></i>
                        <ul class="select-input__list">
                            <li class="select-input__item">
                                <a href="" class="select-input__item-link"
                                   >Giá: Thấp đến Cao</a
                                >
                            </li>
                            <li class="select-input__item">
                                <a href="" class="select-input__item-link"
                                   >Giá: Cao đến Thấp</a
                                >
                            </li>
                        </ul>
                    </div>

                    <div class="product-filter__page">
                        <span class="product-filter__page-num">
                            <span class="product-filter__page-current">1</span>/14
                        </span>
                        <div class="product-filter__page-control">
                            <a
                                href=""
                                class="
                                product-filter__page-btn product-filter__page-btn--disabled
                                "
                                >
                                <i class="product-filter__page-icon fas fa-angle-left"></i>
                            </a>
                            <a href="" class="product-filter__page-btn">
                                <i class="product-filter__page-icon fas fa-angle-right"></i>
                            </a>
                        </div>
                    </div>
                </div>

                <!-- product container starts -->
                <div class="product-container">
                    <div class="product-detail">
                        <a href="" class="product-item">
                            <div class="product-item__img"></div>
                            <div class="product-item__description">
                                <h4 class="product-item__name">
                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang
                                    Seol Radiant
                                </h4>
                                <div class="product-item__price">
                                    <span class="product-item__price-old">1.200.000đ</span>
                                    <span class="product-item__price-current">999.000đ</span>
                                </div>
                                <div class="product-item__reaction">
                                    <span class="product-item__like product-item__like-liked">
                                        <i class="product-item__like-icon-empty far fa-heart"></i>
                                        <i class="product-item__like-icon-fill fas fa-heart"></i>
                                    </span>

                                    <div class="product-item__rating">
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="fas fa-star"></i>
                                    </div>
                                    <span class="product-item__sold">Đã bán 88</span>
                                </div>
                                <div class="product-item__origin">
                                    <span class="product-item__brand">Whoo</span>
                                    <span class="product-item__origin-name">Nhật Bản</span>
                                </div>
                            </div>
                            <div class="product-item__favourite">
                                <i class="fas fa-check"></i>
                                <span>Yêu thích</span>
                            </div>

                            <div class="product-item__sale-off">
                                <span class="product-item__sale-off-percent">43%</span>
                                <span class="product-item__sale-off-label">GIẢM</span>
                            </div>
                        </a>
                         <a href="" class="product-item">
                            <div class="product-item__img"></div>
                            <div class="product-item__description">
                                <h4 class="product-item__name">
                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang
                                    Seol Radiant
                                </h4>
                                <div class="product-item__price">
                                    <span class="product-item__price-old">1.200.000đ</span>
                                    <span class="product-item__price-current">999.000đ</span>
                                </div>
                                <div class="product-item__reaction">
                                    <span class="product-item__like product-item__like-liked">
                                        <i class="product-item__like-icon-empty far fa-heart"></i>
                                        <i class="product-item__like-icon-fill fas fa-heart"></i>
                                    </span>

                                    <div class="product-item__rating">
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="fas fa-star"></i>
                                    </div>
                                    <span class="product-item__sold">Đã bán 88</span>
                                </div>
                                <div class="product-item__origin">
                                    <span class="product-item__brand">Whoo</span>
                                    <span class="product-item__origin-name">Nhật Bản</span>
                                </div>
                            </div>
                            <div class="product-item__favourite">
                                <i class="fas fa-check"></i>
                                <span>Yêu thích</span>
                            </div>

                            <div class="product-item__sale-off">
                                <span class="product-item__sale-off-percent">43%</span>
                                <span class="product-item__sale-off-label">GIẢM</span>
                            </div>
                        </a>
                         <a href="" class="product-item">
                            <div class="product-item__img"></div>
                            <div class="product-item__description">
                                <h4 class="product-item__name">
                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang
                                    Seol Radiant
                                </h4>
                                <div class="product-item__price">
                                    <span class="product-item__price-old">1.200.000đ</span>
                                    <span class="product-item__price-current">999.000đ</span>
                                </div>
                                <div class="product-item__reaction">
                                    <span class="product-item__like product-item__like-liked">
                                        <i class="product-item__like-icon-empty far fa-heart"></i>
                                        <i class="product-item__like-icon-fill fas fa-heart"></i>
                                    </span>

                                    <div class="product-item__rating">
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="fas fa-star"></i>
                                    </div>
                                    <span class="product-item__sold">Đã bán 88</span>
                                </div>
                                <div class="product-item__origin">
                                    <span class="product-item__brand">Whoo</span>
                                    <span class="product-item__origin-name">Nhật Bản</span>
                                </div>
                            </div>
                            <div class="product-item__favourite">
                                <i class="fas fa-check"></i>
                                <span>Yêu thích</span>
                            </div>

                            <div class="product-item__sale-off">
                                <span class="product-item__sale-off-percent">43%</span>
                                <span class="product-item__sale-off-label">GIẢM</span>
                            </div>
                        </a>
                         <a href="" class="product-item">
                            <div class="product-item__img"></div>
                            <div class="product-item__description">
                                <h4 class="product-item__name">
                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang
                                    Seol Radiant
                                </h4>
                                <div class="product-item__price">
                                    <span class="product-item__price-old">1.200.000đ</span>
                                    <span class="product-item__price-current">999.000đ</span>
                                </div>
                                <div class="product-item__reaction">
                                    <span class="product-item__like product-item__like-liked">
                                        <i class="product-item__like-icon-empty far fa-heart"></i>
                                        <i class="product-item__like-icon-fill fas fa-heart"></i>
                                    </span>

                                    <div class="product-item__rating">
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="fas fa-star"></i>
                                    </div>
                                    <span class="product-item__sold">Đã bán 88</span>
                                </div>
                                <div class="product-item__origin">
                                    <span class="product-item__brand">Whoo</span>
                                    <span class="product-item__origin-name">Nhật Bản</span>
                                </div>
                            </div>
                            <div class="product-item__favourite">
                                <i class="fas fa-check"></i>
                                <span>Yêu thích</span>
                            </div>

                            <div class="product-item__sale-off">
                                <span class="product-item__sale-off-percent">43%</span>
                                <span class="product-item__sale-off-label">GIẢM</span>
                            </div>
                        </a>
                         <a href="" class="product-item">
                            <div class="product-item__img"></div>
                            <div class="product-item__description">
                                <h4 class="product-item__name">
                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang
                                    Seol Radiant
                                </h4>
                                <div class="product-item__price">
                                    <span class="product-item__price-old">1.200.000đ</span>
                                    <span class="product-item__price-current">999.000đ</span>
                                </div>
                                <div class="product-item__reaction">
                                    <span class="product-item__like product-item__like-liked">
                                        <i class="product-item__like-icon-empty far fa-heart"></i>
                                        <i class="product-item__like-icon-fill fas fa-heart"></i>
                                    </span>

                                    <div class="product-item__rating">
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="product-item__star-gold fas fa-star"></i>
                                        <i class="fas fa-star"></i>
                                    </div>
                                    <span class="product-item__sold">Đã bán 88</span>
                                </div>
                                <div class="product-item__origin">
                                    <span class="product-item__brand">Whoo</span>
                                    <span class="product-item__origin-name">Nhật Bản</span>
                                </div>
                            </div>
                            <div class="product-item__favourite">
                                <i class="fas fa-check"></i>
                                <span>Yêu thích</span>
                            </div>

                            <div class="product-item__sale-off">
                                <span class="product-item__sale-off-percent">43%</span>
                                <span class="product-item__sale-off-label">GIẢM</span>
                            </div>
                        </a>
                    </div>
                </div>
                <!-- product container ends -->
            </div>
            <!-- product side ends -->
        </div>
        <!-- container block ends -->

        <script src="https://unpkg.com/swiper@7/swiper-bundle.min.js"></script>

        <!-- custom js file link  -->
        <script src="../../assets/js/home.js" type="text/javascript"></script>
    </body>
</html>
