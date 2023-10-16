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
public class IPDantri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress address[] = InetAddress.getAllByName("dantri.com.vn");
            for(int i=0; i<address.length; i++)
            {
                System.out.println("Address("+(i+1)+")="+ address[i]);
            }
        } catch (Exception e) {
        }
    }
    
}
