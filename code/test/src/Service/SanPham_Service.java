/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SanPham;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author vutu8
 */
public class SanPham_Service {

    Connection con = DBConnection.getConnect();

    public ArrayList<SanPham> getToAll() {
        String sql = "select Ma, Ten,TrangThai, GiaBan,GiaNhap,  SoLuong from XeMay";
        ArrayList<SanPham> list = new ArrayList<>();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaXe(rs.getString(1));
                sp.setTenXe(rs.getString(2));
                sp.setTrangThai(rs.getBoolean(3));
                sp.setGiaBan(rs.getInt(4));
                sp.setGiaNhap(rs.getInt(5));
                sp.setSoLuong(rs.getInt(6));

                list.add(sp);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void add(SanPham sp) {
        String sql = "insert into XeMay(Ma, Ten,TrangThai, GiaBan,GiaNhap,  SoLuong) values (?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, sp.getMaXe());
            pstm.setString(2, sp.getTenXe());
            pstm.setBoolean(3, sp.getTrangThai());
            pstm.setInt(4, sp.getGiaBan());
            pstm.setInt(5, sp.getGiaNhap());
            pstm.setInt(6, sp.getSoLuong());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "1");
        }
    }

    public void update(SanPham sp) {
        String sql = "Update XeMay set Ten = ?,TrangThai = ?, GiaBan = ?,GiaNhap = ?,  SoLuong = ? where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(6, sp.getMaXe());
            pstm.setString(1, sp.getTenXe());
            pstm.setBoolean(2, sp.getTrangThai());
            pstm.setInt(3, sp.getGiaBan());
            pstm.setInt(4, sp.getGiaNhap());
            pstm.setInt(5, sp.getSoLuong());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "2");
        }
    }

    public void remove(String ma) {
        String sql = "Delete from XeMay where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, ma);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "1");
        }
    }

    public SanPham getKey(SanPham sp) {
        String sql = "select  Ten,TrangThai, GiaBan,GiaNhap,  SoLuong from XeMay where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, sp.getMaXe());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "1");
        }
        return sp;
    }
}
