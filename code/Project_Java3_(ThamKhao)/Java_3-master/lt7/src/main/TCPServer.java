/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author HieuTT
 */
public class TCPServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String clientSentence, capitalizedSentence;       
       try
       {
           //tạo sẵn socket có cổng 6789
           ServerSocket wellcomeSocket= new ServerSocket(6789);
           
           //Đợi đến khi có socket từ client gửi đến
           while(true){
               Socket connectionSocket= wellcomeSocket.accept();
               //Tạo inputStream đính kèm vào socket
               InputStreamReader isrClient= new InputStreamReader(connectionSocket.getInputStream());
               BufferedReader infromClient = new BufferedReader(isrClient);
                //Đọc dòng ký tự trong socket
               clientSentence= infromClient.readLine();
               //Tạo outputStream đính kèm vào socket
               DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
                            
               capitalizedSentence= clientSentence.toUpperCase()+"\n";
               //Ghi dòng ký tự đã biến đổi vào socket
               outToClient.writeBytes(capitalizedSentence);
           }       
       }catch(Exception ex)
       {
           System.out.println("ex from Server:"+ ex);
       }    
    }    
}
