
package poly.edu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import poly.edu.model.Nganh;
import poly.edu.utility.DBcontext;

public class NganhService {
    //vào CSDL lấy toàn bộ ngành => đổ vào list => trả về list 
    public ArrayList <Nganh> getAllNganh(){
        ArrayList <Nganh> lst= new ArrayList<>();
        String sql="select * from NGANH";
        //Tạo kết nối
        Connection cn = DBcontext.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {                
                Nganh n = new Nganh();
                n.setMaNganh(rs.getString("maNganh"));
                n.setTenNganh(rs.getString("tenNganh"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }        
        return lst;
    }
}
