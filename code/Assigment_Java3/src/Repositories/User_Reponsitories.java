/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author vutu8
 */
public class User_Reponsitories {

    public Users getToAll() {
        Users us = null;
        Connection con = DBConnection.getConnect();
        String sql = "SELECT * FROM USERS";
        try {
            PreparedStatement ptsm = con.prepareCall(sql);
            ResultSet rs = ptsm.executeQuery();

            while (rs.next()) {
               us = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return us;
    }

    public Users findUser(String user, String pass) {
        Users us = null;
        Connection con = DBConnection.getConnect();
        String sql = "SELECT * FROM USERS WHERE userName = ? AND passWords = ? ";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                us = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    public void addUser(Users us) {
        Connection con = DBConnection.getConnect();
        String sql = "INSERT INTO USERS (userName, passWords, roles) VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, us.getUserName());
            ps.setString(2, us.getPassWord());
            ps.setString(3, us.getRole());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getRole(Users us) {
        Connection con = DBConnection.getConnect();
        String sql = "SELECT roles FROM USERS WHERE userName = ?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, us.getRole());
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
