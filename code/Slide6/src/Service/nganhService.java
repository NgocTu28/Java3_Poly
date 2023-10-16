/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Nganh;
import Reponsitories.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author vutu8
 */
public class nganhService {
    
    ArrayList<Nganh> list = new ArrayList<>();

    public ArrayList<Nganh> getToAll() {
        String sql = "Select * from NGANH";
        Connection con = DBConnection.getConnect();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
               list.add(new Nganh(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    
    
}
