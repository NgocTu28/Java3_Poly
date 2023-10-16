package Slide7demojdbc;

import demoJdbc.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CapNhatSanPham {

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
            Product p = new Product(4, "Giay Vans" , 100,"WHITE", 199999, 1);
            String query = "UPDATE san_pham SET don_gia = ?,"
                    + "so_luong=?,"
                    + "mau_sac=? WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setDouble(1, p.getPrice());
            ps.setInt(2, p.getQuantity());
            ps.setString(3, p.getColor());
            ps.setInt(4, p.getId());
            
            ps.execute();
            
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
