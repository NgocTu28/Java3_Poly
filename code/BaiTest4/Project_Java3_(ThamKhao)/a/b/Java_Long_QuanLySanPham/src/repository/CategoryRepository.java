/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Category;
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
public class CategoryRepository {

    private Connection cn;

    public CategoryRepository() {
        cn = DBConnect.getConnection();
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        if (cn != null) {
            try {
                String query = "SELECT * FROM Category";
                PreparedStatement ps = cn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    list.add(new Category(rs.getInt(1), rs.getString(2)));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return list;

    }

    public String getIdCategoryByName(String name) {
        String id = "";
        if (cn != null) {
            try {
                String query = "SELECT Id FROM Category WHERE CategoryName = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, name);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    return String.valueOf(rs.getInt(1));
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return id;
    }

}
