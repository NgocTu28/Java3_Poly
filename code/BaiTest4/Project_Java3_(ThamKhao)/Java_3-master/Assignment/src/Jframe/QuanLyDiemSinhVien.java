package Jframe;

import Entity.Grade;
import Service.ServiceGrade;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyDiemSinhVien extends javax.swing.JFrame {

    DefaultTableModel model;
    ServiceGrade sv ;
    int index;

    public QuanLyDiemSinhVien() {
        initComponents();
        setLocationRelativeTo(null);
        sv =  new ServiceGrade();
        model = (DefaultTableModel) tblDiemMax.getModel();
        Grade g = new Grade(1, "PH26123", "Nguyễn Công Thắng", 8, 9, 7.5);
        Grade g1 = new Grade(2, "PH26124", "Mai Đình Huy", 5, 6, 7.5);
        Grade g2 = new Grade(3, "PH26125", "Lê Quang Trị", 8, 7, 6);
        Grade g3 = new Grade(4, "PH26126", "Trần Trường Giang", 9, 9, 8);
        Grade g4 = new Grade(5, "PH26127", "Đỗ Việt Trường", 8, 6, 8);
        sv.insert(g);
        sv.insert(g1);
        sv.insert(g2);
        sv.insert(g3);
        sv.insert(g4);
        fillToTableTop3();
        if (sv.getListGrade().size() > 0) {
            index = 0;
            showDetail();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSVSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtTiengAnh = new javax.swing.JTextField();
        txtGiaoDucTC = new javax.swing.JTextField();
        txtTinHoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblDiemTB = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnNextFirst = new javax.swing.JButton();
        btnNextFinal = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiemMax = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setDisplayedMnemonic('Q');
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Quản Lý Điểm Sinh Viên");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Mã SV:");

        txtMaSVSearch.setBackground(new java.awt.Color(204, 204, 255));
        txtMaSVSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaSVSearch.setForeground(new java.awt.Color(0, 51, 255));
        txtMaSVSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSearch.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\loupe.png")); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSVSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSVSearch)
                    .addComponent(jLabel2)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Họ tên SV:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Mã SV:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Tiếng anh:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Tin học:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Giáo dục TC:");

        txtMaSV.setForeground(new java.awt.Color(0, 0, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Điểm TB:");

        lblDiemTB.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        lblDiemTB.setForeground(new java.awt.Color(255, 0, 0));
        lblDiemTB.setText("9.0");

        txtHoTen.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtTiengAnh)
                    .addComponent(txtGiaoDucTC)
                    .addComponent(txtTinHoc)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiemTB)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblDiemTB))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGiaoDucTC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnNew.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\plus.png")); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\floppy-disk.png")); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\clear.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\pencil.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\first.png")); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnNextFirst.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\nextFirst.png")); // NOI18N
        btnNextFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextFirstActionPerformed(evt);
            }
        });

        btnNextFinal.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\nextFinal.png")); // NOI18N
        btnNextFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextFinalActionPerformed(evt);
            }
        });

        btnFinal.setIcon(new javax.swing.ImageIcon("D:\\Learning\\SOF203(Java3)\\Assignment\\ImagesDemo\\final.png")); // NOI18N
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("3 Sinh viên có điểm cao nhất");

        tblDiemMax.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Tiếng anh", "Tin học", "Giáo dục TC", "Điểm TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemMax.setRowHeight(25);
        tblDiemMax.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDiemMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiemMaxMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDiemMax);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNextFirst))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(125, 125, 125)
                                    .addComponent(jLabel1))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNextFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNextFinal, btnNextFirst});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNextFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNextFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (sv.find(txtMaSV.getText()) >= 0) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên này đã tồn tại");
                return;
            }
            if (getGrade() == null) {
                return;
            }
            Grade g = getGrade();
            sv.insert(g);
            fillToTableTop3();
            index = sv.getListGrade().size() - 1;
            showDetail();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            if (sv.getListGrade().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Danh sách trống");
                return;
            }
            index = 0;
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        try {
            if (sv.getListGrade().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Danh sách trống");
                return;
            }
            index = sv.getListGrade().size() - 1;
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnFinalActionPerformed

    private void btnNextFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextFirstActionPerformed
        try {
            if (sv.getListGrade().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Danh sách trống");
                return;
            }
            index--;
            if (index < 0) {
                index = 0;
                JOptionPane.showMessageDialog(this, "Không lùi được nữa");
            }
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNextFirstActionPerformed

    private void btnNextFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextFinalActionPerformed
        try {
            if (sv.getListGrade().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Danh sách trống");
                return;
            }
            index++;
            if (index > sv.getListGrade().size() - 1) {
                index = sv.getListGrade().size() - 1;
                JOptionPane.showMessageDialog(this, "Không tiến được nữa");
            }
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNextFinalActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (sv.find(txtMaSV.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên này không tồn tại");
                return;
            }
            if (getGrade() == null) {
                return;
            }
            Grade gradeOld = sv.getListGrade().get(index);
            Grade gradeNew = getGrade();
            gradeNew.setId(gradeOld.getId());
            sv.update(index, gradeNew);
            fillToTableTop3();
            index = 0;
            showDetail();
            JOptionPane.showMessageDialog(this, "Update thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (sv.getListGrade().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Danh sách trống");
                return;
            }
            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn sinh viên để xóa");
                return;
            }
            if (txtMaSV.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nhập mã sinh viên cần xóa");
                return;
            }
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            if (sv.delete(txtMaSV.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên này không tồn tại");
            } else {
                fillToTableTop3();
                if (sv.getListGrade().isEmpty()) {
                    clearForm();
                } else {
                    if (index == sv.getListGrade().size()) {
                        index--;
                    }
                    showDetail();
                }
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            if (txtMaSVSearch.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nhập mã sinh viên cần tìm");
                return;
            }
            index = sv.find(txtMaSVSearch.getText());
            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Sinh viên này không tồn tại");
            } else {
                showDetail();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblDiemMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiemMaxMouseClicked
        try {
            index = tblDiemMax.getSelectedRow();
            showDetail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblDiemMaxMouseClicked

    private void clearForm() {
        txtMaSV.setText("");
        txtMaSVSearch.setText("");
        txtTiengAnh.setText("");
        txtTinHoc.setText("");
        txtGiaoDucTC.setText("");
        txtHoTen.setText("");
        lblDiemTB.setText("---");
        index = -1;
    }

    private void showDetail() {
       Grade g = sv.getListGrade().get(index);
       txtMaSV.setText(g.getMaSV());
       txtHoTen.setText(g.getHoTen());
       txtTiengAnh.setText(g.getTiengAnh()+"");
       txtTinHoc.setText(g.getTinHoc()+"");
       txtGiaoDucTC.setText(g.getGDTC()+"");
       lblDiemTB.setText(sv.TinhDiemTB(g.getTiengAnh(), g.getTinHoc(), g.getGDTC()) + "");
       if(index >=0 && index <3){
           tblDiemMax.setRowSelectionInterval(index, index);
       }
    }

    private Grade getGrade() {
        if (txtMaSV.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        if (txtHoTen.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        if (txtTiengAnh.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        if (txtTinHoc.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        if (txtGiaoDucTC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        double tiengAnh;
        double tinHoc;
        double GDTC;
        try {
            tiengAnh = Double.parseDouble(txtTiengAnh.getText().trim());
            tinHoc = Double.parseDouble(txtTinHoc.getText().trim());
            GDTC = Double.parseDouble(txtGiaoDucTC.getText().trim());
            if (tiengAnh > 10 || tiengAnh < 0 || tinHoc < 0 || tinHoc > 10 || GDTC < 0 || GDTC > 10) {
                JOptionPane.showMessageDialog(this, "Điểm phải từ 0 -> 10");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Điểm phải là số");
            return null;
        }
        int id;
        if (!sv.getListGrade().isEmpty()) {
            id = sv.getListGrade().get(sv.getListGrade().size() - 1).getId() + 1;
        } else {
            id = 1;
        }
        return new Grade(id, txtMaSV.getText(), txtHoTen.getText(),
                tiengAnh, tinHoc,
                GDTC);
    }

    private void fillToTableTop3() {
        model.setRowCount(0);
        for (int i = 0; i < 3; i++) {
            model.addRow(new Object[]{
                sv.sapXep().get(i).getMaSV(),
                sv.sapXep().get(i).getHoTen(),
                sv.sapXep().get(i).getTiengAnh(),
                sv.sapXep().get(i).getTinHoc(),
                sv.sapXep().get(i).getGDTC(),
                sv.TinhDiemTB(sv.sapXep().get(i).getTiengAnh(), sv.sapXep().get(i).getTinHoc(), sv.sapXep().get(i).getGDTC())
            });
        }
    }

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
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNextFinal;
    private javax.swing.JButton btnNextFirst;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDiemTB;
    private javax.swing.JTable tblDiemMax;
    private javax.swing.JTextField txtGiaoDucTC;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtMaSVSearch;
    private javax.swing.JTextField txtTiengAnh;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}
