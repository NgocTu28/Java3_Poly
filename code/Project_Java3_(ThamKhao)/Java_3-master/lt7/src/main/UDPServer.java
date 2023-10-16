/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author HieuTT
 */
public class UDPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //Tạo DatagramSocket ở cổng 9876
            DatagramSocket serverSocket= new DatagramSocket(6789);
            
            byte recieveData[]= new byte [1024];
            byte sendData[]= new byte[1024];
            
            while(true)
            {
                //Tao Datagram nhận
                DatagramPacket receivePacket= new DatagramPacket(recieveData, recieveData.length);
                
                //nhận Datagram
                serverSocket.receive(receivePacket);
                
                String sentence= new String(receivePacket.getData());
                
                //Nhận địa chỉ IP, cổng của bên gửi
                InetAddress IPAdress = receivePacket.getAddress();
                int port = receivePacket.getPort();
                
                String capitalizeSentence = sentence.toUpperCase();
                sendData=capitalizeSentence.getBytes();
                
                //Tạo Datagram để gửi tới Client
                DatagramPacket sendPacket= new DatagramPacket(sendData, sendData.length, IPAdress, port);
                //Đính datagram vào socket
                serverSocket.send(sendPacket);
            }
            
        }catch(Exception ex)
        {
            System.out.println("Lỗi from Server:"+ ex);
        }
    }
    
}
