/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Product;
import Reponsitory.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import javax.xml.transform.Result;

/**
 *
 * @author vutu8
 */
public class Product_Repo {

    Connection con = DBConnection.getConnect();

    public ArrayList<Product> getToAll() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "Select * from Product";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Product pd = new Product();
                pd.setId(rs.getString(1));
                pd.setName(rs.getString(2));
                pd.setQuantity(rs.getInt(3));
                pd.setPrice(rs.getFloat(4));
                pd.setColor(rs.getString(5));
                pd.setSize(rs.getString(6));

                list.add(pd);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void addProduct(Product pd) {
        String sql = "insert into Product(name, quantity, price, color,size) values (?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pd.getName());
            pstm.setInt(2, pd.getQuantity());
            pstm.setFloat(3, pd.getPrice());
            pstm.setString(4, pd.getColor());
            pstm.setString(5, pd.getSize());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateProduct(Product pd) {
        String sql = "update Product set name=?,quantity = ?, price =? , color = ? , size=?  where id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, pd.getName());
            pstm.setInt(2, pd.getQuantity());
            pstm.setFloat(3, pd.getPrice());
            pstm.setString(4, pd.getColor());
            pstm.setString(5, pd.getSize());
            pstm.setString(6, pd.getId());

            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteProduct(String id) {
        String sql = "delete from Product where id = ? ";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void countId(String id) {
        String sql = "select COUNT(*) from Product where id = ? ";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
