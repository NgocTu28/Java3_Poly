package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

    private static Connection cn;

    public static Connection getConnection() {
        if (JdbcUtil.cn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLY_NET_JAVA_SM22_BL2";
                JdbcUtil.cn = DriverManager.getConnection(url, "sa", "123456");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return JdbcUtil.cn;
    }
}
