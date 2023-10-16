/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.Students;
import java.awt.print.Paper;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author vutu8
 */
public class Students_Repositories {

    ArrayList<Students> listSinhVien = new ArrayList<>();

    public ArrayList<Students> getToAll()  {
        ArrayList<Students> listSinhVien = new ArrayList<>();
        Connection con = DBConnection.getConnect();
        String sql = "SELECT * FROM STUDENTS";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                listSinhVien.add(new Students(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listSinhVien;
    }

    public void addStudent(Students st) {
        Connection con = DBConnection.getConnect();
        String sql = "INSERT INTO STUDENTS (maSV,hoTen ,email ,soDT,gioiTinh ,diaChi,hinh) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, st.getMaSV());
            ps.setString(2, st.getHoTen());
            ps.setString(3, st.getEmail());
            ps.setString(4, st.getSoDT());
            ps.setString(5, st.getGioiTinh());
            ps.setString(6, st.getDiaChi());
            ps.setString(7, st.getHinh());

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateStudents(Students st, String masv) {
        Connection con = DBConnection.getConnect();
        String sql = "UPDATE STUDENTS set hoTen = ? ,email = ? ,soDT = ?,gioiTinh = ? ,diaChi = ?,hinh = ? WHERE maSV = ?";
        try {
            PreparedStatement ps = con.prepareCall(sql);

            ps.setString(1, st.getHoTen());
            ps.setString(2, st.getEmail());
            ps.setString(3, st.getSoDT());
            ps.setString(4, st.getGioiTinh());
            ps.setString(5, st.getDiaChi());
            ps.setString(6, st.getHinh());
            ps.setString(7, masv);

            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void removeStudents(String masv) {
        Connection con = DBConnection.getConnect();
        String sql = "DELETE STUDENTS WHERE maSV = ?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, masv);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void searchStudents(String masv) {
        Connection con = DBConnection.getConnect();
        String sql = "SELECT * FROM STUDENTS WHERE masv = ?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, masv);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
