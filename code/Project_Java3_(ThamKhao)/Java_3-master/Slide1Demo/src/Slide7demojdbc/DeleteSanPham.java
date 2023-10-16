
package Slide7demojdbc;

import demoJdbc.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteSanPham {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";
            // tạo kết nối đến CSDL
            Connection cn = DriverManager.getConnection(url, "sa", "123456");
            System.out.println("Thành công");
            //Truy vấn
//            String query = "SELECT * FROM san_pham";
//            Statement st = cn.createStatement();
            Product p = new Product(4, "Giay Vans", 100, "WHITE", 199999, 1);
            String query = "DELETE FROM san_pham WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, p.getId());
            
            ps.execute();
            
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
