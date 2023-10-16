/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author HieuTT
 */
public class DownloadTaiNguyen extends javax.swing.JFrame {

    /**
     * Creates new form DownloadTaiNguyen
     */
    public DownloadTaiNguyen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfURL = new javax.swing.JTextField();
        btnDownLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taContent = new javax.swing.JTextArea();
        btnSaveFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Download Tài nguyên Internet");

        jLabel1.setText("Địa chỉ");

        tfURL.setText("https://vnexpress.net");

        btnDownLoad.setText("Tải");
        btnDownLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownLoadActionPerformed(evt);
            }
        });

        taContent.setEditable(false);
        taContent.setColumns(20);
        taContent.setRows(5);
        jScrollPane1.setViewportView(taContent);

        btnSaveFile.setText("Lưu file");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDownLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSaveFile, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfURL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDownLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveFile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDownLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownLoadActionPerformed
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //chứa dữ liệu download
            // URL url = new URL("https://vnexpress.net"); //cần import java.net.URL
            URL url = new URL(tfURL.getText());
            InputStream is = url.openStream(); //Mở luồng dữ liệu dẫn đến tài nguyên
            byte block[] = new byte[4 * 1024];// 4KB
            while (true) {
                int n = is.read(block); //chỉ nên đọc mỗi lần tối đa 4KB
                if (n <= 0) {
                    break; //dừng khi đã hết dữ liệu
                }
                baos.write(block, 0, n); //Tích lũy dữ liệu đọc được                
            }
            is.close();
            //byte data[]= baos.toByteArray();//Lấy dữ liệu đọc được
            taContent.setText(baos.toString("utf-8"));
            baos.close();
        } catch (Exception ex) {
            System.out.println("Gap loi:" + ex);
        }
    }//GEN-LAST:event_btnDownLoadActionPerformed

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        try {
            JFileChooser fChoose = new JFileChooser();
            int choice = fChoose.showSaveDialog(this);
            if (choice == JFileChooser.APPROVE_OPTION) {
                String filename = fChoose.getSelectedFile().getAbsolutePath();
                FileOutputStream fos = new FileOutputStream(filename);
                ByteArrayOutputStream baos = new ByteArrayOutputStream(); //chứa dữ liệu download           
                URL url = new URL(tfURL.getText());
                InputStream is = url.openStream(); //Mở luồng dữ liệu dẫn đến tài nguyên
                byte block[] = new byte[4 * 1024];// 4KB
                while (true) {
                    int n = is.read(block); //chỉ nên đọc mỗi lần tối đa 4KB
                    if (n <= 0) {
                        break; //dừng khi đã hết dữ liệu
                    }
                    fos.write(block, 0, n); //ghi dữ liệu vào file
                }
                is.close();
                baos.close();
                JOptionPane.showMessageDialog(null, "Ghi dữ liệu vào file thành công!");
            }
        } catch (Exception ex) {
            System.out.println("Gap loi:" + ex);
        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DownloadTaiNguyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DownloadTaiNguyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DownloadTaiNguyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DownloadTaiNguyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DownloadTaiNguyen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDownLoad;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taContent;
    private javax.swing.JTextField tfURL;
    // End of variables declaration//GEN-END:variables
}