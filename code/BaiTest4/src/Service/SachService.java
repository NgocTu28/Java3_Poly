/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Sach;
import Utility.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vutu8
 */
public class SachService {

    public ArrayList<Sach> getAllSach() {
        ArrayList<Sach> list = new ArrayList<>();
        String sql = "select Masach,TenSach,NXB,Giatien from SACH";
        //Tạo kết nối
        Connection cn = DBcontext.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {

                Sach s = new Sach();
                s.setMaSach(rs.getString(1));
                s.setTenSach(rs.getString(2));
                s.setNxb(rs.getString(3));
                s.setGiaTien(rs.getFloat(4));
                list.add(s);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return list;
    }

    public Integer addS(Sach s) {
        Integer row = null;
        String sql = "insert into SACH (Masach,TenSach,NXB,Giatien) values (?,?,?,?)";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, s.getMaSach());
            pstm.setString(2, s.getTenSach());
            pstm.setString(3, s.getNxb());
            pstm.setFloat(4, s.getGiaTien());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o them");
        }
        return row;
    }
    
    public Integer updateS(Sach s) {
        Integer row = null;
        String sql = "update SACH\n"
                + "set TenSach = ?,NXB = ?,Giatien = ? \n"
                + "where Masach like ?";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(4, s.getMaSach());
            pstm.setString(1, s.getTenSach());
            pstm.setString(2, s.getNxb());
            pstm.setFloat(3, s.getGiaTien());

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o update");
        }
        return row;
    }
    
    public Integer deleteS(String maSach) {
        Integer row = null;
        String sql = "Delete from SACH Where Masach like ?";
        Connection con = DBcontext.getConnection();
        try {
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, maSach);

            row = pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println("Loi o xoa");
        }
        return row;
    }
}
