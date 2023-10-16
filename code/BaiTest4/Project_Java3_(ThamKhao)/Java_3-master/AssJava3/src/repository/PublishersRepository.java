package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.ketNoi;
import model.Publishers;
import model.Users;

public class PublishersRepository {

    Connection cn;

    public PublishersRepository() {
        cn = ketNoi.Connect("BMS");
    }

    public List<Publishers> findAllPub(Users user) {
        List<Publishers> list = new ArrayList<>();
        try {
            if (cn != null) {
                String query = "SELECT DISTINCT A.PUB_ID,A.PUB_NAME,A.PUB_ADDRESS "
                        + "FROM PUBLISHERS A INNER JOIN BOOKS B ON A.PUB_ID = B.PUB_ID "
                        + "INNER JOIN USERS C ON B.USERNAME = C.USERNAME\n"
                        + "WHERE C.USERNAME = ?";

                PreparedStatement ps = cn.prepareStatement(query);
                
                ps.setString(1, user.getUserName());

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Publishers p = new Publishers(rs.getString(1), rs.getString(2), rs.getString(3));
                    list.add(p);
                }
//                for (Publishers xx : list) {
//                    System.out.println(xx);
//                }
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
