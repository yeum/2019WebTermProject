/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.49
 * Generated at: 2019-12-18 00:47:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import my.dao.*;
import my.util.*;
import my.model.*;
import java.util.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/4학년2학기/웹플응용텀프/apache-tomcat-8.0.49/webapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1575863180000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("my.model");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("my.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("my.dao");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.release();
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
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>인테리어소품 코제트</title>\r\n");
      out.write("<link href=\"css/layout.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css\">\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("    $('.bxslider').bxSlider({\r\n");
      out.write("        auto: true, // 자동으로 애니메이션 시작\r\n");
      out.write("        speed: 500,  // 애니메이션 속도\r\n");
      out.write("        pause: 5000,  // 애니메이션 유지 시간 (1000은 1초)\r\n");
      out.write("        pager: true, // 페이지 표시 보여짐\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("    $('.slider').bxSlider({\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	Connection conn = ConnectionProvider.getConnection();
	List<Product> bestProducts = null;
	try{
		ProductDao dao = new ProductDao();
		bestProducts = dao.selectListByFav(conn);
	}catch(SQLException e){}
	
	List<Product> newProducts = null;
	try{
		ProductDao dao = new ProductDao();
		newProducts = dao.selectListByNew(conn);
	}catch(SQLException e){}

      out.write("\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../form/header.jsp", out, true);
      out.write("\r\n");
      out.write("  <div class=\"bxslider\">\r\n");
      out.write("\t  <div>\r\n");
      out.write("\t  \t\t<img src=\"../../images/mainimg.PNG\" onerror=\"javascript:this.src='../../images/mainimg.png'\"/>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div>\r\n");
      out.write("\t  \t\t<img src=\"../../images/mainimg1.PNG\" onerror=\"javascript:this.src='../../images/mainimg1.png'\"/>\r\n");
      out.write("\t  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"ranking_logo\">\r\n");
      out.write("  \t<div style=\"display: inline-block;\"><h1 style=\"font-size : 3em; color: #555;\">고객님이 좋아하실 만한 상품</h1></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t<div class=\"item_wrap\">\t\r\n");
      out.write("  \t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /jsp/index/index.jsp(61,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("product");
        // /jsp/index/index.jsp(61,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(bestProducts);
        // /jsp/index/index.jsp(61,4) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setBegin(0);
        // /jsp/index/index.jsp(61,4) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setEnd(3);
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("  \t\t<div class=\"item\">\r\n");
              out.write("\t\t\t<a href=\"../itempage/detail.jsp?productId=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">\t\r\n");
              out.write(" \t\t\t\t\t<img src=\"../../images/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.thumbnailimg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" width=\"295\" height=\"385\"/>\r\n");
              out.write("\t\t\t</a>\r\n");
              out.write("\t\t\t<div class=\"thumb_name\"><strong>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</strong></div>\r\n");
              out.write("\t\t\t<div class=\"thumb_price\">\r\n");
              out.write("\t\t\t\t<strong>\r\n");
              out.write("\t\t\t\t\t<span class=\"number\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("원</span> \r\n");
              out.write("\t\t\t\t</strong>\r\n");
              out.write("\t\t\t\t<strong >\r\n");
              out.write("\t\t\t\t\t<span style=\"margin-left: 10px;\" class=\"sale\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.discount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("% 할인 중</span>\r\n");
              out.write("\t\t\t\t</strong>\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t\t<div class=\"thumb_memo\">\r\n");
              out.write("\t\t\t\t<p>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.memo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</p>\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t</div>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  <div class=\"new_product_logo\">\r\n");
      out.write("  \t<div style=\"display: inline-block;\"><h1 style=\"font-size : 3em; color: #555;\">새로나온 신상품</h1></div>\r\n");
      out.write("  </div>\r\n");
      out.write("\t<div class=\"item_wrap\">\r\n");
      out.write("\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f1_reused = false;
      try {
        _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f1.setParent(null);
        // /jsp/index/index.jsp(88,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setVar("product");
        // /jsp/index/index.jsp(88,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setItems(newProducts);
        // /jsp/index/index.jsp(88,1) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setBegin(0);
        // /jsp/index/index.jsp(88,1) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setEnd(7);
        int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
          if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t<div class=\"item\">\r\n");
              out.write("\t\t\t<a href=\"../itempage/detail.jsp?productId=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\">\t\r\n");
              out.write(" \t\t\t\t\t<img src=\"../../images/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.thumbnailimg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" width=\"295\" height=\"385\"/>\r\n");
              out.write("\t\t\t</a>\r\n");
              out.write("\t\t\t<div class=\"thumb_name\"><strong>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</strong></div>\r\n");
              out.write("\t\t\t<div class=\"thumb_price\">\r\n");
              out.write("\t\t\t\t<strong>\r\n");
              out.write("\t\t\t\t\t<span class=\"number\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("원</span> \r\n");
              out.write("\t\t\t\t</strong>\r\n");
              out.write("\t\t\t\t<strong >\r\n");
              out.write("\t\t\t\t\t<span style=\"margin-left: 10px;\" class=\"sale\">");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.discount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("% 할인 중</span>\r\n");
              out.write("\t\t\t\t</strong>\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t\t<div class=\"thumb_memo\">\r\n");
              out.write("\t\t\t\t<p>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.memo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</p>\r\n");
              out.write("\t\t\t</div>\r\n");
              out.write("\t\t</div>\r\n");
              out.write("\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f1.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
        _jspx_th_c_005fforEach_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
      }
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"bestseller_logo\">\r\n");
      out.write("  \t<div style=\"display: inline-block;\"><h1 style=\"font-size : 3em; color: #555;\">코제트 MD가 추천하는 상품!</h1></div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"bestseller_miniimg\">\r\n");
      out.write("    <div class=\"slider\">\r\n");
      out.write("    \t<div><img src=\"../../images/1.PNG\" usemap=\"#Map\" onerror=\"javascript:this.src='../../images/1.png'\" border=\"0\"/>\r\n");
      out.write("          <map name=\"Map\" id=\"Map\">\r\n");
      out.write("            <area shape=\"rect\" coords=\"149,5,931,555\" href=\"../itempage/detail.jsp?productId=26\" />\r\n");
      out.write("            <area shape=\"rect\" coords=\"970,5,1751,555\" href=\"../itempage/detail.jsp?productId=27\" />\r\n");
      out.write("          </map>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div><img src=\"../../images/2.PNG\" usemap=\"#Map2\" onerror=\"javascript:this.src='../../images/2.png'\" border=\"0\"/>\r\n");
      out.write("          <map name=\"Map2\" id=\"Map2\">\r\n");
      out.write("            <area shape=\"rect\" coords=\"151,4,930,555\" href=\"../itempage/detail.jsp?productId=31\" />\r\n");
      out.write("            <area shape=\"rect\" coords=\"969,4,1751,555\" href=\"../itempage/detail.jsp?productId=30\" />\r\n");
      out.write("          </map>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div><img src=\"../../images/3.PNG\" usemap=\"#Map3\" onerror=\"javascript:this.src='../../images/3.png'\" border=\"0\"/>\r\n");
      out.write("          <map name=\"Map3\" id=\"Map3\">\r\n");
      out.write("            <area shape=\"rect\" coords=\"970,3,1749,552\" href=\"../itempage/detail.jsp?productId=3\" />\r\n");
      out.write("            <area shape=\"rect\" coords=\"149,4,931,553\" href=\"../itempage/detail.jsp?productId=32\" />\r\n");
      out.write("          </map>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div><img src=\"../../images/4.PNG\" usemap=\"#Map4\" onerror=\"javascript:this.src='../../images/4.png'\" border=\"0\"/>\r\n");
      out.write("          <map name=\"Map4\" id=\"Map4\">\r\n");
      out.write("            <area shape=\"rect\" coords=\"149,4,930,553\" href=\"../itempage/detail.jsp?productId=33\" />\r\n");
      out.write("            <area shape=\"rect\" coords=\"969,3,1749,551\" href=\"../itempage/detail.jsp?productId=11\" />\r\n");
      out.write("          </map>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"background_img\">\r\n");
      out.write("    <img src=\"../../images/background.PNG\" onerror=\"javascript:this.src='../../images/background.png'\" width=\"1899\" height=\"390\" />\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../form/footer.jsp", out, true);
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
