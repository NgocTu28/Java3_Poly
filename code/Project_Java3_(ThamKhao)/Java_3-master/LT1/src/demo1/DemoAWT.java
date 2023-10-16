/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HieuTT
 */
public class DemoAWT extends Frame implements ActionListener{
    Button btnRed,btnYellow;
    Label label = new Label();

    public DemoAWT(String msg) {
        setTitle(msg);
        setLayout(new FlowLayout());
        btnYellow= new Button("Yellow");
        btnRed= new Button("Red");
        add(btnYellow);
        add(btnRed);
        add(label);
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str= e.getActionCommand();
        if(str.equals("Yellow"))
        {
            label.setText("Ban dang chon mau vang");
            this.setBackground(Color.yellow);
        }
        if(str.equals("Red"))
        {
            label.setText("Ban dang chon mau do");
            this.setBackground(Color.red);
        }
    }
    
}
