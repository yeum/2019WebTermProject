/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.49
 * Generated at: 2019-12-18 00:11:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>인테리어소품 코제트</title>\r\n");
      out.write("<link href=\"../../css/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div class=\"header_bar\">\r\n");
      out.write("    <div class=\"header_logmenu\">\r\n");
      out.write("\t    <ul class=\"nav\">\t\r\n");
      out.write("\t\t\t");

				if(session.getAttribute("LOGIN") == null) // 로그인이 안되었을 때
	        		{
			
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"../login/login.jsp\"><span class=\"loginBotton\">로그인</span></a></li>\r\n");
      out.write("\t\t\t");

					} else {
			
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"../login/logout.jsp\"><span class=\"loginBotton\">로그아웃</span></a></li>\r\n");
      out.write("\t\t\t\t<li style=\"padding-left: 10px;\"><a href=\"../mypage/mypage.jsp\"><span class=\"loginBotton\">마이페이지</span></a></li>\r\n");
      out.write("\t\t\t");

					}
			
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"searchbox\">\r\n");
      out.write("      <form action=\"../itempage/item.jsp\" method=\"post\" name=\"search\">\r\n");
      out.write("    \t<input name=\"searchbox\" type=\"text\" \r\n");
      out.write("        style=\"background-color:transparent;border:0 solid black;width:200px;height:35px;font-size:15px;\"/>\r\n");
      out.write("      </form>\r\n");
      out.write("     </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" \t \r\n");
      out.write("    <div class=\"header_name\">\r\n");
      out.write("      <div class=\"header_name_img\">\r\n");
      out.write("      \t<a href=\"../index/index.jsp\">\r\n");
      out.write("      \t<img src=\"../../images/new_headername.PNG\" \r\n");
      out.write("      \t\tonerror=\"javascript:this.src='../../images/new_headername.png'\" width=\"294\" height=\"44\" /></a>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    <hr style=\"opacity: 0.4;\"/>\r\n");
      out.write("    <div class=\"header_menu\">\r\n");
      out.write("    \t<ul>\r\n");
      out.write("       \t  <span class=\"header_span_menu\">\r\n");
      out.write("       \t  \t<li><a href=\"../itempage/item.jsp?title=전체\">전체</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=화병\">화병</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=조화\">조화</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=바구니\">바구니</a></li>\r\n");
      out.write("            <li><a href=\"../itempage/item.jsp?title=촛대\">촛대</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=월데코\">월데코</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=키친\">키친</a></li>\r\n");
      out.write("            <li><a href=\"../itempage/item.jsp?title=장식소품\">장식소품</a></li>\r\n");
      out.write("  \t\t\t<li><a href=\"../itempage/item.jsp?title=트레이\">트레이</a></li>\r\n");
      out.write("            <li><a href=\"../itempage/item.jsp?title=패브릭\">패브릭  </a></li>\r\n");
      out.write("       \t  </span>\r\n");
      out.write("    \t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <hr style=\"opacity: 0.4;\"/>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
