package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcUtil;

public class HangDienThoaiRepository {
    
    public List<String> getTenHang(){
        List<String> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "SELECT ten_hang FROM hang_dien_thoai";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new String(rs.getString(1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public String findNameById(int id){
        String ten = "";
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "select ten_hang from hang_dien_thoai where id = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ten = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ten;
    }
    
    public int findIdByName(String name){
        int id = 0;
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "select id from hang_dien_thoai where ten_hang = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
}
