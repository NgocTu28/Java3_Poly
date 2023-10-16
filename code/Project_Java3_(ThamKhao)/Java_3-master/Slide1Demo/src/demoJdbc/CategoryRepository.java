package demoJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    public void insert(Category c) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "INSERT INTO danh_muc (ten,  mo_ta, trang_thai) VALUES (?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, c.getTen());
            ps.setString(2, c.getMota());
            ps.setBoolean(3, c.isTrangThai());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Category c) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "UPDATE danh_muc SET ten = ?, mo_ta = ?, trang_thai = ? WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, c.getTen());
            ps.setString(2, c.getMota());
            ps.setBoolean(3, c.isTrangThai());
            ps.setInt(4, id);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void delete(int id) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM danh_muc WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setInt(1, id);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Category> all() {
        List<Category> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM danh_muc";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getBoolean(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
}
