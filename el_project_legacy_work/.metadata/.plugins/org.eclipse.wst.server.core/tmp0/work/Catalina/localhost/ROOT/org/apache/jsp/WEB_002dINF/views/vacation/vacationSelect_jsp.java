/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-08-02 08:07:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.vacation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.gt.s.kos.vacation.vo.GtVacationVO;
import com.gt.s.common.CodeUtil;

public final class vacationSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.gt.s.kos.vacation.vo.GtVacationVO");
    _jspx_imports_classes.add("com.gt.s.common.CodeUtil");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

   GtVacationVO vvo = (GtVacationVO)request.getAttribute("vvo");
   String app = vvo.getApprover();
   String count = vvo.getCount();
   String s = CodeUtil.edsmjeoncheck(app, Integer.parseInt(count));

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.quilljs.com/1.3.6/quill.snow.css\"\r\n");
      out.write("   rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.quilljs.com/1.3.6/quill.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("               var app = '");
      out.print(vvo.getApprover());
      out.write("';\r\n");
      out.write("               var dept = '");
      out.print(vvo.getDept());
      out.write("';\r\n");
      out.write("               var pro = '");
      out.print(vvo.getProval());
      out.write("';\r\n");
      out.write("               var appcount = '");
      out.print(vvo.getCount());
      out.write("';\r\n");
      out.write("               var s = '");
      out.print(s);
      out.write("';\r\n");
      out.write("               var app_ = app.split(\"/\");\r\n");
      out.write("               var dept_ = dept.split(\"/\");\r\n");
      out.write("				if(pro != 'null') {\r\n");
      out.write("					var pro_ = pro.split(\"/\");\r\n");
      out.write("				}else {\r\n");
      out.write("					var pro_ = \"\";\r\n");
      out.write("				}\r\n");
      out.write("				console.log(\"s > : \" + s);\r\n");
      out.write("				if(appcount < 0) {\r\n");
      out.write("					var nappcount = Number(appcount) + 10;\r\n");
      out.write("					for(var i=0; i<app_.length; i++) {\r\n");
      out.write("						if(app_[i] != \"-\"){\r\n");
      out.write("							if(app_[i] != \"-\"){\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(1)\").text(\"결재\");\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(2)\").text(app_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(3)\").text(dept_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text(pro_[i]);\r\n");
      out.write("								if($(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text() != \"\") {\r\n");
      out.write("									$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(4)\").text(\"결재완료\");\r\n");
      out.write("								}\r\n");
      out.write("							}\r\n");
      out.write("							if(nappcount == i) {\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(1)\").text(\"결재\");\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(2)\").text(app_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(3)\").text(dept_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text(pro_[i]);\r\n");
      out.write("								if($(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text() != \"\") {\r\n");
      out.write("									$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(4)\").text(\"반려\");\r\n");
      out.write("								}\r\n");
      out.write("							}\r\n");
      out.write("\r\n");
      out.write("						}\r\n");
      out.write("					}\r\n");
      out.write("				}else {\r\n");
      out.write("					if(s != '') {\r\n");
      out.write("						for(var i=0; i<app_.length; i++) {\r\n");
      out.write("							if(app_[i] != \"-\"){\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(1)\").text(\"결재\");\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(2)\").text(app_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(3)\").text(dept_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(appcount-9)+\")\").find(\"td:eq(5)\").text(pro_[0]);\r\n");
      out.write("								if($(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text() != \"\") {\r\n");
      out.write("									$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(4)\").text(\"전결\");\r\n");
      out.write("								}\r\n");
      out.write("							}\r\n");
      out.write("						}\r\n");
      out.write("					}else {\r\n");
      out.write("						for(var i=0; i<app_.length; i++) {\r\n");
      out.write("							if(app_[i] != \"-\"){\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(1)\").text(\"결재\");\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(2)\").text(app_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(3)\").text(dept_[i]);\r\n");
      out.write("								$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text(pro_[i]);\r\n");
      out.write("								if($(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(5)\").text() != \"\") {\r\n");
      out.write("									$(\"#table1\").find(\"tr:eq(\"+(i+1)+\")\").find(\"td:eq(4)\").text(\"결재완료\");\r\n");
      out.write("								}\r\n");
      out.write("							}\r\n");
      out.write("						}\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("            \r\n");
      out.write("               var num = '");
      out.print(vvo.getGvnum() );
      out.write("';\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               url : \"gvfileDownloadlist.gos\",\r\n");
      out.write("               type : \"GET\",\r\n");
      out.write("               data : {\r\n");
      out.write("                  \"gvnum\" : num\r\n");
      out.write("               },\r\n");
      out.write("               success : whens\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            function whens(d) {\r\n");
      out.write("               var filename = d.split(\",\");\r\n");
      out.write("               for (var i = 0; i < filename.length - 1; i++) {\r\n");
      out.write("                  $(\"#table3\").find(\"tr:eq(0)\").find(\"td:eq(0)\").append(\r\n");
      out.write("                        \"<a href='gvfileDownload?file=\" + filename[i]\r\n");
      out.write("                              + \"&num=\" + num + \"' target='_blank'>\"\r\n");
      out.write("                              + filename[i] + \"</a><br>\");\r\n");
      out.write("\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("   <style type=\"text/css\">\r\n");
      out.write("      .button-container {\r\n");
      out.write("         text-align: right;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .initial-size {\r\n");
      out.write("         min-height: 200px;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      th {\r\n");
      out.write("         background-color: #f2f2f2;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      table {\r\n");
      out.write("         border-collapse: collapse;\r\n");
      out.write("         width: 1000px;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      th, td {\r\n");
      out.write("         border: 1px solid black;\r\n");
      out.write("         padding: 8px;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #date {\r\n");
      out.write("         text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      #approval {\r\n");
      out.write("         visibility: hidden;\r\n");
      out.write("         position: absolute;\r\n");
      out.write("         background-color: #fff;\r\n");
      out.write("         width: 100%;\r\n");
      out.write("         height: 100%;\r\n");
      out.write("         margin: auto;\r\n");
      out.write("      }\r\n");
      out.write("   </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div id=\"approval\">\r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../approvalline/select.jsp", out, false);
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   <form name=\"form01\" id=\"form01\">\r\n");
      out.write("      <div>\r\n");
      out.write("         <h2 align=\"center\">휴가 신청서</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <br>\r\n");
      out.write("      <table id=\"gv_form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <th width=\"120px\">문서번호</th>\r\n");
      out.write("            <td width=\"230px\">");
      out.print(vvo.getGvnum());
      out.write("</td>\r\n");
      out.write("            <th width=\"120px\">보안구분</th>\r\n");
      out.write("            <td width=\"230px\">비공개</td>\r\n");
      out.write("            <th width=\"120px\">보존연한</th>\r\n");
      out.write("            <td width=\"230px\">5년</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <th width=\"100px\">작성자</th>\r\n");
      out.write("            <td width=\"230px%\">");
      out.print(vvo.getWriter());
      out.write("</td>\r\n");
      out.write("            <th width=\"100px\">작성일자</th>\r\n");
      out.write("            <td width=\"230px\">");
      out.print(vvo.getInsertdate());
      out.write("</td>\r\n");
      out.write("            <th width=\"120px\">대결자</th>\r\n");
      out.write("            <td width=\"230px\">");
      out.print(vvo.getDecianother());
      out.write("</td>\r\n");
      out.write("            <!-- 작성일자 -->\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <table id=\"table1\">\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th width=\"19px\">순서</th>\r\n");
      out.write("            <th width=\"83px\">구분</th>\r\n");
      out.write("            <th width=\"14px\">결재자</th>\r\n");
      out.write("            <th width=\"14px\">부서</th>\r\n");
      out.write("            <th width=\"14px\">상태</th>\r\n");
      out.write("            <th width=\"14px\">결재일</th>\r\n");
      out.write("            <th width=\"14px\">결재의견</th>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <td>1</td>\r\n");
      out.write("            <td id=\"snag1\"></td>\r\n");
      out.write("            <td id=\"hu1\" class=\"approver\"></td>\r\n");
      out.write("            <td id=\"dep1\" class=\"dept\"></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <td>2</td>\r\n");
      out.write("            <td id=\"snag2\"></td>\r\n");
      out.write("            <td id=\"hu2\"  class=\"approver\"></td>\r\n");
      out.write("            <td id=\"dep2\" class=\"dept\"></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <td>3</td>\r\n");
      out.write("            <td id=\"snag3\"></td>\r\n");
      out.write("            <td id=\"hu3\"  class=\"approver\"></td>\r\n");
      out.write("            <td id=\"dep3\" class=\"dept\"></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <td>4</td>\r\n");
      out.write("            <td id=\"snag4\"></td>\r\n");
      out.write("            <td id=\"hu4\" class=\"approver\"></td>\r\n");
      out.write("            <td id=\"dep4\" class=\"dept\"></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr align=\"center\">\r\n");
      out.write("            <td>5</td>\r\n");
      out.write("            <td id=\"snag5\"></td>\r\n");
      out.write("            <td id=\"hu5\" class=\"approver\"></td>\r\n");
      out.write("            <td id=\"dep5\" class=\"dept\"></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <table id=\"cham1\">\r\n");
      out.write("         <tr>\r\n");
      out.write("          	");
 if(vvo.getReference() == null) {
          		vvo.setReference(" ");
            } 
      out.write("\r\n");
      out.write("            <th width=\"120px\">참 조</th>\r\n");
      out.write("            <td id=\"reference\">");
      out.print(vvo.getReference());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <table>\r\n");
      out.write("         <tr align=\"left\">\r\n");
      out.write("            <th width=\"120px\" style=\"text-align: center;\">제 목</th>\r\n");
      out.write("            <td>");
      out.print(vvo.getGvsubject());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <table>\r\n");
      out.write("         <tr align=\"left\">\r\n");
      out.write("            <th width=\"120px\" style=\"text-align: center;\">일 시</th>\r\n");
      out.write("            <td width=\"346px\" colspan=\"3\">");
      out.print(vvo.getGvstartdate());
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print(vvo.getGvenddate());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th width=\"120px\">기 간</th>\r\n");
      out.write("            <td width=\"700px\" id=\"gvdays1\">");
      out.print(vvo.getGvdays());
      out.write("</td>\r\n");
      out.write("            <th width=\"100px\">구 분</th>\r\n");
      out.write("            <td align=\"center\">");
      out.print(vvo.getGvtype());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table>\r\n");
      out.write("         <br>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th width=\"120px\">사 유</th>\r\n");
      out.write("            <td colspan=\"3\">");
      out.print(vvo.getGvreasons());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th width=\"120px\">연 락 처</th>\r\n");
      out.write("            <td id=\"gehp1\">");
      out.print(vvo.getGehp());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <br>\r\n");
      out.write("      </table>\r\n");
      out.write("      <table>\r\n");
      out.write("         <th width=\"120px\">비고</th>\r\n");
      out.write("         <br>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <td>");
      out.print(vvo.getGvmemo());
      out.write("</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </form>\r\n");
      out.write("   <br>\r\n");
      out.write("   <form id=\"gvfile_form\">\r\n");
      out.write("      <table id=\"table3\"> \r\n");
      out.write("         <tr>\r\n");
      out.write("            <th width=\"120px\">첨부파일</th>\r\n");
      out.write("            <td></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("   </form>\r\n");
      out.write("   <br>\r\n");
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
}
