package baitapjdbc;

import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bai1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";

            Connection cn = DriverManager.getConnection(url, "sa", "123456");

            Product p1 = new Product(6, "Áo thun cộc tay Mẫu 1", "WHITE", 200, 95000, 1);
            Product p2 = new Product(7, "Áo thun cộc tay Mẫu 2", "GREEN", 250, 105000, 1);
            Product p3 = new Product(8, "Quần đùi Mẫu 1", "BLACK", 100, 195000, 2);
            String query = "INSERT INTO san_pham (ten,  so_luong, mau_sac, don_gia, danh_muc_id) VALUES (?,?,?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, p3.getName());
            ps.setInt(2, p3.getQuantity());
            ps.setString(3, p3.getColor());
            ps.setDouble(4, p3.getPrice());
            ps.setInt(5, p3.getCate_id());

            ps.execute();

            System.out.println("Thành công");

            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
