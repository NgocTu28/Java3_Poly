
package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.Users;
import utils.JdbcUtil;

public class UsersRepository {
    
    public Users findUser(String username,String password){
        Users user = null;
        try {
            Connection cn = JdbcUtil.getConnection();
            
            String query = "SELECT * FROM USERS WHERE username = ? and password = ?";
        
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                user = new Users(rs.getString(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
