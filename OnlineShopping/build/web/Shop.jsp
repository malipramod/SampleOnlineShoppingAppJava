<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html>
    <head>
        <title>Online Shopping</title>
        <link rel="stylesheet" href="css/style_2.css">
    </head>
    <body>
        <%@include  file="basicStructure.jsp"%>
        <%
            try {
                Statement prmt;
                ResultSetMetaData rsmd = null;
                ResultSet rs;
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");

                prmt = con.createStatement();

                rs = prmt.executeQuery("select *from books");
  
        %>
        <div class="plans">
            <%
                while (rs.next()) {


            %>

            <div class="plan">

                <form action="AddToCartServlet" method="post">
                    <%
                        int id=rs.getInt(1);
                        String bookName=rs.getString(2);
                        String author=rs.getString(3);
                        String publisher=rs.getString(4);
                        double price=rs.getFloat(5);
                        String genre=rs.getString(6);
                    %>
                    <h3 class="plan-title"><%= bookName%></h3>
                    <p class="plan-price"><%= price%> <span class="plan-unit">Per Copy</span></p>
                    <ul class="plan-features">
                        <center>Author<span class="plan-unit"><%= author%></span></center>
                        <center>Publisher<span class="plan-unit"> <%= publisher%> </span></center>
                        <center>Genre<span class="plan-unit"><%= genre%></span></center>
                        <center> Quantity:<input type="text" name="txtQuantity" size="5" value="1"></center>
                    </ul>
                        <input type="hidden" name="txtHidden" value="<%=id%>" >
                    <center><input type="submit" value="Add to Cart" class="plan-button"></center>  
                </form>
            </div>

            <%
                }
            %>
        </div>
        <%
                con.close();
            } catch (Exception ex) {
                out.println("Unable to connect to database.");
            }
        %>
        
        <footer>
            <p><a href="home.jsp" >Home</a> </p>
        </footer>
        <p>&nbsp;</p>
        <p>&nbsp;</p> 



    </body>
</html>
