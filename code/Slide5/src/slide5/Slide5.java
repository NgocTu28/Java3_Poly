/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide5;

import java.sql.*;

/**
 *
 * @author vutu8
 */
public class Slide5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con1 = getConnect();
        if (con1 != null) {
            System.out.println("DONE");
        } else {
            System.out.println("FAIL");
        }

        findNganh("K13.1-MOB");
        delete("PH00123");
    }

    public static String USER = "sa";
    public static String PASS = "abc12345";
    public static String URL = "jdbc:sqlserver://localhost;databaseName=QLSV_SU23 ;user=sa ;password=abc12345; encrypt=true;trustServerCertificate=true;";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Connection getConnect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static void findNganh(String maNganh) {
        Connection con = getConnect();
        String sql = "select * from NGANH Where MaNganh like ?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, maNganh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString(1) + rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public static void delete(String ma) {
        try {
            Connection cn = getConnect();

            String query = "Delete from SINHVIEN where Masv like ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
