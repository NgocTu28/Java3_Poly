package views;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DienThoai;
import services.DienThoaiService;
import services.HangDienThoaiService;

public class JFrameQLDienThoai extends javax.swing.JFrame {

    DienThoaiService dienThoaiSer;
    HangDienThoaiService hangDienThoaiSer;
    String hinhAnh = "";
    DefaultTableModel model;

    public JFrameQLDienThoai() {
        initComponents();
        setLocationRelativeTo(null);
        dienThoaiSer = new DienThoaiService();
        hangDienThoaiSer = new HangDienThoaiService();
        model = (DefaultTableModel) tblDanhSachDienThoai.getModel();
        List<DienThoai> list = dienThoaiSer.getAll();
        loadDataToTable(list);
        loadDataToComBoHang();
    }

    private void loadDataToComBoHang() {
        List<String> list = hangDienThoaiSer.getTenHang();
        cboHang.removeAllItems();
        for (String xx : list) {
            cboHang.addItem(xx);
        }
    }

    private void loadDataToTable(List<DienThoai> list) {
        model.setRowCount(0);
        for (DienThoai xx : list) {
            model.addRow(new Object[]{xx.getId(), xx.getTenDienThoai(), xx.getDonGia(), xx.getGioiThieu(), xx.getHinhAnh(), xx.getSoLuong(), hangDienThoaiSer.findNameById(xx.getIdHang())});
        }
    }

    private void showDetail() {
        int index = tblDanhSachDienThoai.getSelectedRow();
        lblID.setText(tblDanhSachDienThoai.getValueAt(index, 0) + "");
        txtTen.setText(tblDanhSachDienThoai.getValueAt(index, 1) + "");
        txtDonGia.setText(tblDanhSachDienThoai.getValueAt(index, 2) + "");
        txtGioiThieu.setText(tblDanhSachDienThoai.getValueAt(index, 3) + "");
        lblHinhAnh.setIcon(new ImageIcon(tblDanhSachDienThoai.getValueAt(index, 4) + ""));
        hinhAnh = tblDanhSachDienThoai.getValueAt(index, 4) + "";
        txtSoLuong.setText(tblDanhSachDienThoai.getValueAt(index, 5) + "");
        cboHang.setSelectedItem(tblDanhSachDienThoai.getValueAt(index, 6));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGioiThieu = new javax.swing.JTextArea();
        lblHinhAnh = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cboHang = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachDienThoai = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboTangGiam = new javax.swing.JComboBox<>();
        cboKieu = new javax.swing.JComboBox<>();
        btnThem1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan Ly Dien Thoai");

        jLabel1.setText("ID");

        jLabel2.setText("Ten");

        jLabel3.setText("Don gia");

        jLabel4.setText("Gioi thieu");

        jLabel5.setText("Hinh anh");

        jLabel6.setText("So luong");

        jLabel7.setText("Hang");

        lblID.setText("-");

        txtGioiThieu.setColumns(20);
        txtGioiThieu.setRows(5);
        jScrollPane1.setViewportView(txtGioiThieu);

        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });

        cboHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblDanhSachDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblDanhSachDienThoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ten Dien Thoai", "Don gia", "Gioi thieu", "Hinh anh", "So luong", "Hang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachDienThoai.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDanhSachDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachDienThoai);

        btnSua.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\pencil.png")); // NOI18N
        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\floppy-disk.png")); // NOI18N
        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\clear.png")); // NOI18N
        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\loupe.png")); // NOI18N
        jLabel11.setText("Tim kiem");

        cboTangGiam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tang Dan", "Giam Dan" }));
        cboTangGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTangGiamActionPerformed(evt);
            }
        });

        cboKieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sap Xep Theo Gia", "Sap Xep Theo So Luong" }));
        cboKieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKieuActionPerformed(evt);
            }
        });

        btnThem1.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\ImagesDemo\\plus.png")); // NOI18N
        btnThem1.setText("New");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblID)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtDonGia)
                                    .addComponent(txtTen)
                                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cboKieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboTangGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnThem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(188, 188, 188))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel5)
                                .addGap(119, 119, 119)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboKieu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTangGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        try {
            JFileChooser fc = new JFileChooser();
            int check = fc.showOpenDialog(this);
            if (check == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                Icon icon = new ImageIcon(f.getAbsolutePath());
                lblHinhAnh.setIcon(icon);
                hinhAnh = f.getAbsolutePath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void tblDanhSachDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachDienThoaiMouseClicked
        try {
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblDanhSachDienThoaiMouseClicked

    private DienThoai getFormData() {
        String ten = txtTen.getText().trim();
        String donGiaStr = txtDonGia.getText().trim();
        String gioiThieu = txtGioiThieu.getText().trim();
        String soLuongStr = txtSoLuong.getText().trim();
        BigDecimal donGia = null;
        int id = lblID.getText().equals("-") ? 0 : Integer.parseInt(lblID.getText());
        int soLuong = 0;
        int idHang = hangDienThoaiSer.findIdByName(cboHang.getSelectedItem() + "");
        try {
            if (ten.isEmpty() || donGiaStr.isEmpty() || gioiThieu.isEmpty() || soLuongStr.isEmpty() || hinhAnh.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Không duoc de trong");
                return null;
            }
            try {
                donGia = BigDecimal.valueOf(Double.parseDouble(donGiaStr));
                soLuong = Integer.parseInt(soLuongStr);
                if (Double.parseDouble(donGiaStr) < 0 || soLuong < 0) {
                    JOptionPane.showMessageDialog(rootPane, "So luong va don gia phai > 0 !!!");
                    return null;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ðon gia va so luong phai la so");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DienThoai(id, ten, donGia, gioiThieu, hinhAnh, soLuong, idHang);
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            DienThoai dienThoai = getFormData();
            if (dienThoai == null) {
                return;
            }
            dienThoaiSer.insert(dienThoai);
            List<DienThoai> list = dienThoaiSer.getAll();
            loadDataToTable(list);
            JOptionPane.showMessageDialog(this, "Them thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            if (tblDanhSachDienThoai.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Hay chon dong de cap nhat");
                return;
            }
            DienThoai dienThoai = getFormData();
            if (dienThoai == null) {
                return;
            }
            dienThoaiSer.update(Integer.parseInt(lblID.getText()), dienThoai);
            List<DienThoai> list = dienThoaiSer.getAll();
            loadDataToTable(list);
            JOptionPane.showMessageDialog(this, "Cap nhat thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            if (tblDanhSachDienThoai.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "Hay chon dong de xoa");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Ban co chac muon xoa khong?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            dienThoaiSer.delete(Integer.parseInt(lblID.getText()));
            List<DienThoai> list = dienThoaiSer.getAll();
            loadDataToTable(list);
            clearForm();
            JOptionPane.showMessageDialog(this, "Xoa thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        clearForm();
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        model.setRowCount(0);
        List<DienThoai> list = dienThoaiSer.findDienThoaiByName(txtTimKiem.getText());
        loadDataToTable(list);
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void cboTangGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTangGiamActionPerformed
        if (cboTangGiam.getSelectedIndex() == 0 && cboKieu.getSelectedIndex() == 0) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoGiaTangDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 1 && cboKieu.getSelectedIndex() == 0) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoGiaGiamDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 0 && cboKieu.getSelectedIndex() == 1) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoSoLuongTangDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 1 && cboKieu.getSelectedIndex() == 1) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoSoLuongGiamDan();
            loadDataToTable(list);
        }
    }//GEN-LAST:event_cboTangGiamActionPerformed

    private void cboKieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKieuActionPerformed
        if (cboTangGiam.getSelectedIndex() == 0 && cboKieu.getSelectedIndex() == 0) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoGiaTangDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 1 && cboKieu.getSelectedIndex() == 0) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoGiaGiamDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 0 && cboKieu.getSelectedIndex() == 1) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoSoLuongTangDan();
            loadDataToTable(list);
        }
        if (cboTangGiam.getSelectedIndex() == 1 && cboKieu.getSelectedIndex() == 1) {
            List<DienThoai> list = dienThoaiSer.sapXepTheoSoLuongGiamDan();
            loadDataToTable(list);
        }
    }//GEN-LAST:event_cboKieuActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameQLDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQLDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQLDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQLDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQLDienThoai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboHang;
    private javax.swing.JComboBox<String> cboKieu;
    private javax.swing.JComboBox<String> cboTangGiam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tblDanhSachDienThoai;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextArea txtGioiThieu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        lblID.setText("-");
        txtTen.setText("");
        txtDonGia.setText("");
        txtGioiThieu.setText("");
        txtSoLuong.setText("");
        txtTimKiem.setText("");
        lblHinhAnh.setIcon(new ImageIcon(""));
        hinhAnh = "";
        cboHang.setSelectedIndex(0);
    }
}
