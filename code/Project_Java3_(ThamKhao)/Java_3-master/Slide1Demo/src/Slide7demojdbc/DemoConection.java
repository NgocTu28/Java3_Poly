package Slide7demojdbc;

import demoJdbc.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoConection {

    public static void main(String[] args) {
        try {
            //load driver để kết nối với CSDL
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";
            // tạo kết nối đến CSDL
            Connection cn = DriverManager.getConnection(url, "sa", "123456");
            System.out.println("Thành công");
            //Truy vấn
//            String query = "SELECT * FROM san_pham";
//            Statement st = cn.createStatement();
            Product p = new Product(0, "Giay Vans", 10, "WHITE", 100, 1);
            String query = "INSERT INTO san_pham (ten,  so_luong, mau_sac, don_gia, danh_muc_id) VALUES (?,?,?,?,?)";
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setString(3, p.getColor());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getCate_id());
            
            //thực thi
            ps.execute();
            //đóng kết nối
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
