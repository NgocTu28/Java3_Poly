/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide6;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WIN
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=DEMODB;"  ;
            String username = "demo";
            String password = "demo";
            Connection con = DriverManager.getConnection(connectionUrl, username, password);
            
            System.out.println("Connection is opend");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
