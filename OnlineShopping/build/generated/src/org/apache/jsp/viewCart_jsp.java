package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class viewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/basicStructure.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Online Shopping</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style_2.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html>\n");
      out.write("    <div style=\"visibility: hidden\">\n");
      out.write("        <br />\n");
      out.write("        <a href=\"http://apycom.com/\">Apycom jQuery Menus</a><br />\n");
      out.write("    </div>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/headerlogo.jpg\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\n");
      out.write("        <title></title>\n");
      out.write("\n");
      out.write("        <link type=\"text/css\" href=\"css/menu.css\" rel=\"stylesheet\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/menu.js\"></script>\n");
      out.write("        <title>Online Shopping</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            * { margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            *{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #wrapper{\n");
      out.write("                width:960px;\n");
      out.write("                margin:0 auto;\n");
      out.write("                text-align:left;\n");
      out.write("            }\n");
      out.write("            body { background:#555 url(images/bg.jpg); }\n");
      out.write("            #menu { top:-22px; }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li><a href=\"home.jsp\"><span>Home</span></a>\n");
      out.write("                     &nbsp;\n");
      out.write("                &nbsp;\n");
      out.write("                \n");
      out.write("                <li><a href=\"home.jsp\" class=\"parent\"><span>Look For BOOKS</span></a>\n");
      out.write("                    <div class=\"columns two\">\n");
      out.write("                        <ul class=\"one\">\n");
      out.write("                            <li><a><span><b><h3>Books</h3></b></span></a></li>\n");
      out.write("                            <li><a href=\"Shop.jsp\" id=\"Academic And Professional\"><span>Academic & Professional</span></a></li>\n");
      out.write("                            <li><a href=\"Shop.jsp\" id=\"Entrance Exam\"><span>Entrance Exam</span></a></li>\n");
      out.write("                            <li><a href=\"Shop.jsp\" id=\"Literature And Fiction\"><span>Literature & Fiction</span></a></li>\n");
      out.write("                            <li><a href=\"Shop.jsp\" id=\"Children\"><span>Children</span></a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </li>                                               \n");
      out.write("                &nbsp;\n");
      out.write("                &nbsp;\n");
      out.write("                <li class=\"last\"><a href=\"viewCart.jsp\"><span>View Cart</span></a></li>\n");
      out.write("                <li class=\"last\"><a href=\"#\"><span>Contact Us</span></a></li>\n");
      out.write("                <li><a ><span></span></a></li>\n");
      out.write("                <li><a><span></span></a></li>\n");
      out.write("                <li><a href=\"LogIn.jsp\"><span>LogOut</span></a></li>\n");
      out.write("           </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        <h2><center><h2>You have Following in you Cart</h2></center></h2> \n");
      out.write("        ");

            try {
                Statement prmt;
                ResultSetMetaData rsmd = null;
                ResultSet rs;
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");

                prmt = con.createStatement();

                rs = prmt.executeQuery("select *from mycart");
    //out.print(rs);
        
      out.write("\n");
      out.write("        <div class=\"plans\">\n");
      out.write("            ");

                while (rs.next()) {


            
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"plan\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("                    <h3 class=\"plan-title\">");
      out.print( rs.getString(2));
      out.write("</h3>\n");
      out.write("                    <p class=\"plan-price\">");
      out.print( rs.getFloat(3));
      out.write(" <span class=\"plan-unit\">Per Copy</span></p>\n");
      out.write("                    <ul class=\"plan-features\">\n");
      out.write("                      \n");
      out.write("                        <center>Quantity<span class=\"plan-unit\"> ");
      out.print( rs.getInt(4));
      out.write(" </span></center>\n");
      out.write("                        <center>Genre<span class=\"plan-unit\">");
      out.print( rs.getFloat(5));
      out.write("</span></center>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");

                con.close();
            } catch (Exception ex) {
                out.println("Unable to connect to database.");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p><a href=\"home.jsp\" >Home</a> |   <a href=\"contact.jsp  \">Contact Us</a></p>\n");
      out.write("        </footer>\n");
      out.write("        <p>&nbsp;</p>\n");
      out.write("        <p>&nbsp;</p> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
