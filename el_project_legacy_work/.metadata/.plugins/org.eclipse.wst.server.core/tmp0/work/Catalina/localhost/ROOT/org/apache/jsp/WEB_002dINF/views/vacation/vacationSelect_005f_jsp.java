/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-08-02 05:57:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vacation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.gt.s.kos.draft.vo.GtDraftVO;
import com.gt.s.kos.account.vo.GtAccountVO;
import com.gt.s.common.CodeUtil;

public final class vacationSelect_005f_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:split", org.apache.taglibs.standard.functions.Functions.class, "split", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/kosmo/Desktop/Legacy/el_project_legacy_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final_goats/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/kosmo/Desktop/Legacy/el_project_legacy_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final_goats/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688555200114L));
    _jspx_dependants.put("jar:file:/C:/Users/kosmo/Desktop/Legacy/el_project_legacy_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/final_goats/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.log4j.Logger");
    _jspx_imports_classes.add("com.gt.s.kos.draft.vo.GtDraftVO");
    _jspx_imports_classes.add("com.gt.s.kos.account.vo.GtAccountVO");
    _jspx_imports_classes.add("com.gt.s.common.CodeUtil");
    _jspx_imports_classes.add("org.apache.log4j.LogManager");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Vacation SelectAll</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("      html, body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      body {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-direction: column;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      body {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        font-family: Arial, sans-serif;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .con {\r\n");
      out.write("        flex: 1;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container2 {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        height: 100px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container {\r\n");
      out.write("       display: flex; /* Flexbox를 적용하여 요소들을 가로로 배치합니다 */\r\n");
      out.write("       flex-direction: row; /* 요소들을 가로 방향으로 배치합니다 */\r\n");
      out.write("       justify-content: space-between; /* 각 요소를 좌우로 최대한 벌립니다 */\r\n");
      out.write("       height: 430.43; \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container > div {\r\n");
      out.write("        max-width: 800px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        background-color: #fff;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .container h3 {\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 10px 0;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .calendar {\r\n");
      out.write("        height: 200px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      .alert th {\r\n");
      out.write("        background-color: #f0f0f0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .work {\r\n");
      out.write("        height: 300px;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #maindiv{\r\n");
      out.write("         width:100%;\r\n");
      out.write("         height:100%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("     table {\r\n");
      out.write("       border-collapse: collapse; /* 테이블 셀 경계를 병합합니다. */\r\n");
      out.write("     }\r\n");
      out.write("   \r\n");
      out.write("     tr {\r\n");
      out.write("       border: 1px solid #A4A4A4; /* 행에 경계선을 추가합니다. */\r\n");
      out.write("     }\r\n");
      out.write("   \r\n");
      out.write("     th, td {\r\n");
      out.write("       padding: 8px; /* 셀 내부 여백을 설정합니다. */\r\n");
      out.write("       border: 1px solid #A4A4A4;\r\n");
      out.write("     }\r\n");
      out.write("     \r\n");
      out.write("     .Va_Table_S tr:nth-child(even) {\r\n");
      out.write("         background-color: #f0f0f0;\r\n");
      out.write("     }\r\n");
      out.write("     .Va_Table_S{\r\n");
      out.write("     	width:1400px;\r\n");
      out.write("     }\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container2\" style=\"margin: 0; height:100%;\">\r\n");
      out.write("      <div style=\"height:100%; max-height:970px;\">\r\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/mainSide-bar.jsp", out, false);
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("   <div style=\"margin: 0; padding: 0; width:100%;\">\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../main/Top-bar.jsp", out, false);
      out.write("\r\n");
      out.write("      <br>\r\n");
      out.write("      <span style=\"margin-left:50px; font-size:20px; line-height:1; color: #337ab7;\"><strong>휴가 현황</strong></span>\r\n");
      out.write("      <div class=\"alert\" style=\"background-color: whitesmoke; height: auto\">\r\n");
      out.write("      </div>\r\n");
      out.write("         <span style=\"color: #337ab7; line-height:1; margin-left:1374px;\">HOME</span><span style=\"line-height:1;\">&nbsp;/ 휴가 / 휴가 현황</span>\r\n");
      out.write("          <table style=\"margin-left:auto; margin-right:auto; border-top:2px solid #1C1C1C; background-color : white; border-radius: 3px; width:1300px;\">\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th colspan=\"7\" style=\"text-align:left;\"><img src=\"/resources/goats_icon/vacation.png\" width=\"15\" height=\"15\" style=\"position: relative; top:2px;\">휴가 현황</th>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("         <td colspan=\"7\">\r\n");
      out.write("					<table class=\"Va_Table_S\">\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>구분</td>\r\n");
      out.write("							<td>사번</td>\r\n");
      out.write("							<td>이름</td>\r\n");
      out.write("							<td>신청일</td>\r\n");
      out.write("							<td>휴가시작일</td>\r\n");
      out.write("							<td>휴가종료일</td>\r\n");
      out.write("							<td>휴가일수</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"7\">\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("               </table>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/vacation/vacationSelect_.jsp(150,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(aList) > 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/vacation/vacationSelect_.jsp(151,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/views/vacation/vacationSelect_.jsp(151,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/vacation/vacationSelect_.jsp(151,7) '${aList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${aList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("								<tr>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gvtype}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.genum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:split(item.writer, ' ')[1]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_1));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.insertdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gvstartdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gvenddate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("									<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.gvdays}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("								</tr>\r\n");
            out.write("							");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
