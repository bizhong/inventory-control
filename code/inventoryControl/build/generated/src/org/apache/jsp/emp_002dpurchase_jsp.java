package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emp_002dpurchase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>提出购买订单</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            request.setCharacterEncoding("UTF-8");
            session = request.getSession(true);//获取会话对象
            String employee = (String)session.getAttribute("EMPLOYEE_NO");//从会话中获取用户名
            if(employee==null){
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h1>提出购买订单</h1>\n");
      out.write("                <h2>你有权对以下产品表中的产品提出购买订单</h2>\n");
      out.write("                <div class=\"trigger\">\n");
      out.write("                    你好，<a>");
      out.print(employee);
      out.write("</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"emp-purchase.jsp\">提出购买订单</a></li>\n");
      out.write("                    <li><a href=\"emp-purchase-order.jsp\">购买订单</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            ");

                java.sql.Connection conn = null;
                java.lang.String strConn;
                java.sql.Statement sqlStmt = null;//语句对象
                java.sql.ResultSet sqlRst = null;//结果集对象
                try{
                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                    conn = java.sql.DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=库存控制","sa","bizhongbio");
                    sqlStmt = conn.createStatement();
                    //执行SQL语句
                    String sqlQuery = "SELECT * FROM Product";
                    sqlRst = sqlStmt.executeQuery(sqlQuery);
            
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h2>产品表</h2>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>产品代码</td>\n");
      out.write("                        <td>产品名称</td>\n");
      out.write("                        <td>产品编号</td>\n");
      out.write("                        <td>产品单价</td>\n");
      out.write("                        <td>现存数量</td>\n");
      out.write("                        <td>订货点水平</td>\n");
      out.write("                        <td>再订购数量</td>\n");
      out.write("                        <td>订货提前期</td>\n");
      out.write("                        <td>产品分类代码</td>\n");
      out.write("                        <td>再次购买</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 while(sqlRst.next()){//取得下一条记录 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("productNo"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("productName"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("serialNo"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("unitPrice"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("quantityOnHand"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("reorderLevel"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("reorderQuantity"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("reorderLeadTime"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(sqlRst.getString("categoryNo"));
      out.write("</td>\n");
      out.write("                        <td><a href=\"emp-purchase-add.jsp?productNo=");
      out.print(sqlRst.getString("productNo"));
      out.write("\">再次购买</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </table>\n");
      out.write("                ");

                    }catch(Exception e){
                        out.println(e.toString());
                        e.printStackTrace();
                    }finally{
                        try{
                            if(conn!=null) conn.close();
                        }catch(Exception e){
                            out.println(e.toString());
                            e.printStackTrace();
                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
