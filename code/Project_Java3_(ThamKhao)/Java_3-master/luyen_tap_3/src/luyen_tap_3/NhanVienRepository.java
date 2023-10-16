package luyen_tap_3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVienRepository {

    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM nhan_vien";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(NhanVien n) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "INSERT INTO nhan_vien (ten, ma_nv, sdt, tuoi, vai_tro) VALUES (?,?,?,?,?)";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, n.getTen());
            ps.setString(2, n.getMaNV());
            ps.setString(3, n.getSdt());
            ps.setInt(4, n.getTuoi());
            ps.setInt(5, n.getVaiTro());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public NhanVien findNhanVienByMaNV(String maNV) {
        NhanVien nv = null;
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM nhan_vien where ma_nv = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, maNV);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nv;
    }

    public void update(int id, NhanVien n) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "UPDATE nhan_vien SET ten=?, ma_nv=?, sdt=?, tuoi=?, vai_tro=? where id=?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, n.getTen());
            ps.setString(2, n.getMaNV());
            ps.setString(3, n.getSdt());
            ps.setInt(4, n.getTuoi());
            ps.setInt(5, n.getVaiTro());
            ps.setInt(6, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM nhan_vien where id=?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, id);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
