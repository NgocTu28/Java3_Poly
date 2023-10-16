/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.DBConnect;

/**
 *
 * @author ThinkPad
 */
public class AccountRepository {

    private Connection cn;

    public AccountRepository() {
        cn = DBConnect.getConnection();
    }

    public Account findAccount(String user, String pass) {
        if (cn != null) {
            try {
                String query = "SELECT * FROM Account WHERE UserName = ? AND Pass = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, user);
                ps.setString(2, pass);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    return new Account(rs.getString(1), rs.getString(2), rs.getString(3));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
                return null;
            }
        }
        return null;
    }
}
