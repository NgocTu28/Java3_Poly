package baitapjdbc;

import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Bai2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";

            Connection cn = DriverManager.getConnection(url, "sa", "123456");
            Product p1 = new Product(6, "Áo thun cộc tay Mẫu 1", "WHITE", 200, 200000, 1);
            String query = "UPDATE san_pham SET don_gia = ? WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setDouble(1, p1.getPrice());
            ps.setInt(2, p1.getId());

            ps.execute();
            System.out.println("Thành công");

            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
