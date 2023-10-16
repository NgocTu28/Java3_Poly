package luyentap1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TacGiaRepository {

    public List<TacGia> getAll() {
        List<TacGia> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM tac_gia";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new TacGia(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String findNameById(int id) {
        String ten = "";
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT ten FROM tac_gia WHERE id = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ten = rs.getString(1);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ten;
    }
    
    public int findIdByName(String text) {
        int id = 0;
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT id FROM tac_gia WHERE ten = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, text);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id = rs.getInt(1);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public void insert(TacGia t){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "INSERT INTO tac_gia (ten, sdt, email) VALUES (?,?,?)";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, t.getTen());
            ps.setString(2, t.getSDT());
            ps.setString(3, t.getEmail());
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, TacGia t){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "UPDATE tac_gia SET ten = ?, sdt = ?, email = ? WHERE id = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, t.getTen());
            ps.setString(2, t.getSDT());
            ps.setString(3, t.getEmail());
            ps.setInt(4, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "DELETE FROM tac_gia WHERE id = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setInt(1, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
