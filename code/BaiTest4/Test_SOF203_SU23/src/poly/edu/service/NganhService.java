package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import poly.edu.model.Nganh;
import poly.edu.utility.DBContext;

public class NganhService {

    public ArrayList<Nganh> getAllNganh() {
        ArrayList<Nganh> lst = new ArrayList<>();
        String sql = "select * from NGANH";
        Connection cn = DBContext.getConnection();
        PreparedStatement pstm;
        try {
            pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Nganh n = new Nganh();
                n.setMaNganh(rs.getString("maNganh"));
                n.setTenNganh(rs.getString("tenNganh"));
                lst.add(n);
            }
        } catch (Exception ex) {
            Logger.getLogger(NganhService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lst;
    }
}
