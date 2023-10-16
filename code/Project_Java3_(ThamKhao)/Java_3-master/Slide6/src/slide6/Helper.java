
package slide6;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helper {
    public static Connection ketNoi(String database){
        try {
            String username = "sa";
            String password = "123456";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName="+database;
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
