/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ThinkPad
 */
public class DBConnect {

    private static Connection cn;

    public static Connection getConnection() {
        cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-R62M4P0\\SQLEXPRESS:1433;databaseName=BookDBI";
            DBConnect.cn = DriverManager.getConnection(url, "sa", "123456");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return DBConnect.cn;
    }

}
