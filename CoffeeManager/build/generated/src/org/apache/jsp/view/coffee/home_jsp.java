package org.apache.jsp.view.coffee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>The Coffee Family - Version Never Die</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link href=\"../assets/css/home.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header section starts  -->\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"#\" class=\"logo\">\n");
      out.write("                <i class=\"fas fa-coffee\"></i> coffee family\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"#home\">home</a>\n");
      out.write("                <a href=\"#features\">features</a>\n");
      out.write("                <a href=\"#products\">products</a>\n");
      out.write("                <a href=\"#categories\">categories</a>\n");
      out.write("                <a href=\"#review\">review</a>\n");
      out.write("                <a href=\"#blogs\">blogs</a>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <div class=\"fas fa-bars\" id=\"menu-btn\"></div>\n");
      out.write("                <div class=\"fas fa-search\" id=\"search-btn\"></div>\n");
      out.write("                <div class=\"fas fa-shopping-cart\" id=\"cart-btn\"></div>\n");
      out.write("                <div class=\"fas fa-user\" id=\"login-btn\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"\" class=\"search-form\">\n");
      out.write("                <input type=\"search\" id=\"search-box\" placeholder=\"search here...\" />\n");
      out.write("                <label for=\"search-box\" class=\"fas fa-search\"></label>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <div class=\"shopping-cart\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <i class=\"fas fa-trash\"></i>\n");
      out.write("                    <img src=\"../assets/img/cat-1.png\" alt=\"\"/>\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h3>watermelon</h3>\n");
      out.write("                        <span class=\"price\">$4.99/-</span>\n");
      out.write("                        <span class=\"quantity\">qty : 1</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <i class=\"fas fa-trash\"></i>\n");
      out.write("                    <img src=\"image/cart-img-2.png\" alt=\"\" />\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h3>onion</h3>\n");
      out.write("                        <span class=\"price\">$4.99/-</span>\n");
      out.write("                        <span class=\"quantity\">qty : 1</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <i class=\"fas fa-trash\"></i>\n");
      out.write("                    <img src=\"image/cart-img-3.png\" alt=\"\" />\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <h3>chicken</h3>\n");
      out.write("                        <span class=\"price\">$4.99/-</span>\n");
      out.write("                        <span class=\"quantity\">qty : 1</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"total\">total : $19.69/-</div>\n");
      out.write("                <a href=\"#\" class=\"btn\">checkout</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <form action=\"\" class=\"login-form\" method=\"\">\n");
      out.write("                <h3>login now</h3>\n");
      out.write("                <input type=\"text\" name=\"username\" required placeholder=\"your username\" class=\"box\" />\n");
      out.write("                <input type=\"password\" name=\"password\" required placeholder=\"your password\" class=\"box\" />\n");
      out.write("                <p>don't have an account <a href=\"../auth/signup.jsp\">create now</a></p>\n");
      out.write("                <input type=\"submit\" value=\"login now\" class=\"btn\" />\n");
      out.write("            </form>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- header section ends -->\n");
      out.write("\n");
      out.write("        <!-- home section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>wake up and <span>smell</span> the coffee</h3>\n");
      out.write("                <p>\n");
      out.write("                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Aliquam\n");
      out.write("                    libero nostrum veniam facere tempore nisi.\n");
      out.write("                </p>\n");
      out.write("                <a href=\"#\" class=\"btn\">shop now</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- home section ends -->\n");
      out.write("\n");
      out.write("        <!-- features section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"features\" id=\"features\">\n");
      out.write("            <h1 class=\"heading\">our <span>features</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"image/feature-img-1.png\" alt=\"\" />\n");
      out.write("                    <h3>fresh and organic</h3>\n");
      out.write("                    <p>\n");
      out.write("                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,\n");
      out.write("                        earum!\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"image/feature-img-2.png\" alt=\"\" />\n");
      out.write("                    <h3>free delivery</h3>\n");
      out.write("                    <p>\n");
      out.write("                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,\n");
      out.write("                        earum!\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"image/feature-img-3.png\" alt=\"\" />\n");
      out.write("                    <h3>easy payments</h3>\n");
      out.write("                    <p>\n");
      out.write("                        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Deserunt,\n");
      out.write("                        earum!\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- features section ends -->\n");
      out.write("\n");
      out.write("        <!-- products section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"products\" id=\"products\">\n");
      out.write("            <h1 class=\"heading\">our <span>products</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"product-slider\">\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"paggerbottom\" class=\"pagger\"></div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- products section ends -->\n");
      out.write("\n");
      out.write("        <!-- categories section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"categories\" id=\"categories\">\n");
      out.write("            <h1 class=\"heading\">product <span>categories</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- categories section ends -->\n");
      out.write("\n");
      out.write("        <!-- review section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"review\" id=\"review\">\n");
      out.write("            <h1 class=\"heading\">customer's <span>review</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"swiper review-slider\">\n");
      out.write("                <div class=\"swiper-wrapper\">\n");
      out.write("                    <div class=\"swiper-slide box\">\n");
      out.write("                        <img src=\"../assets/img/pic-1.png\" alt=\"\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde\n");
      out.write("                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.\n");
      out.write("                        </p>\n");
      out.write("                        <h3>john deo</h3>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide box\">\n");
      out.write("                        <img src=\"../assets/img/pic-2.png\" alt=\"\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde\n");
      out.write("                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.\n");
      out.write("                        </p>\n");
      out.write("                        <h3>john deo</h3>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide box\">\n");
      out.write("                        <img src=\"../assets/img/pic-3.png\" alt=\"\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde\n");
      out.write("                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.\n");
      out.write("                        </p>\n");
      out.write("                        <h3>john deo</h3>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide box\">\n");
      out.write("                        <img src=\"../assets/img/pic-4.png\" alt=\"\" />\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit, amet consectetur adipisicing elit. Unde\n");
      out.write("                            sunt fugiat dolore ipsum id est maxime ad tempore quasi tenetur.\n");
      out.write("                        </p>\n");
      out.write("                        <h3>john deo</h3>\n");
      out.write("                        <div class=\"stars\">\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star\"></i>\n");
      out.write("                            <i class=\"fas fa-star-half-alt\"></i>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- review section ends -->\n");
      out.write("\n");
      out.write("        <!-- blogs section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"blogs\" id=\"blogs\">\n");
      out.write("            <h1 class=\"heading\">our <span>blogs</span></h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"../assets/img/blog-1.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"icons\">\n");
      out.write("                            <a href=\"../auth/loginpage.jsp\"> <i class=\"fas fa-user\"></i> by user </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-calendar\"></i> 1st may, 2021 </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>fresh and organic vegitables and fruits</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,\n");
      out.write("                            expedita.\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"../assets/img/blog-2.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"icons\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-user\"></i> by user </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-calendar\"></i> 1st may, 2021 </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>fresh and organic vegitables and fruits</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,\n");
      out.write("                            expedita.\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <img src=\"../assets/img/blog-3.jpg\" alt=\"\" />\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"icons\">\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-user\"></i> by user </a>\n");
      out.write("                            <a href=\"#\"> <i class=\"fas fa-calendar\"></i> 1st may, 2021 </a>\n");
      out.write("                        </div>\n");
      out.write("                        <h3>fresh and organic vegitables and fruits</h3>\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam,\n");
      out.write("                            expedita.\n");
      out.write("                        </p>\n");
      out.write("                        <a href=\"#\" class=\"btn\">read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- blogs section ends -->\n");
      out.write("\n");
      out.write("        <!-- footer section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"footer\">\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>coffee family <i class=\"fas fa-coffee\"></i></i></h3>\n");
      out.write("                    <p>\n");
      out.write("                        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aliquam,\n");
      out.write("                        saepe.\n");
      out.write("                    </p>\n");
      out.write("                    <div class=\"share\">\n");
      out.write("                        <a href=\"https://www.facebook.com/profile.php?id=100024798456936\" class=\"fab fa-facebook-f\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fab fa-twitter\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fab fa-instagram\"></a>\n");
      out.write("                        <a href=\"#\" class=\"fab fa-linkedin\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>contact info</h3>\n");
      out.write("                    <a href=\"tel:+0971941831\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-phone\"></i> +097-194-1831\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"tel:+0989945514\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-phone\"></i> +098-994-5514\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"mailto: cuongtv2001zxc@gmail.com\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-envelope\"></i> cuongtv2001zxc@gmail.com\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"https://goo.gl/maps/i9Q2nsZZPcHpWyKv7\" target=\"blank\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-map-marker-alt\"></i> Vĩnh Phúc, Việt Nam - 15000\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>quick links</h3>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> home\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> features\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> products\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> categories\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> review\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#\" class=\"links\">\n");
      out.write("                        <i class=\"fas fa-arrow-right\"></i> blogs\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>newsletter</h3>\n");
      out.write("                    <p>subscribe for latest updates</p>\n");
      out.write("                    <input type=\"email\" placeholder=\"your email\" class=\"email\" />\n");
      out.write("                    <input type=\"submit\" value=\"subscribe\" class=\"btn\" />\n");
      out.write("                    <img src=\"image/payment.png\" class=\"payment-img\" alt=\"\" />\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"credit\">\n");
      out.write("                created by <span> mr.cuong web designer </span> | all rights reserved\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer section ends -->\n");
      out.write("\n");
      out.write("        <script src=\"https://unpkg.com/swiper@7/swiper-bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- custom js file link  -->\n");
      out.write("        <script src=\"../assets/js/pagger.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"../assets/js/home.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            generatePagger('paggerbottom', ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pageindex}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.totalpage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", 2);\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.foods}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"box\">\n");
          out.write("                        <img src=\"../assets/img/product-1.png\" alt=\"\" />\n");
          out.write("                        <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                        <div class=\"price\">\n");
          out.write("                            ");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"stars\">\n");
          out.write("                            <i class=\"fas fa-star\"></i>\n");
          out.write("                            <i class=\"fas fa-star\"></i>\n");
          out.write("                            <i class=\"fas fa-star\"></i>\n");
          out.write("                            <i class=\"fas fa-star\"></i>\n");
          out.write("                            <i class=\"fas fa-star-half-alt\"></i>\n");
          out.write("                        </div>\n");
          out.write("                        <a href=\"#\" class=\"btn\">add to cart</a>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.fps}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("fp");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fp.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("đ\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.categories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("fc");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"box\">\n");
          out.write("                        <img src=\"../assets/img/cat-1.png\" alt=\"\" />\n");
          out.write("                        <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fc.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                        <p>upto 45% off</p>\n");
          out.write("                        <a href=\"#\" class=\"btn\">shop now</a>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
