/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author WIN
 */
public class AWTFrameDemo extends Frame implements ActionListener {

    Button btnRed, btnYellow;

    public AWTFrameDemo(String string) throws HeadlessException {
        super(string);

        btnRed = new Button("Red");
        btnYellow = new Button("Yellow");

        setLayout(new FlowLayout());
        add(btnRed);
        add(btnYellow);
        btnRed.addActionListener(this);
        btnYellow.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("Red")){
            setBackground(Color.red);
        }else{
            setBackground(Color.yellow);
        }
    }

    public static void main(String[] args) {
        AWTFrameDemo frame = new AWTFrameDemo("Demo AWT");
        frame.setSize(300, 200);
        frame.addWindowListener(new WindowAdapter() {
            {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        });
        frame.setVisible(true);
    }

}
