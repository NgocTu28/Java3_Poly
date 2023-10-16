/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vutu8
 */
public class JPanelDemo1 {
    
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo1");
        jf.setLocationRelativeTo(null);
        jf.setSize(400, 200);
        JPanel p = new JPanel();
        jf.add(p);
        JButton buttons[] = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            p.add(buttons[i]);
        }
        jf.setVisible(true);
    }
}
