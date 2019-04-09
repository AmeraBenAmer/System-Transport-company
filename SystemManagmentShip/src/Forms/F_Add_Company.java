package Forms;

import Interface_Imp.Company;
import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.table.DefaultTableModel;
import systemmanagmentship.Tools;

public class F_Add_Company extends javax.swing.JFrame {

    public F_Add_Company() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BrGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        name_c = new javax.swing.JTextField();
        Date_S = new com.toedter.calendar.JDateChooser();
        number_C = new javax.swing.JTextField();
        email_c = new javax.swing.JTextField();
        Date_E = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Archive = new javax.swing.JLabel();
        Add = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        ShowAll = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Back1 = new javax.swing.JLabel();
        exit2 = new javax.swing.JLabel();
        search_by = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        nameRB = new javax.swing.JRadioButton();
        number = new javax.swing.JRadioButton();
        emailbr = new javax.swing.JRadioButton();
        Search = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Display_company_Data = new javax.swing.JTable();
        labMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_c.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        name_c.setForeground(new java.awt.Color(0, 0, 153));
        name_c.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        name_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                name_cMouseClicked(evt);
            }
        });
        name_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_cActionPerformed(evt);
            }
        });
        jPanel3.add(name_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 276, 41));

        Date_S.setBackground(new java.awt.Color(255, 255, 255));
        Date_S.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        Date_S.setForeground(new java.awt.Color(0, 0, 139));
        Date_S.setToolTipText("");
        Date_S.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        Date_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Date_SMouseClicked(evt);
            }
        });
        jPanel3.add(Date_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 276, 40));

        number_C.setEditable(false);
        number_C.setBackground(new java.awt.Color(255, 255, 255));
        number_C.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        number_C.setForeground(new java.awt.Color(0, 0, 153));
        number_C.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        number_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_CMouseClicked(evt);
            }
        });
        number_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number_CActionPerformed(evt);
            }
        });
        jPanel3.add(number_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 276, 41));

        email_c.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        email_c.setForeground(new java.awt.Color(0, 0, 153));
        email_c.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        email_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                email_cMouseClicked(evt);
            }
        });
        email_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_cActionPerformed(evt);
            }
        });
        jPanel3.add(email_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 276, 41));

        Date_E.setBackground(new java.awt.Color(255, 255, 255));
        Date_E.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        Date_E.setForeground(new java.awt.Color(0, 0, 139));
        Date_E.setToolTipText("");
        Date_E.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jPanel3.add(Date_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 276, 41));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 139));
        jLabel6.setText("Number Company :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 180, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 139));
        jLabel7.setText("Contract Date End :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 139));
        jLabel8.setText("Contract Date Start :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 180, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 139));
        jLabel9.setText("Name Company :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 139));
        jLabel10.setText("Email Company :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 139));

        Archive.setFont(new java.awt.Font("Comic Sans MS", 3, 15)); // NOI18N
        Archive.setForeground(new java.awt.Color(228, 234, 250));
        Archive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Archive_Folder_32.png"))); // NOI18N
        Archive.setText("Archive");
        Archive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Archive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchiveMouseClicked(evt);
            }
        });

        Add.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        Add.setForeground(new java.awt.Color(228, 234, 250));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Addbbb_32.png"))); // NOI18N
        Add.setText("Add ");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        update.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        update.setForeground(new java.awt.Color(228, 234, 250));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Refreshb_32.png"))); // NOI18N
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        ShowAll.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        ShowAll.setForeground(new java.awt.Color(228, 234, 250));
        ShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C_32.png"))); // NOI18N
        ShowAll.setText("Show All");
        ShowAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowAllMouseClicked(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        Clear.setForeground(new java.awt.Color(228, 234, 250));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Bro_48.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Archive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Archive, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 890, 90));

        jPanel8.setBackground(new java.awt.Color(0, 0, 139));

        jPanel12.setBackground(new java.awt.Color(0, 0, 170));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Go_Back_32.png"))); // NOI18N
        Back1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back1MouseClicked(evt);
            }
        });

        exit2.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        exit2.setForeground(new java.awt.Color(255, 255, 255));
        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Cancelnn_32.png"))); // NOI18N
        exit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit2MouseClicked(evt);
            }
        });

        search_by.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_S_32.png"))); // NOI18N
        search_by.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_by.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_byMouseClicked(evt);
            }
        });

        search.setBackground(new java.awt.Color(153, 153, 255));
        search.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        search.setForeground(new java.awt.Color(228, 234, 250));
        search.setText("Search By :");

        nameRB.setBackground(new java.awt.Color(0, 0, 139));
        nameRB.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        nameRB.setForeground(new java.awt.Color(228, 234, 250));
        nameRB.setText("Name");

        number.setBackground(new java.awt.Color(0, 0, 139));
        number.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        number.setForeground(new java.awt.Color(228, 234, 250));
        number.setSelected(true);
        number.setText("Number");

        emailbr.setBackground(new java.awt.Color(0, 0, 139));
        emailbr.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        emailbr.setForeground(new java.awt.Color(228, 234, 250));
        emailbr.setText("Email");

        Search.setBackground(new java.awt.Color(0, 0, 139));
        Search.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(null);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(255, 210, 213));
        jSeparator7.setForeground(new java.awt.Color(153, 153, 255));
        jSeparator7.setAlignmentY(0.8F);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Back1)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit2)
                        .addGap(67, 67, 67)
                        .addComponent(search_by)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(number)
                        .addGap(18, 18, 18)
                        .addComponent(nameRB)
                        .addGap(18, 18, 18)
                        .addComponent(emailbr, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailbr)
                            .addComponent(number)
                            .addComponent(nameRB)
                            .addComponent(search))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Back1)
                                    .addComponent(exit2)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(89, 89, 89)))
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 80));

        JTable_Display_company_Data.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        JTable_Display_company_Data.setForeground(new java.awt.Color(0, 0, 139));
        JTable_Display_company_Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Date Start", "Date End", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTable_Display_company_Data.setGridColor(new java.awt.Color(0, 0, 153));
        JTable_Display_company_Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_Display_company_DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Display_company_Data);
        if (JTable_Display_company_Data.getColumnModel().getColumnCount() > 0) {
            JTable_Display_company_Data.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 87, 510, 430));

        labMessage.setBackground(new java.awt.Color(255, 255, 255));
        labMessage.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        labMessage.setForeground(new java.awt.Color(0, 0, 139));
        labMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labMessageMouseClicked(evt);
            }
        });
        jPanel3.add(labMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 360, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_email_cMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_email_cMouseClicked

    private void email_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_cActionPerformed
    java.util.Date Date_Start;
    java.util.Date Date_End;
    java.sql.Date sqlDate_Start;
    java.sql.Date sqlDate_End;
    Connection conn;
    public void ClearData() {
        number_C.setText("");
        name_c.setText("");
        email_c.setText("");
        Date Date = null;
        Date_S.setDate((Date));
        Date_E.setDate((Date));
        name_c.requestFocus();//هذا يخلي المؤشر داخل حقل الاسم المستخدم
        Add.setEnabled(true);
        update.setEnabled(false);
        Archive.setEnabled(false);
        String num_company = co.GetAutoNumber();
            number_C.setText(num_company);
        
    }
    Company co = new Company();
    void setValues(){
      co.setNumber(Integer.parseInt(number_C.getText()));
      co.setName(name_c.getText());
      co.setEmail(email_c.getText());
      Date_Start = Date_S.getDate();
      sqlDate_Start = new java.sql.Date(Date_Start.getTime());
         co.setDate_start(sqlDate_Start);
      Date_End = Date_E.getDate();
        sqlDate_End = new java.sql.Date(Date_End.getTime());
        co.setDate_end(sqlDate_End);
    }
    private static final Logger logger = Logger.getLogger(LOOGIN.class.getName());    
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if(number_C.getText().length()==0 || name_c.getText().length()==0 || email_c.getText().length()==0  ||
            Date_S.getDate().equals("") || Date_E.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        try {
            setValues();
            co.Add(labMessage);
            database.UseDatabase.fillJTable("select * from company_leased where Active = 1", JTable_Display_company_Data);
            FileHandler fh;
            logger.log(Level.INFO , "first my log");
            fh = new FileHandler("mylogger.txt");
            logger.addHandler(fh);
            fh.setLevel(Level.ALL);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(F_Add_Company.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_AddMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       setValues();
       co.Update(labMessage);
        database.UseDatabase.fillJTable("select * from company_leased where Active = 1", JTable_Display_company_Data);
    }//GEN-LAST:event_updateMouseClicked

    private void ArchiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchiveMouseClicked
            setValues();
            co.Delete(labMessage);
            database.UseDatabase.fillJTable("select * from company_leased where Active = 1", JTable_Display_company_Data);
    }//GEN-LAST:event_ArchiveMouseClicked

    private void ShowAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAllMouseClicked
        // TODO add your handling code here:
         database.UseDatabase.fillJTable("select * from company_leased where Active = 1", JTable_Display_company_Data);
       
    }//GEN-LAST:event_ShowAllMouseClicked

    private void Date_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Date_SMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Date_SMouseClicked

    private void name_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_cActionPerformed

    private void name_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_cMouseClicked
        // TODO add your handling code here:
        name_c.setText("");
    }//GEN-LAST:event_name_cMouseClicked

    private void labMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labMessageMouseClicked
        this.dispose();
        Tools.openForm(new Registration()); //لإنشاء حساب لمستخدم جديد
    }//GEN-LAST:event_labMessageMouseClicked
    int xx ,xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        this.setOpacity((float)0.2);//بش نخلي شاشة لما نظغط عليها تصبح شفافة
        xx = evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();//بش نخلي شاشة تتحرك 
        int y  = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
                this.setOpacity((float)1.0);

    }//GEN-LAST:event_formMouseReleased

    private void number_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number_CActionPerformed

    private void number_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_CMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_number_CMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        BrGroup.add(nameRB);
        BrGroup.add(number);
        BrGroup.add(emailbr);
        database.UseDatabase.fillJTable("select * from company_leased where Active = 1", JTable_Display_company_Data);
         JTable_Display_company_Data.getTableHeader().setReorderingAllowed(false);

        update.setEnabled(false);
        Archive.setEnabled(false);
        String num_company = co.GetAutoNumber();
            number_C.setText(num_company);
            name_c.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Tools.openForm(new FromAdmin1());
    }//GEN-LAST:event_Back1MouseClicked

    private void exit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit2MouseClicked

    private void search_byMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_byMouseClicked
        // TODO add your handling code here:
        String strSearch = "select * from company_leased where ";
        if (number.isSelected()) {
            strSearch += "company_num";
        } else if (nameRB.isSelected()) {
            strSearch += "company_name";
        } else {
            strSearch += "email";
        }
        strSearch += " like '%" + Search.getText() + "%'";
        database.UseDatabase.fillJTable(strSearch, JTable_Display_company_Data);
    }//GEN-LAST:event_search_byMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void JTable_Display_company_DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_Display_company_DataMouseClicked

        try {
            // TODO add your handling code here:
            int row = JTable_Display_company_Data.getSelectedRow();
            String C_Number = JTable_Display_company_Data.getValueAt(row, 0).toString();
            String c_name = JTable_Display_company_Data.getValueAt(row, 1).toString();
            DefaultTableModel mo del = (DefaultTableModel) JTable_Display_company_Data.getModel();
            int index = JTable_Display_company_Data.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 2));
            Date_S.setDate(date);
            DefaultTableModel model1 = (DefaultTableModel) JTable_Display_company_Data.getModel();
            int index1 = JTable_Display_company_Data.getSelectedRow();
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(index1, 3));
            Date_E.setDate(date1);
            String email = JTable_Display_company_Data.getValueAt(row, 4).toString();
            number_C.setText(C_Number);
            name_c.setText(c_name);
            email_c.setText(email);
            
            Add.setEnabled(false);
            update.setEnabled(true);
            Archive.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(F_Add_Company.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTable_Display_company_DataMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        ClearData();
    }//GEN-LAST:event_ClearMouseClicked

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
            java.util.logging.Logger.getLogger(F_Add_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Add_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Add_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Add_Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Add_Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Archive;
    private javax.swing.JLabel Back1;
    private javax.swing.ButtonGroup BrGroup;
    private javax.swing.JLabel Clear;
    private com.toedter.calendar.JDateChooser Date_E;
    private com.toedter.calendar.JDateChooser Date_S;
    private javax.swing.JTable JTable_Display_company_Data;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel ShowAll;
    private javax.swing.JTextField email_c;
    private javax.swing.JRadioButton emailbr;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labMessage;
    private javax.swing.JRadioButton nameRB;
    private javax.swing.JTextField name_c;
    private javax.swing.JRadioButton number;
    private javax.swing.JTextField number_C;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search_by;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
