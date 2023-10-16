/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author WIN
 */
public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo() {
        prepareGUI();
    }
    
    public static void main(String[] args) {
        SwingControlDemo swd = new SwingControlDemo();
        swd.showCheckBoxDemo();
    }
    
    

    private void showCheckBoxDemo() {
        headerLabel.setText("Coltrol in action: CheckBox");
        
        final JCheckBox chkApple = new JCheckBox("Apple");
        final JCheckBox chkMango = new JCheckBox("Mango");
        final JCheckBox chkPeer = new JCheckBox("Peer");
        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);
        
        chkApple.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Apple CheckBox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }        
        });
        chkMango.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Mango CheckBox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }        
        });
        chkPeer.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Peer CheckBox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }        
        });
        
        controlPanel.add(chkPeer);
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        
        mainFrame.setVisible(true);
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //To change body of generated methods, choose Tools | Templates.
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        
        statusLabel.setSize(350,100);
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    
}
