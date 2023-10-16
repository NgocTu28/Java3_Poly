/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.InetAddress;

/**
 *
 * @author HieuTT
 */
public class IPLocalhost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println("Host address:"+ myHost.getHostAddress());
            System.out.println("Host name:"+ myHost.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }     
    }
    
}
