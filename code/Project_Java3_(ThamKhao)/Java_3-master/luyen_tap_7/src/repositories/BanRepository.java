package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Ban;
import utils.JdbcUtil;

public class BanRepository {
    public List<Ban> getAll(){
        List<Ban> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "select Ma, Ten, SoThich, GioiTinh from Ban";
            
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Ban(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void update(String ma, Ban b){
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "update Ban set Ten = ?, SoThich = ?, GioiTinh = ? where Ma = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, b.getTen());
            ps.setString(2, b.getSoThich());
            ps.setInt(3, b.getGioiTinh());
            ps.setString(4, b.getMa());
            
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(String ma){
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "delete from Ban where Ma = ?";
            
            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);
            
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
