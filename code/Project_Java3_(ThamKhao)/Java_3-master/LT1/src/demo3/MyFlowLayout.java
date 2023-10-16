/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;


import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HieuTT
 */
public class MyFlowLayout extends JFrame{
    public MyFlowLayout() {
        setTitle("My Flow Layout");
        setLocation(200, 200);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        JPanel p = new JPanel(); //Flow Layout
       // JPanel p= new JPanel(new GridLayout(3, 3));
        add(p);
        JButton buttons[] = new JButton[9];
        for(int i=0; i<9; i++)
        {
            buttons[i]= new JButton("Button "+ (i+1));
            p.add(buttons[i]);
        }
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFlowLayout();
    }
    
}
