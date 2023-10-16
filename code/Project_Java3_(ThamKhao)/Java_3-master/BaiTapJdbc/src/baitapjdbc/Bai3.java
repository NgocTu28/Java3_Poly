
package baitapjdbc;

import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Bai3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";

            Connection cn = DriverManager.getConnection(url, "sa", "123456");

            String query = "SELECT * FROM san_pham";
            
            PreparedStatement ps = cn.prepareStatement(query);

            ArrayList<Product> list = new ArrayList<>();
           
            ResultSet rs =  ps.executeQuery();
            
            while(rs.next()){
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getInt(3), rs.getDouble(5), rs.getInt(6)));
            }
            for (Product xx : list) {
                System.out.println(xx);
            }
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
