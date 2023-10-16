/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import poly.edu.model.Nganh;
import poly.edu.model.SinhVien;
import poly.edu.utility.DBcontext;

/**
 *
 * @author vutu8
 */
public class SinhVienService {

    public ArrayList<SinhVien> getAllSV() {
        ArrayList<SinhVien> lstSV = new ArrayList<>();
        String sql = "select * from NGANH join SINHVIEN on NGANH.MaNganh = SINHVIEN.MaNganh";
        //Tạo kết nối
        Connection cn = DBcontext.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Nganh n = new Nganh();
                n.setMaNganh(rs.getString("maNganh"));
                n.setTenNganh(rs.getString("tenNganh"));

                SinhVien sv = new SinhVien();
                sv.setMaSV(rs.getString("masv"));
                sv.setHoTen(rs.getString("hoTen"));
                sv.setGioiTinh(rs.getBoolean("GioiTinh"));
                sv.setNganh(n);
                sv.setDiemTB(rs.getDouble("diemTB"));
                lstSV.add(sv);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lstSV;
    }

    public Integer addSV(SinhVien sv) {
        Integer row = null;
        String sql = "insert into SINHVIEN(Masv, Hoten, GioiTinh, MaNganh, DiemTB) values(?,?,?,?,?)";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, sv.getMaSV());
            pstm.setString(2, sv.getHoTen());
            pstm.setBoolean(3, sv.getGioiTinh());
            pstm.setString(4, sv.getNganh().getMaNganh());
            pstm.setDouble(5, sv.getDiemTB());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o them");
        }
        return row;
    }

    public Integer updateSV(SinhVien sv) {
        Integer row = null;
        String sql = "update SINHVIEN\n"
                + "set Hoten =?, GioiTinh=?, MaNganh=?, DiemTB=?\n"
                + "where Masv like ?";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(5, sv.getMaSV());
            pstm.setString(1, sv.getHoTen());
            pstm.setBoolean(2, sv.getGioiTinh());
            pstm.setString(3, sv.getNganh().getMaNganh());
            pstm.setDouble(4, sv.getDiemTB());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o sua");
        }
        return row;
    }

    public Integer deleteSV(String maSV) {
        Integer row = null;
        String sql = "Delete from SINHVIEN Where Masv like ?";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, maSV);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o xoa");
        }
        return row;
    }

}
