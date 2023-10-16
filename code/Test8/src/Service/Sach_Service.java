/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Sach;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;

public class Sach_Service {

    Connection con = DBConnection.getConnect();

    public ArrayList<Sach> getToAll() {
        String sql = "select Masach,TenSach,NXB,MaTheLoai,GiaTien from SACH ";
        ArrayList<Sach> list = new ArrayList<>();
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sach s = new Sach();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                s.setNxb(rs.getString(3));
                s.setMaTheLoai(rs.getString(4));
                s.setGiaTien(rs.getFloat(5));
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void addSach(Sach s) {
        String sql = "insert into SACH (Masach,TenSach,NXB,MaTheLoai,GiaTien) values (?,?,?,?,?)";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, s.getMaSach());
            pstm.setString(2, s.getTenSach());
            pstm.setString(3, s.getNxb());
            pstm.setString(4, s.getMaTheLoai());
            pstm.setFloat(5, s.getGiaTien());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateSach(Sach s) {
        String sql = "Update SACH set TenSach = ?,NXB = ?,MaTheLoai = ?,GiaTien = ? Where Masach = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(5, s.getMaSach());
            pstm.setString(1, s.getTenSach());
            pstm.setString(2, s.getNxb());
            pstm.setString(3, s.getMaTheLoai());
            pstm.setFloat(4, s.getGiaTien());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeSach(String maSach) {
        String sql = "Delete from SACH where Masach = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maSach);

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

     public Sach getToKey(Sach s) {
        String sql = "select * from SACH where maSach = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, s.getMaSach());
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
}
