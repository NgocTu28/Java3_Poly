/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author vutu8
 */
public class DBConnect {

    public static String USER = "sa";
    public static String PASSWORD = "abc12345";
    public static String URLS = "jdbc:sqlserver://localhost;databaseName=PFL_DAOTAO  ;user=sa ;password=abc12345; encrypt=true;trustServerCertificate=true;";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URLS, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public static void main(String[] args) {
        Connection con = DBConnect.getConnection();
        if(con == null){
            System.out.println("Thất Bại");
        }else {
            System.out.println("Thành Công");
        }
    }
}
