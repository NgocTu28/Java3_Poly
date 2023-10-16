package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.ketNoi;
import model.Users;

public class UsersRepository {

    Connection cn;

    public Users findUser(String username, String password) {
        Users user = null;
        try {
            cn = ketNoi.Connect("BMS");
            if (cn != null) {
                String query = "SELECT * FROM users WHERE USERNAME = ? and PASSWORD = ?";
                PreparedStatement ps = cn.prepareStatement(query);
                ps.setString(1, username.trim());
                ps.setString(2, password.trim());

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    user = new Users(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                }
                cn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
