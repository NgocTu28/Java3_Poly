package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.Nganh;
import poly.edu.model.SinhVien;
import poly.edu.utility.DBContext;

public class SinhVienService {

    public ArrayList<SinhVien> getAllSinhVien() {
        ArrayList<SinhVien> lst = new ArrayList<>();
        String sql = "select *\n"
                + "from NGANH join SINHVIEN on NGANH.MaNganh = SINHVIEN.MaNganh";
        Connection cn = DBContext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Nganh n = new Nganh();
                n.setMaNganh(rs.getString("maNganh"));
                n.setTenNganh(rs.getString("tenNganh"));

                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setHoTen(rs.getString("hoTen"));
                sv.setGioiTinh(rs.getBoolean("gioiTinh"));
                sv.setNganh(n);
                sv.setDiemTB(rs.getDouble("diemTB"));

                lst.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lst;
    }

    public Integer addSinhVien(SinhVien sv) {
        Integer row = null;
        String sql = "insert SINHVIEN(Masv, Hoten,GioiTinh,MaNganh, DiemTB)\n"
                + "values(?,?,?,?,?)";
        Connection cn = DBContext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, sv.getMaSV());
            pstm.setString(2, sv.getHoTen());
            pstm.setBoolean(3, sv.isGioiTinh());
            pstm.setString(4, sv.getNganh().getMaNganh());
            pstm.setDouble(5, sv.getDiemTB());
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public Integer updateSinhVien(SinhVien sv) {
        Integer row = null;
        String sql = "update SINHVIEN\n"
                + "set Hoten =?, GioiTinh=?, MaNganh=?, DiemTB=?\n"
                + "where Masv=?";
        Connection cn = DBContext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(5, sv.getMaSV());
            pstm.setString(1, sv.getHoTen());
            pstm.setBoolean(2, sv.isGioiTinh());
            pstm.setString(3, sv.getNganh().getMaNganh());
            pstm.setDouble(4, sv.getDiemTB());
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }

    public Integer deleteSinhVien(String masv) {
        Integer row = null;
        String sql = "delete from SINHVIEN\n"
                + "where Masv=?";
        Connection cn = DBContext.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, masv);
           
            row = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row;
    }
}
