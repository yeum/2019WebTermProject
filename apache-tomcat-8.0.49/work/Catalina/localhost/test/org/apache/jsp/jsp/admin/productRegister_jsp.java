/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.49
 * Generated at: 2019-12-18 00:43:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class productRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"../../css/admin.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminHeader.jsp", out, true);
      out.write("\r\n");
      out.write("        <!-- 가운데 부분 -->\r\n");
      out.write("        <div class=\"box2\">\r\n");
      out.write("        \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminMid.jsp", out, true);
      out.write("\r\n");
      out.write("        \t\r\n");
      out.write("        \t<!-- 상품 등록 폼-->\r\n");
      out.write("        \t<div class=\"in_2box3\">\r\n");
      out.write("            \t<div class=\"tablestyle\">\r\n");
      out.write("          <form action=\"productResult.jsp\" method=\"post\" enctype=\"multipart/form-data\" name=\"form1\">\r\n");
      out.write("            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" id=\"registerform\" class=\"type03\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"titlefield\">* 상품이름</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input name=\"name\" type=\"text\" id=\"titlefield\" size=\"70\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"namefield\">* 제조사</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input name=\"maker\" type=\"text\" id=\"namefield\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"price\">* 가격</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input name=\"price\" type=\"text\" id=\"namefield\" value=\"8000\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <th><label for=\"discount\">* 할인율</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input name=\"discount\" type=\"text\" id=\"namefield\" value=\"0\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"namefield\">* 원산지</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <input name=\"origin\" type=\"text\" id=\"namefield\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"filefield\">* 썸네일이미지</label></th>\r\n");
      out.write("                <td><label for=\"filefield2\"></label>\r\n");
      out.write("                <input type=\"file\" name=\"thumbnailimg\" id=\"filefield2\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"filefield\">* 디테일이미지</label></th>\r\n");
      out.write("                <td><label for=\"filefield2\"></label>\r\n");
      out.write("                <input type=\"file\" name=\"detailimg\" id=\"filefield2\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th><label for=\"namefield\">* 카테고리</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <select name=\"category\">\r\n");
      out.write("                \t<option value=\"화병\">화병\r\n");
      out.write("                \t<option value=\"조화\">조화\r\n");
      out.write("                \t<option value=\"바구니\">바구니\r\n");
      out.write("                \t<option value=\"촛대\">촛대\r\n");
      out.write("                \t<option value=\"월데코\">월데코\r\n");
      out.write("                \t<option value=\"키친\">키친\r\n");
      out.write("                \t<option value=\"장식소품\">장식소품\r\n");
      out.write("                \t<option value=\"트레이\">트레이\r\n");
      out.write("                \t<option value=\"패브릭\">패브릭\r\n");
      out.write("                </select>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th style=\"height: 50px;\"><label for=\"memo\">* 상품설명</label></th>\r\n");
      out.write("                <td>\r\n");
      out.write("                <textarea name=\"memo\" cols=\"70\" rows=\"3\" id=\"memo\"></textarea></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"30\" colspan=\"2\" align=\"center\" class=\"btnstyle\">\r\n");
      out.write("                <input type=\"submit\"  id=\"mybtn\" value=\"확인\">\r\n");
      out.write("                <input type=\"reset\"  id=\"mybtn\" value=\"취소\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("            \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adminBottom.jsp", out, true);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
