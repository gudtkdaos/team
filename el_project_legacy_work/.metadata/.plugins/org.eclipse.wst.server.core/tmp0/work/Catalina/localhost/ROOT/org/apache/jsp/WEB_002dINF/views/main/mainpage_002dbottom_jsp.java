/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-08-02 07:18:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_002dbottom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		    <script src=\"https://code.jquery.com/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("		    <script src=\"resources/js/common.js\"></script>\r\n");
      out.write("\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("		    function openFixedWindowSize(url, width, height) {\r\n");
      out.write("		    	\r\n");
      out.write("		    	var screenWidth = window.screen.width;\r\n");
      out.write("		    	var screenHeight = window.screen.height;\r\n");
      out.write("		    	\r\n");
      out.write("		    	var left = Math.ceil((screenWidth - width) / 2);\r\n");
      out.write("		    	\r\n");
      out.write("		    	var top = Math.ceil((screenHeight - height) / 2); \r\n");
      out.write("		    	  \r\n");
      out.write("		        \r\n");
      out.write("		        var windowFeatures = 'width=' + width + ',height=' + height + ',left=' + left + ',top=' + top + ',resizable=no';\r\n");
      out.write("		        window.open(url, '_blank', windowFeatures);\r\n");
      out.write("		      }\r\n");
      out.write("			\r\n");
      out.write("		</script>\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("		\r\n");
      out.write("			.bottomdiv{\r\n");
      out.write("		       	background-color: #fff;\r\n");
      out.write("	        	box-shadow: 0 1px 1px 0px rgba(0, 0, 0, 0.5);\r\n");
      out.write("	       		\r\n");
      out.write("	       		margin-bottom:0; \r\n");
      out.write("				padding:0;\r\n");
      out.write("				width: 100%;\r\n");
      out.write("			}\r\n");
      out.write("			.map_a{\r\n");
      out.write("				margin-left: 15px;\r\n");
      out.write("				font-size: 13px;\r\n");
      out.write("			}\r\n");
      out.write("		</style>\r\n");
      out.write("		\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<div class=\"bottomdiv\">\r\n");
      out.write("			<span class=\"map_a\">\r\n");
      out.write("			    (주)GOATS.SOLUSION | Tel. 02-570-2222 | Fax. 02-570-2222 | 사업자번호: 000-000-00000\r\n");
      out.write("			</span>\r\n");
      out.write("				<br>\r\n");
      out.write("			<span class=\"map_a\">\r\n");
      out.write("				<a href=\"#\" onclick=\"openFixedWindowSize('mainMap.gos', 700, 400)\">서울특별시 금천구 가산디지털2로 123 2차) 4층 413호 월드메르디앙 </a>\r\n");
      out.write("			</span>	\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
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
