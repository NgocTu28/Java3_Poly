
package Reponsitories;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

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

    public static void main(String[] args) {
        Connection con1 = getConnect();
        if (con1 != null) {
            System.out.println("DONE");
        } else {
            System.out.println("FAIL");
        }
    }

}
