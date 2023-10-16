/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicer;

import Model.Ban;
import Model.MoiQuanHe;
import Reponsitory.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vutu8
 */
public class MoiQuanHe_Service {

    Connection con = DBConnection.getConnect();

     public List<MoiQuanHe> getAll(){
        List<MoiQuanHe> list = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnect();
            String query = "select Id, Ten from MoiQuanHe";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new MoiQuanHe(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
