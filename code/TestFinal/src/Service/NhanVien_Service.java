/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author vutu8
 */
public class NhanVien_Service {

    Connection con = DBConnection.getConnect();

    public ArrayList<NhanVien> getToAll() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select ID,HoTen,GioiTinh from NHANVIEN ";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setId(rs.getString(1));
                nv.setName(rs.getString(2));
                nv.setGioiTinh(rs.getInt(3));

                list.add(nv);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void addNhanVien(NhanVien nv) {
        String sql = "insert into NHANVIEN (HoTen,GioiTinh) values (?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nv.getName());
            pstm.setInt(2, nv.getGioiTinh());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateNhanVien(NhanVien nv) {
        String sql = "update NHANVIEN set HoTen = ?,GioiTinh = ? where ID = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, nv.getName());
            pstm.setInt(2, nv.getGioiTinh());
            pstm.setString(3, nv.getId());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeNhanVien(String id) {
        String sql = "Delete from NHANVIEN where ID = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
