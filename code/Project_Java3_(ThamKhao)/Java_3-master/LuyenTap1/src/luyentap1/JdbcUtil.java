package luyentap1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

    private static Connection cn;

    public static Connection getConnection() {
        if (JdbcUtil.cn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=ql_sach_lt1";
                JdbcUtil.cn = DriverManager.getConnection(url, "sa", "123456");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return JdbcUtil.cn;
    }

    public static int checkSoNguyen(String text) {
        float so = Float.parseFloat(text.trim());
        if (Math.ceil(so) != Math.floor(so)) {
            return 0;
        }
        return 1;
    }
    
    public static int checkLaSo(String text){
        float so;
        try {
            so = Float.parseFloat(text.trim());
            return 1;
        } catch (NumberFormatException e) {
        }
        return 0;
    }
}
