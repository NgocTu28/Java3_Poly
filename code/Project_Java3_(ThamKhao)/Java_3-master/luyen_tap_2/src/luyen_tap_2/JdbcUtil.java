package luyen_tap_2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

    private static Connection cn;

    public static Connection getConnection() {
        if (JdbcUtil.cn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=su22b2_sof203";
                JdbcUtil.cn = DriverManager.getConnection(url, "sa", "123456");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return JdbcUtil.cn;
    }
}
