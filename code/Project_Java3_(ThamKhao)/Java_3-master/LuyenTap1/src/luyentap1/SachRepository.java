
package luyentap1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SachRepository {
    
    public void insert(Sach s){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "INSERT INTO sach (ten, so_luong, don_gia, tac_gia_id) VALUES (?,?,?,?)";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getSoLuong());
            ps.setFloat(3, s.getDonGia());
            ps.setInt(4, s.getTacGiaId());
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, Sach s){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "UPDATE sach SET ten = ?, so_luong = ?, don_gia = ?, tac_gia_id = ? WHERE id = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, s.getTen());
            ps.setInt(2, s.getSoLuong());
            ps.setFloat(3, s.getDonGia());
            ps.setInt(4, s.getTacGiaId());
            ps.setInt(5, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(int id){
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "DELETE FROM sach WHERE id = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setInt(1, id);
            
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Sach> getAll(){
        List<Sach> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "SELECT * FROM sach";
            
            PreparedStatement ps = cn.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                list.add(new Sach(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5)));
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
