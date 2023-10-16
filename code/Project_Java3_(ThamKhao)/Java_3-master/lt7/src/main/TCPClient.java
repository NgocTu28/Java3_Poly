/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author HieuTT
 */
public class TCPClient {
    public static void main(String[] args) {
      String sentence,modifySentence;       
      try{
           //Tao inputStream
        InputStreamReader isrUser= new InputStreamReader(System.in);
        BufferedReader infromUser= new BufferedReader(isrUser);
        System.out.println("Nhap chuoi ky tu:");
        sentence=infromUser.readLine();
       
        //Tao client socket ket noi voi server
        Socket clientSocket=new Socket("127.0.0.1", 6789);        //không phải ip của máy mình cũng OK
        DataOutputStream outToServer= new DataOutputStream(clientSocket.getOutputStream());
        //Gui dong ky tu den server
       outToServer.writeBytes(sentence+"\n");
        
        //Tạo inputStream đính kèm vào Socket
       InputStreamReader isrServer= new InputStreamReader(clientSocket.getInputStream());
       BufferedReader infromServer = new BufferedReader(isrServer);
       //doc dong ky tu da bien doi tu Server
       modifySentence= infromServer.readLine();
       System.out.println("FROM SERVER:"+ modifySentence);
       clientSocket.close();          
      }  catch(Exception ex)
      {
          System.out.println("ex from client:"+ ex);
      }      
    }
}
