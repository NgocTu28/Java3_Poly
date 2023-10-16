package Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectDatabase {

    public static Connection conect(String database) {
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + database;
            cn = DriverManager.getConnection(url, "sa", "123456");
        } catch (Exception e) {
            return null;
        }
        return cn;
    }
}
