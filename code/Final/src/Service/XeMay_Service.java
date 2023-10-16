/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.XeMay;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class XeMay_Service {

    Connection con = DBConnection.getConnect();

    public ArrayList<XeMay> getToAll() {
        String sql = "select Ma, Ten, TrangThai ,GiaBan, GiaNhap,  SoLuong from XeMay";
        ArrayList<XeMay> list = new ArrayList<>();

        try {
            PreparedStatement pstm = con.prepareCall(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                XeMay xm = new XeMay();
                xm.setMa(rs.getString(1));
                xm.setTen(rs.getString(2));
                xm.setTrangThai(rs.getBoolean(3));
                xm.setGiaBan(rs.getInt(4));
                xm.setGiaNhap(rs.getInt(5));
                xm.setSoLuong(rs.getInt(6));
                list.add(xm);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void add(XeMay xm) {
        String sql = "Insert into XeMay (Ma, Ten, TrangThai ,GiaBan, GiaNhap,  SoLuong) values (?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, xm.getMa());
            pstm.setString(2, xm.getTen());
            pstm.setBoolean(3, xm.getTrangThai());
            pstm.setInt(4, xm.getGiaBan());
            pstm.setInt(5, xm.getGiaNhap());
            pstm.setInt(6, xm.getSoLuong());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void update(XeMay xm) {
        String sql = "Update XeMay set Ten = ?, TrangThai = ? ,GiaBan = ?, GiaNhap = ?,  SoLuong = ? where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(6, xm.getMa());
            pstm.setString(1, xm.getTen());
            pstm.setBoolean(2, xm.getTrangThai());
            pstm.setInt(3, xm.getGiaBan());
            pstm.setInt(4, xm.getGiaNhap());
            pstm.setInt(5, xm.getSoLuong());
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void remove(String ma) {
        String sql = "delete from XeMay where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, ma);
           
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public XeMay getKey (XeMay xm) {
        String sql = "select * from XeMay where Ma = ?";
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, xm.getMa());
           
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return xm;
    }
    
}
