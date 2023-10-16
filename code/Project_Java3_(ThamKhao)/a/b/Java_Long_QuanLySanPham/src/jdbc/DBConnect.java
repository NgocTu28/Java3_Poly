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
        DBConnect.cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=QUANLYSANPHAM_JAVA3 ;user=sa ;password=abc12345; encrypt=true;trustServerCertificate=true;";
            DBConnect.cn = DriverManager.getConnection(url, "sa", "abc12345");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return DBConnect.cn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
