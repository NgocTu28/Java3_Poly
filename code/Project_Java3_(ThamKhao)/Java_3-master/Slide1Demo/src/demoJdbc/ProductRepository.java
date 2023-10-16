package demoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void insert(Product p) {
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "INSERT INTO san_pham (ten, so_luong, mau_sac, don_gia, danh_muc_id) VALUES (?,?,?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setString(3, p.getColor());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getCate_id());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void update(int id, Product p) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "UPDATE san_pham SET ten = ?, so_luong = ?, mau_sac = ?, don_gia = ?, danh_muc_id = ? WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQuantity());
            ps.setString(3, p.getColor());
            ps.setDouble(4, p.getPrice());
            ps.setInt(5, p.getCate_id());
            ps.setInt(6, id);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void delete(int id) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM san_pham WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Product> all() {
        List<Product> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM san_pham";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getDouble(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
