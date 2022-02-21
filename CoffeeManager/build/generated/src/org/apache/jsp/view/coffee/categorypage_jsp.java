package org.apache.jsp.view.coffee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categorypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\"\n");
      out.write("            />\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("        <link href=\"../../assets/css/home.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../../assets/css/category.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Category Page</title>\n");
      out.write("        <script>\n");
      out.write("            function addToCart(id) {\n");
      out.write("                window.location.href = \"order?fid=\" + id;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"app-header\">\n");
      out.write("            <!--header section starts-->  \n");
      out.write("            <header class=\"header\">\n");
      out.write("                <a href=\"home\" class=\"logo\">\n");
      out.write("                    <i class=\"fas fa-coffee\"></i> coffee family\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <nav class=\"navbar\">\n");
      out.write("                    <a href=\"#home\">home</a>\n");
      out.write("                    <a href=\"#features\">features</a>\n");
      out.write("                    <a href=\"#products\">products</a>\n");
      out.write("                    <a href=\"#categories\">categories</a>\n");
      out.write("                    <a href=\"#review\">review</a>\n");
      out.write("                    <a href=\"#blogs\">blogs</a>\n");
      out.write("                    <a href=\"#\">Booking</a>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                    <div class=\"fas fa-bars\" id=\"menu-btn\"></div>\n");
      out.write("                    <div class=\"fas fa-search\" id=\"search-btn\"></div>\n");
      out.write("                    <div class=\"fas fa-shopping-cart\" id=\"cart-btn\"></div>\n");
      out.write("                    <div class=\"fas fa-user\" id=\"login-btn\"></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <form action=\"\" class=\"search-form\">\n");
      out.write("                    <input type=\"search\" id=\"search-box\" placeholder=\"search here...\" />\n");
      out.write("                    <label for=\"search-box\" class=\"fas fa-search\"></label>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <div class=\"shopping-cart\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <i class=\"fas fa-trash\"></i>\n");
      out.write("                        <img src=\"../assets/img/cat-1.png\" alt=\"\"/>\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h3>watermelon</h3>\n");
      out.write("                            <span class=\"price\">$4.99/-</span>\n");
      out.write("                            <span class=\"quantity\">qty : 1</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <i class=\"fas fa-trash\"></i>\n");
      out.write("                        <img src=\"image/cart-img-2.png\" alt=\"\" />\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h3>onion</h3>\n");
      out.write("                            <span class=\"price\">$4.99/-</span>\n");
      out.write("                            <span class=\"quantity\">qty : 1</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <i class=\"fas fa-trash\"></i>\n");
      out.write("                        <img src=\"image/cart-img-3.png\" alt=\"\" />\n");
      out.write("                        <div class=\"content\">\n");
      out.write("                            <h3>chicken</h3>\n");
      out.write("                            <span class=\"price\">$4.99/-</span>\n");
      out.write("                            <span class=\"quantity\">qty : 1</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"total\">total : $19.69/-</div>\n");
      out.write("                    <a href=\"#\" class=\"btn\">checkout</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- header section ends -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- container block starts -->\n");
      out.write("        <div class=\"app-container\">\n");
      out.write("            <div class=\"category-side\">\n");
      out.write("                <nav class=\"category-navigation\">\n");
      out.write("                    <h3 class=\"category-heading\">\n");
      out.write("                        <i class=\"category__heading-icon fas fa-list\"></i>\n");
      out.write("                        Tất cả danh mục\n");
      out.write("                    </h3>\n");
      out.write("                    <ul class=\"category-list\">\n");
      out.write("                        <li><a href=\"\" class=\"category-item-link\">Coffee</a></li>\n");
      out.write("                        <li><a href=\"\" class=\"category-item-link\">Coffee</a></li>\n");
      out.write("                        <li><a href=\"\" class=\"category-item-link\">Coffee</a></li>\n");
      out.write("                        <li><a href=\"\" class=\"category-item-link\">Coffee</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- product side starts -->\n");
      out.write("            <div class=\"product-side\">\n");
      out.write("                <div class=\"product-filter\">\n");
      out.write("                    <span class=\"product-filter__label\">Sắp xếp theo</span>\n");
      out.write("                    <button class=\"product-filter__btn btn\">Phổ Biến</button>\n");
      out.write("                    <button class=\"product-filter__btn btn btn--primary\">\n");
      out.write("                        Mới Nhất\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"product-filter__btn btn\">Bán Chạy</button>\n");
      out.write("\n");
      out.write("                    <div class=\"select-input\">\n");
      out.write("                        <span class=\"select-input__label\">Giá</span>\n");
      out.write("                        <i class=\"select-input__icon fas fa-angle-down\"></i>\n");
      out.write("                        <ul class=\"select-input__list\">\n");
      out.write("                            <li class=\"select-input__item\">\n");
      out.write("                                <a href=\"\" class=\"select-input__item-link\"\n");
      out.write("                                   >Giá: Thấp đến Cao</a\n");
      out.write("                                >\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"select-input__item\">\n");
      out.write("                                <a href=\"\" class=\"select-input__item-link\"\n");
      out.write("                                   >Giá: Cao đến Thấp</a\n");
      out.write("                                >\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"product-filter__page\">\n");
      out.write("                        <span class=\"product-filter__page-num\">\n");
      out.write("                            <span class=\"product-filter__page-current\">1</span>/14\n");
      out.write("                        </span>\n");
      out.write("                        <div class=\"product-filter__page-control\">\n");
      out.write("                            <a\n");
      out.write("                                href=\"\"\n");
      out.write("                                class=\"\n");
      out.write("                                product-filter__page-btn product-filter__page-btn--disabled\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                <i class=\"product-filter__page-icon fas fa-angle-left\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"\" class=\"product-filter__page-btn\">\n");
      out.write("                                <i class=\"product-filter__page-icon fas fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- product container starts -->\n");
      out.write("                <div class=\"product-container\">\n");
      out.write("                    <div class=\"product-detail\">\n");
      out.write("                        <a href=\"\" class=\"product-item\">\n");
      out.write("                            <div class=\"product-item__img\"></div>\n");
      out.write("                            <div class=\"product-item__description\">\n");
      out.write("                                <h4 class=\"product-item__name\">\n");
      out.write("                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang\n");
      out.write("                                    Seol Radiant\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"product-item__price\">\n");
      out.write("                                    <span class=\"product-item__price-old\">1.200.000đ</span>\n");
      out.write("                                    <span class=\"product-item__price-current\">999.000đ</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__reaction\">\n");
      out.write("                                    <span class=\"product-item__like product-item__like-liked\">\n");
      out.write("                                        <i class=\"product-item__like-icon-empty far fa-heart\"></i>\n");
      out.write("                                        <i class=\"product-item__like-icon-fill fas fa-heart\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <div class=\"product-item__rating\">\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"fas fa-star\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"product-item__sold\">Đã bán 88</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__origin\">\n");
      out.write("                                    <span class=\"product-item__brand\">Whoo</span>\n");
      out.write("                                    <span class=\"product-item__origin-name\">Nhật Bản</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-item__favourite\">\n");
      out.write("                                <i class=\"fas fa-check\"></i>\n");
      out.write("                                <span>Yêu thích</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-item__sale-off\">\n");
      out.write("                                <span class=\"product-item__sale-off-percent\">43%</span>\n");
      out.write("                                <span class=\"product-item__sale-off-label\">GIẢM</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                         <a href=\"\" class=\"product-item\">\n");
      out.write("                            <div class=\"product-item__img\"></div>\n");
      out.write("                            <div class=\"product-item__description\">\n");
      out.write("                                <h4 class=\"product-item__name\">\n");
      out.write("                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang\n");
      out.write("                                    Seol Radiant\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"product-item__price\">\n");
      out.write("                                    <span class=\"product-item__price-old\">1.200.000đ</span>\n");
      out.write("                                    <span class=\"product-item__price-current\">999.000đ</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__reaction\">\n");
      out.write("                                    <span class=\"product-item__like product-item__like-liked\">\n");
      out.write("                                        <i class=\"product-item__like-icon-empty far fa-heart\"></i>\n");
      out.write("                                        <i class=\"product-item__like-icon-fill fas fa-heart\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <div class=\"product-item__rating\">\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"fas fa-star\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"product-item__sold\">Đã bán 88</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__origin\">\n");
      out.write("                                    <span class=\"product-item__brand\">Whoo</span>\n");
      out.write("                                    <span class=\"product-item__origin-name\">Nhật Bản</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-item__favourite\">\n");
      out.write("                                <i class=\"fas fa-check\"></i>\n");
      out.write("                                <span>Yêu thích</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-item__sale-off\">\n");
      out.write("                                <span class=\"product-item__sale-off-percent\">43%</span>\n");
      out.write("                                <span class=\"product-item__sale-off-label\">GIẢM</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                         <a href=\"\" class=\"product-item\">\n");
      out.write("                            <div class=\"product-item__img\"></div>\n");
      out.write("                            <div class=\"product-item__description\">\n");
      out.write("                                <h4 class=\"product-item__name\">\n");
      out.write("                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang\n");
      out.write("                                    Seol Radiant\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"product-item__price\">\n");
      out.write("                                    <span class=\"product-item__price-old\">1.200.000đ</span>\n");
      out.write("                                    <span class=\"product-item__price-current\">999.000đ</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__reaction\">\n");
      out.write("                                    <span class=\"product-item__like product-item__like-liked\">\n");
      out.write("                                        <i class=\"product-item__like-icon-empty far fa-heart\"></i>\n");
      out.write("                                        <i class=\"product-item__like-icon-fill fas fa-heart\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <div class=\"product-item__rating\">\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"fas fa-star\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"product-item__sold\">Đã bán 88</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__origin\">\n");
      out.write("                                    <span class=\"product-item__brand\">Whoo</span>\n");
      out.write("                                    <span class=\"product-item__origin-name\">Nhật Bản</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-item__favourite\">\n");
      out.write("                                <i class=\"fas fa-check\"></i>\n");
      out.write("                                <span>Yêu thích</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-item__sale-off\">\n");
      out.write("                                <span class=\"product-item__sale-off-percent\">43%</span>\n");
      out.write("                                <span class=\"product-item__sale-off-label\">GIẢM</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                         <a href=\"\" class=\"product-item\">\n");
      out.write("                            <div class=\"product-item__img\"></div>\n");
      out.write("                            <div class=\"product-item__description\">\n");
      out.write("                                <h4 class=\"product-item__name\">\n");
      out.write("                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang\n");
      out.write("                                    Seol Radiant\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"product-item__price\">\n");
      out.write("                                    <span class=\"product-item__price-old\">1.200.000đ</span>\n");
      out.write("                                    <span class=\"product-item__price-current\">999.000đ</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__reaction\">\n");
      out.write("                                    <span class=\"product-item__like product-item__like-liked\">\n");
      out.write("                                        <i class=\"product-item__like-icon-empty far fa-heart\"></i>\n");
      out.write("                                        <i class=\"product-item__like-icon-fill fas fa-heart\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <div class=\"product-item__rating\">\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"fas fa-star\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"product-item__sold\">Đã bán 88</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__origin\">\n");
      out.write("                                    <span class=\"product-item__brand\">Whoo</span>\n");
      out.write("                                    <span class=\"product-item__origin-name\">Nhật Bản</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-item__favourite\">\n");
      out.write("                                <i class=\"fas fa-check\"></i>\n");
      out.write("                                <span>Yêu thích</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-item__sale-off\">\n");
      out.write("                                <span class=\"product-item__sale-off-percent\">43%</span>\n");
      out.write("                                <span class=\"product-item__sale-off-label\">GIẢM</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                         <a href=\"\" class=\"product-item\">\n");
      out.write("                            <div class=\"product-item__img\"></div>\n");
      out.write("                            <div class=\"product-item__description\">\n");
      out.write("                                <h4 class=\"product-item__name\">\n");
      out.write("                                    Set dưỡng trắng Whoo đông y hoàng cung Gong Jinh Yang\n");
      out.write("                                    Seol Radiant\n");
      out.write("                                </h4>\n");
      out.write("                                <div class=\"product-item__price\">\n");
      out.write("                                    <span class=\"product-item__price-old\">1.200.000đ</span>\n");
      out.write("                                    <span class=\"product-item__price-current\">999.000đ</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__reaction\">\n");
      out.write("                                    <span class=\"product-item__like product-item__like-liked\">\n");
      out.write("                                        <i class=\"product-item__like-icon-empty far fa-heart\"></i>\n");
      out.write("                                        <i class=\"product-item__like-icon-fill fas fa-heart\"></i>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                    <div class=\"product-item__rating\">\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"product-item__star-gold fas fa-star\"></i>\n");
      out.write("                                        <i class=\"fas fa-star\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <span class=\"product-item__sold\">Đã bán 88</span>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-item__origin\">\n");
      out.write("                                    <span class=\"product-item__brand\">Whoo</span>\n");
      out.write("                                    <span class=\"product-item__origin-name\">Nhật Bản</span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-item__favourite\">\n");
      out.write("                                <i class=\"fas fa-check\"></i>\n");
      out.write("                                <span>Yêu thích</span>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"product-item__sale-off\">\n");
      out.write("                                <span class=\"product-item__sale-off-percent\">43%</span>\n");
      out.write("                                <span class=\"product-item__sale-off-label\">GIẢM</span>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- product container ends -->\n");
      out.write("            </div>\n");
      out.write("            <!-- product side ends -->\n");
      out.write("        </div>\n");
      out.write("        <!-- container block ends -->\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/swiper@7/swiper-bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- custom js file link  -->\n");
      out.write("        <script src=\"../../assets/js/home.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <ul class=\"dropdown-user-infor\">\n");
        out.write("                                <li><a class=\"dropdown-user-infor-link\" href=\"../view/auth/infor.jsp\">Account</a></li>\n");
        out.write("                                <li><a class=\"dropdown-user-infor-link\" href=\"../logout\">Logout</a></li>\n");
        out.write("                            </ul>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <ul class=\"dropdown-user\">\n");
        out.write("                                <li><a class=\"dropdown-user-link\" href=\"../login\">Login</a></li>\n");
        out.write("                                <li><a class=\"dropdown-user-link\" href=\"../signup\">Signup</a></li>\n");
        out.write("                            </ul>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }
}
