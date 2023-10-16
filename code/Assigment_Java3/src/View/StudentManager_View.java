/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Students;
import Service.Student_service;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vutu8
 */
public class StudentManager_View extends javax.swing.JFrame {

    Student_service service = new Student_service();
    DefaultTableModel tblModel;
    private String hinhAnh = null;

    public StudentManager_View() {
        initComponents();
        setLocationRelativeTo(null);
        tblModel = (DefaultTableModel) tblNhanVien_QLNV.getModel();
        fillToTable();
    }

    private void fillToTable() {
        tblModel.setRowCount(0);
        for (Students i : service.getToAll()) {
            Object[] rows = new Object[7];
            rows[0] = i.getMaSV();
            rows[1] = i.getHoTen();
            rows[2] = i.getEmail();
            rows[3] = i.getSoDT();
            rows[4] = i.getGioiTinh();
            rows[5] = i.getDiaChi();
            rows[6] = i.getHinh();
            tblModel.addRow(rows);
        }
    }

    private Students getStudent() {
        String maSV = txtMaSV_QLNV.getText().trim();
        String hoTen = txtHoTen_QLNV.getText().trim();
        String email = txtEmail_QLNV.getText().trim();
        String soDT = txtSoDT.getText().trim();
        String diaChi = txtDiaChi_QLNV.getText().trim();
        try {
            if (maSV.isEmpty()
                    || hoTen.isEmpty()
                    || email.isEmpty()
                    || soDT.isEmpty()
                    || diaChi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không để trống");
                return null;
            }
            if (hinhAnh == "") {
                JOptionPane.showMessageDialog(this, "Chưa chọn hình ảnh");
                return null;
            }

            String patternSDT = "0\\d{9,10}";
            if (!soDT.matches(patternSDT)) {
                JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Students(maSV, hoTen, email, soDT, rdoNam.isSelected() ? "Nam" : "Nữ", diaChi, hinhAnh);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        GioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSV_QLNV = new javax.swing.JTextField();
        txtHoTen_QLNV = new javax.swing.JTextField();
        txtEmail_QLNV = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtDiaChi_QLNV = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien_QLNV = new javax.swing.JTable();
        btnUpdate_QLNV = new javax.swing.JButton();
        btnAdd_QLNV = new javax.swing.JButton();
        btnSave_QLNV = new javax.swing.JButton();
        btnDelete_QLNV = new javax.swing.JButton();
        txtImg = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("MANANGER STAFF ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mã SV:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Họ và Tên:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Số ĐT:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Giới Tính:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Địa Chỉ:");

        GioiTinh.add(rdoNam);
        rdoNam.setText("Nam");

        GioiTinh.add(rdoNu);
        rdoNu.setText("Nữ");

        tblNhanVien_QLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ và Tên", "Email", "Số ĐT", "GIới Tính", "Địa Chỉ", "Hình"
            }
        ));
        tblNhanVien_QLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVien_QLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien_QLNV);

        btnUpdate_QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hinh/pencil.png"))); // NOI18N
        btnUpdate_QLNV.setText("Update");
        btnUpdate_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_QLNVActionPerformed(evt);
            }
        });

        btnAdd_QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hinh/Add.png"))); // NOI18N
        btnAdd_QLNV.setText("NEW");
        btnAdd_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd_QLNVActionPerformed(evt);
            }
        });

        btnSave_QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hinh/Save as.png"))); // NOI18N
        btnSave_QLNV.setText("SAVE");
        btnSave_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave_QLNVActionPerformed(evt);
            }
        });

        btnDelete_QLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Hinh/clear.png"))); // NOI18N
        btnDelete_QLNV.setText("Delete");
        btnDelete_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_QLNVActionPerformed(evt);
            }
        });

        txtImg.setText("HinhAnh");
        txtImg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtImgMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("THÔNG TIN NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rdoNam)
                                    .addGap(27, 27, 27)
                                    .addComponent(rdoNu)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHoTen_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaSV_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiaChi_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate_QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(btnDelete_QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd_QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave_QLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(txtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rdoNam, rdoNu});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiaChi_QLNV, txtEmail_QLNV, txtHoTen_QLNV, txtMaSV_QLNV, txtSoDT});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd_QLNV, btnDelete_QLNV, btnSave_QLNV, btnUpdate_QLNV});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtImg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaSV_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHoTen_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoNam)
                                .addComponent(rdoNu)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtDiaChi_QLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDiaChi_QLNV, txtEmail_QLNV, txtHoTen_QLNV, txtMaSV_QLNV, txtSoDT});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd_QLNV, btnDelete_QLNV, btnSave_QLNV, btnUpdate_QLNV});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhanVien_QLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVien_QLNVMouseClicked
        int index = tblNhanVien_QLNV.getSelectedRow();
        if (index >= 0) {
            txtMaSV_QLNV.setText((String) tblNhanVien_QLNV.getValueAt(index, 0));
            txtHoTen_QLNV.setText((String) tblNhanVien_QLNV.getValueAt(index, 1));
            txtEmail_QLNV.setText((String) tblNhanVien_QLNV.getValueAt(index, 2));
            txtSoDT.setText((String) tblNhanVien_QLNV.getValueAt(index, 3));
            if (tblNhanVien_QLNV.getValueAt(index, 4).equals("Nam")) {
                rdoNam.setSelected(true);
            } else if (tblNhanVien_QLNV.getValueAt(index, 4).equals("Nữ")) {
                rdoNu.setSelected(true);
            }
            txtDiaChi_QLNV.setText((String) tblNhanVien_QLNV.getValueAt(index, 5));
            hinhAnh = (String) tblNhanVien_QLNV.getValueAt(index, 6);
            txtImg.setIcon(new ImageIcon(hinhAnh));
        }
    }//GEN-LAST:event_tblNhanVien_QLNVMouseClicked

    private void btnAdd_QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd_QLNVActionPerformed
        txtMaSV_QLNV.setText("");
        txtHoTen_QLNV.setText("");
        txtEmail_QLNV.setText("");
        txtSoDT.setText("");
        rdoNam.setSelected(true);
        txtDiaChi_QLNV.setText("");
        hinhAnh = "";
        txtImg.setIcon(new ImageIcon(hinhAnh));
    }//GEN-LAST:event_btnAdd_QLNVActionPerformed

    private void btnSave_QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave_QLNVActionPerformed
        Students st = getStudent();
        if (st == null) {
            JOptionPane.showMessageDialog(this, "Xảy ra lỗi không thể thực hiện.", "Thông Báo.", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            service.addStudent(st);
            JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công sinh viên.");
            fillToTable();
        }
    }//GEN-LAST:event_btnSave_QLNVActionPerformed

    private void txtImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtImgMouseClicked
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File file = fc.getSelectedFile();
            Image img = ImageIO.read(file);
            txtImg.setText("");
            int width = txtImg.getWidth();
            int heigth = txtImg.getHeight();
            txtImg.setIcon(new ImageIcon(img.getScaledInstance(width, heigth, 0)));
            hinhAnh = file.getAbsolutePath();
        } catch (IOException ex) {
            Logger.getLogger(StudentManager_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtImgMouseClicked

    private void btnDelete_QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_QLNVActionPerformed
        int index = tblNhanVien_QLNV.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần xóa", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        }
        String maSV = (String) tblNhanVien_QLNV.getValueAt(index, 0);
        int check = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sinh viên không", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Thanhs You.");
            return;
        } else if (check == JOptionPane.YES_OPTION) {
            service.removeStudents(maSV);
            JOptionPane.showMessageDialog(this, "Đã xóa sinh viên thành công.");
            fillToTable();
        }
    }//GEN-LAST:event_btnDelete_QLNVActionPerformed

    private void btnUpdate_QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_QLNVActionPerformed
        int index = tblNhanVien_QLNV.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn dòng cần xóa", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        }
        String maSV = (String) tblNhanVien_QLNV.getValueAt(index, 0);
        Students st = getStudent();
        service.updateStudents(st, maSV);
        fillToTable();
        JOptionPane.showMessageDialog(this, "Bạn đã update sinh viên thành công.");
    }//GEN-LAST:event_btnUpdate_QLNVActionPerformed

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
            java.util.logging.Logger.getLogger(StudentManager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManager_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GioiTinh;
    private javax.swing.JButton btnAdd_QLNV;
    private javax.swing.JButton btnDelete_QLNV;
    private javax.swing.JButton btnSave_QLNV;
    private javax.swing.JButton btnUpdate_QLNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien_QLNV;
    private javax.swing.JTextField txtDiaChi_QLNV;
    private javax.swing.JTextField txtEmail_QLNV;
    private javax.swing.JTextField txtHoTen_QLNV;
    private javax.swing.JLabel txtImg;
    private javax.swing.JTextField txtMaSV_QLNV;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables
}
