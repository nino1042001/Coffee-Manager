package org.apache.jsp.view.coffee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <link href=\"../assets/css/homepage.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../assets/css/pagger.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("            function loginUser() {\n");
      out.write("                window.location.href = \"../login\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"logo\">\n");
      out.write("                <img src=\"../assets/img/logo.png\" alt=\"\"/>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"#home\">home</a>\n");
      out.write("                <a href=\"#about\">about</a>\n");
      out.write("                <a href=\"#menu\">menu</a>\n");
      out.write("                <a href=\"table\">book</a>\n");
      out.write("                <a href=\"table\">table status</a>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <div class=\"far fa-user-circle\" id=\"user-btn\" onclick=\"loginUser();\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- header section ends -->\n");
      out.write("\n");
      out.write("        <!-- home section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>fresh coffee in the morning</h3>\n");
      out.write("                <p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Placeat labore, sint cupiditate distinctio tempora reiciendis.</p>\n");
      out.write("                <a href=\"#\" class=\"btn\">get yours now</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- home section ends -->\n");
      out.write("\n");
      out.write("        <!-- about section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"about\" id=\"about\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"> <span>about</span> us </h1>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"image\">\n");
      out.write("                    <img src=\"../assets/img/about-img.jpeg\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>what makes our coffee special?</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatibus qui ea ullam, enim tempora ipsum fuga alias quae ratione a officiis id temporibus autem? Quod nemo facilis cupiditate. Ex, vel?</p>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Odit amet enim quod veritatis, nihil voluptas culpa! Neque consectetur obcaecati sapiente?</p>\n");
      out.write("                    <a href=\"#\" class=\"btn\">learn more</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- about section ends -->\n");
      out.write("\n");
      out.write("        <!-- menu section starts  -->\n");
      out.write("\n");
      out.write("        <section class=\"menu\" id=\"menu\">\n");
      out.write("\n");
      out.write("            <h1 class=\"heading\"> our <span>menu</span> </h1>\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"paggerbottom\" class=\"pagger\"></div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <script src=\"../assets/js/pagger.js\">\n");
      out.write("                    generatePagger('paggerbottom', ");
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
          out.write("                        <img src=\"../assets/img/menu-1.png\" alt=\"\"/>\n");
          out.write("                        <h3>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
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
}
