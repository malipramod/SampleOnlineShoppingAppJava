<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<html>
    <head>
        <title>Online Shopping</title>
        <link rel="stylesheet" href="css/style_2.css">
    </head>
    <body>
        <%@include  file="basicStructure.jsp"%>
        <h2><center><h2>You have Following in you Cart</h2></center></h2> 
        <%
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
        %>
        <div class="plans">
            <%
                while (rs.next()) {


            %>

            <div class="plan">
                    <form action="RemoveFromCartServlet" method="post">
                   
                
                    <h3 class="plan-title"><%= rs.getString(2)%></h3>
                    <b>Total</b><p class="plan-price"><%= rs.getFloat(5)%> <span class="plan-unit"></span></p>
                    <ul class="plan-features">
                      
                        <center>Quantity<span class="plan-unit"> <%= rs.getInt(4)%> </span></center>
                        <center>Per Copy<span class="plan-unit"><%= rs.getFloat(3)%></span></center>                        
                    </ul>
                    <input type="hidden" name="txtHidden" value="<%= rs.getInt(1) %>" >
                    <center><input type="submit" value="Remove" class="plan-button"></center> 
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
