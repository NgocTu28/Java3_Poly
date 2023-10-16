/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author HieuTT
 */
public class UDPClient {
    public static void main(String[] args) {
        try
        {
            //Tạo InputStream va nhap 1 dong
            InputStreamReader isrClient = new InputStreamReader(System.in);
            BufferedReader infromClient = new BufferedReader(isrClient);
            System.out.print("Nhap 1 dong:");
            String sentence = infromClient.readLine();
            
            //Tạo client Socket
            DatagramSocket clientSocket= new DatagramSocket();
            
            //Chuyển hostname thành địa chỉ IP sử dụng DNS
            InetAddress IPAdress=InetAddress.getByName("127.0.0.1"); //không phải Ip của máy cũng OK
            byte senData[]= new byte[1024];
            byte receiveData[]=new byte[1024];
            senData= sentence.getBytes();
            
            //Tạo Datagram cùng với dữ liệu, độ dài, địa chỉ IP, cổng
            DatagramPacket sendPacket= new DatagramPacket(senData, senData.length, IPAdress, 6789);
            
            //Gửi Datagram tới Server
            clientSocket.send(sendPacket);
            
            DatagramPacket receivePacket= new DatagramPacket(receiveData, receiveData.length);
            //Đọc Datagram gửi về từ Server
           clientSocket.receive(receivePacket);
           
           String modifySentence=new String(receivePacket.getData());
            System.out.println("FROM SERVER:"+ modifySentence);
            clientSocket.close();
        }catch(Exception ex)
        {
            System.out.println("Gặp lỗi client: "+ ex);
        }
    }
}
