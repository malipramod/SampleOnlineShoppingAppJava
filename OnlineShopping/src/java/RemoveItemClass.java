
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveItemClass {

    public static int removeItem(int id) {
        Connection con;
        PreparedStatement stm;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");
            String sql = "Delete from mycart where CID='"+id+"'";
            stm = con.prepareStatement(sql);
             int c = stm.executeUpdate();
            if (c > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (ClassNotFoundException e) {
                e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
