
package ui;

import UHelper.Helper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HocSinhCB;


public class Bai3 extends javax.swing.JFrame {
    Connection cn;
    ArrayList<HocSinhCB> lstHSCB= new ArrayList<>();
    
    public Bai3() {
        initComponents();
        setLocationRelativeTo(null);       
        cn = Helper.ketnoi("Lab5_SOF203");
        if (cn != null) {
//            JOptionPane.showMessageDialog(this, "Kết nối thành công");
             loadDataToComboBox();//lấy dữ liệu từ CSDL => ComboBox
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi kết nối");
            System.exit(0);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboMaHS = new javax.swing.JComboBox<>();
        lblTenHS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Load Data To comboBox");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Mã Học sinh");

        cboMaHS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMaHSItemStateChanged(evt);
            }
        });
        cboMaHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaHSActionPerformed(evt);
            }
        });

        lblTenHS.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboMaHS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTenHS, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTenHS, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cboMaHS, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void cboMaHSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMaHSItemStateChanged
        try {
            int index = cboMaHS.getSelectedIndex();
            if(index>=0){
                String tenhs= lstHSCB.get(index).getTenHS();
                lblTenHS.setText(tenhs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi chọn comboboxx");           
        }
    }//GEN-LAST:event_cboMaHSItemStateChanged

    private void cboMaHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaHSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMaHSActionPerformed

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
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMaHS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTenHS;
    // End of variables declaration//GEN-END:variables

    private void loadDataToComboBox() {
        try {
            String sql="select * from HOCSINH";
            Statement stm=cn.createStatement();
            //Khai báo resultset để nhận kết quả từ việc thực thi truy vấn select
            ResultSet rs = stm.executeQuery(sql);
            //duyệt resultset => đổ dữ liệu vào combobox
            while(rs.next()){                
                //add dữ liệu vào list => mục đích sau này hiển thị tenhs theo mahs
                String mahs=rs.getString(1);
                String tenhs=rs.getString(2);
                lstHSCB.add(new HocSinhCB(mahs, tenhs));
                cboMaHS.addItem(rs.getString(1));
            }
            rs.close();
            stm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi load Data To combobox");
        }
    }
}
