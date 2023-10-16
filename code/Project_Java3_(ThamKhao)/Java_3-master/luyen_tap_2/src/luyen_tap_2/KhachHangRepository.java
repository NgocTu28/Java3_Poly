package luyen_tap_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository {

    public List<KhachHang> getAll() {
        List<KhachHang> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM khach_hang";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getBoolean(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(KhachHang k) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "INSERT INTO khach_hang (ten, dia_chi, email, tuoi, gioi_tinh) VALUES (?,?,?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, k.getTen());
            ps.setString(2, k.getDiaChi());
            ps.setString(3, k.getEmail());
            ps.setInt(4, k.getTuoi());
            ps.setBoolean(5, k.isGioiTinh());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, KhachHang k) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "UPDATE khach_hang SET ten = ?, dia_chi = ?, email = ?, tuoi = ?, gioi_tinh = ? WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, k.getTen());
            ps.setString(2, k.getDiaChi());
            ps.setString(3, k.getEmail());
            ps.setInt(4, k.getTuoi());
            ps.setBoolean(5, k.isGioiTinh());
            ps.setInt(6, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM khach_hang WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
