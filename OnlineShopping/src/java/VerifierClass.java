
import java.sql.*;

public class VerifierClass {

    public static boolean checkUser(String userName, String password) {
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        boolean flag = false;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");
            pst = con.prepareStatement("select *from usermaster  where userName=? and password=?");
            pst.setString(1, userName);
            pst.setString(2, password);
            rs = pst.executeQuery();
            flag = rs.next();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (InstantiationException e) {
            System.out.println(e);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return flag;
    }

    public static int newUser(String userName, String firstName, String lastName, String password, String eMail) throws InstantiationException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "");
            String sql;
            sql = "INSERT INTO usermaster(EmailAdd,Password,FirstName,LastName,UserName) VALUES(?, ?, ?, ?, ?)";
            stm = con.prepareStatement(sql);
            stm.setString(1, eMail);
            stm.setString(2, password);
            stm.setString(3, firstName);
            stm.setString(4, lastName);
            stm.setString(5, userName);

            int c = stm.executeUpdate();
            if (c > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {

        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
        return 1;
    }
}
