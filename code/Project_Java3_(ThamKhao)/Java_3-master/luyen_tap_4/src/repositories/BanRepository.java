package repositories;

import java.util.ArrayList;
import java.util.List;
import models.Ban;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.MoiQuanHe;
import utils.JdbcUtil;

public class BanRepository {

    public List<Ban> getAll() {
        List<Ban> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "select a.Ma, a.Ten, a.NgaySinh, a.SoThich, a.TrangThai, b.Ma, b.Ten from ban a left join MoiQuanHe b on a.IdMQH = b.Id";
            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString(6);
                String ten = rs.getString(7);
                MoiQuanHe mqh = new MoiQuanHe(ma, ten);
                list.add(new Ban(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getInt(5), mqh));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(Ban b) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "insert into ban (Ma, Ten, NgaySinh, SoThich, TrangThai, IdMQH) values (?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, b.getId());
            ps.setString(2, b.getTen());
            ps.setDate(3, b.getNgaySinh());
            ps.setString(4, b.getSoThich());
            ps.setInt(5, b.getTrangThai());
            ps.setString(6, b.getMoiQuanHe().getId());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, Ban b) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "update ban set Ten = ?, NgaySinh = ?, SoThich = ?, TrangThai = ?, IdMQH = ? where Ma = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, b.getTen());
            ps.setDate(2, b.getNgaySinh());
            ps.setString(3, b.getSoThich());
            ps.setInt(4, b.getTrangThai());
            ps.setString(5, b.getMoiQuanHe().getId());
            ps.setString(6, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "delete from ban where Ma = ?";
            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
