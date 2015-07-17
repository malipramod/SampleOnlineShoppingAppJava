
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddToCartClass {

    public static int addToCart(int id, int quantity) throws InstantiationException {

        Connection con;
        PreparedStatement stm;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");

            st = con.createStatement();
            String sql = "Select *from books where bid='" + id + "'";
            rs = st.executeQuery(sql);
            rs.next();
           
            String bookName = rs.getString(2);
            double price = rs.getFloat(5);
            double amount = price * quantity;

            String sql1 = "INSERT INTO mycart(Name,Price,Quantity,Amount) VALUES(?, ?, ?, ?)";
            stm = con.prepareStatement(sql1);
            stm.setString(1, bookName);
            stm.setDouble(2, price);
            stm.setInt(3, quantity);
            stm.setDouble(4, amount);

            int c = stm.executeUpdate();
            if (c > 0) {
                return 1;
            } else {
                return 0;
            }
            

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (InstantiationException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 1;
    }

   
}
