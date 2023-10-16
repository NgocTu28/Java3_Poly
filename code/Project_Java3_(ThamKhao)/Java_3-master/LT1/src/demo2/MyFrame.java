/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author HieuTT
 */
public class MyFrame  extends JFrame{

    public MyFrame() {
        setTitle("Demo2: My new Frame");
        setLocationRelativeTo(null); //ra giữa màn hình
        setDefaultCloseOperation(EXIT_ON_CLOSE);//tự động đóng khi thoát form
        setSize(300, 200);
        setResizable(false); //không cho thay đổi kích thước màn hình
        setVisible(true);
    }
    
}
