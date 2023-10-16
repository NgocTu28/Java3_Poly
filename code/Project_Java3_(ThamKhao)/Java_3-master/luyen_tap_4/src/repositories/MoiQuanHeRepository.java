package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.MoiQuanHe;
import utils.JdbcUtil;

public class MoiQuanHeRepository {
    
    public List<MoiQuanHe> getAll(){
        List<MoiQuanHe> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();
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
