/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide5;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author WIN
 */
public class Employee {

    public static void main(String[] args) throws SQLException {
//        String server = "NGUYENCONGTHANG\\SQLEXPRESS";
//        String user = "sa";
//        String password = "123456";
//        String db = "DEMODB";
//        int port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser(user);
//        ds.setPassword(password);
//        ds.setDatabaseName(db);
//        ds.setServerName(server);
//        ds.setPortNumber(port);
//        try (Connection conn = ds.getConnection();
//                //            System.out.println("Kết nối thành công");
//                //            System.out.println(conn.getCatalog());
//                Statement stmt = conn.createStatement();) {
//            String SQL = "SELECT * FROM Employee";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while (rs.next()) {
//                System.out.println(rs.getString("Id") + " " + rs.getString("first") + " " + rs.getString("last") + " " + rs.getString("age"));
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=DEMODB";
            connection = DriverManager.getConnection(connectionURL, "sa", "123456");
//            System.out.println("Thành công");
            Statement stmt = connection.createStatement();
            String SQL = "SELECT * FROM Employee";
//            String Insert = "INSERT INTO Employee VALUES (N'Trần Trường',N'Giang',20);";
//            int rs = stmt.executeUpdate(Insert);
                ResultSet rs = stmt.executeQuery(SQL);
//            System.out.println("Thành công");
            
            while(rs.next()){
                System.out.println(rs.getInt("Id") + " " + rs.getString("first") + " " + rs.getString("last") + " " + rs.getInt("age"));
            }
//            String sql = "Update Employee set age=? where id=?";
//            PreparedStatement stm = connection.prepareStatement(sql);
//            stm.setInt(1, 40);
//            stm.setInt(2, 7);
//            int rows = stm.executeUpdate();
        } catch (ClassNotFoundException e) {
        }
    }
}
