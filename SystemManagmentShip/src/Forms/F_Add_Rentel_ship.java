/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Interface_Imp.Rentel_Ship;
import database.UseDatabase;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import systemmanagmentship.Tools;

/**
 *
 * @author User
 */
public class F_Add_Rentel_ship extends javax.swing.JFrame {

    /**
     * Creates new form frmComManager
     */
    public F_Add_Rentel_ship() {
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

        bg = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Date_S = new com.toedter.calendar.JDateChooser();
        Date_E = new com.toedter.calendar.JDateChooser();
        labMessage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        choice2 = new javax.swing.JComboBox<>();
        choice1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Display_rental = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        Back1 = new javax.swing.JLabel();
        exit2 = new javax.swing.JLabel();
        search_by = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        nameRB = new javax.swing.JRadioButton();
        number = new javax.swing.JRadioButton();
        nameship = new javax.swing.JRadioButton();
        Search = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        Archive1 = new javax.swing.JLabel();
        Add1 = new javax.swing.JLabel();
        update1 = new javax.swing.JLabel();
        ShowAll1 = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date_S.setBackground(new java.awt.Color(255, 255, 255));
        Date_S.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        Date_S.setForeground(new java.awt.Color(0, 0, 139));
        Date_S.setToolTipText("");
        Date_S.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jPanel3.add(Date_S, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 276, 30));

        Date_E.setBackground(new java.awt.Color(255, 255, 255));
        Date_E.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        Date_E.setForeground(new java.awt.Color(0, 0, 139));
        Date_E.setToolTipText("");
        Date_E.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jPanel3.add(Date_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 276, 30));

        labMessage.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        labMessage.setForeground(new java.awt.Color(0, 0, 139));
        jPanel3.add(labMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 240, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 139));
        jLabel6.setText("rental ship No:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 139));
        jLabel7.setText("End Date Rental :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 139));
        jLabel8.setText("Start Date Rental:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 139));
        jLabel9.setText("Name Ship :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 139));
        jLabel10.setText("Name Company :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, 30));

        no.setEditable(false);
        no.setBackground(new java.awt.Color(255, 255, 255));
        no.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        no.setForeground(new java.awt.Color(0, 0, 153));
        no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 139), 2, true));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        jPanel3.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 276, 30));

        time.setEditable(false);
        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 153));
        time.setBorder(null);
        time.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeMouseClicked(evt);
            }
        });
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 70, 20));

        date.setEditable(false);
        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 153));
        date.setBorder(null);
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 20));

        choice2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 30));

        choice1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 30));

        JTable_Display_rental.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        JTable_Display_rental.setForeground(new java.awt.Color(0, 0, 139));
        JTable_Display_rental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Number", "Name ship", "Name company", "Date Start", "Date End"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTable_Display_rental.setGridColor(new java.awt.Color(0, 0, 153));
        JTable_Display_rental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_Display_rentalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Display_rental);

        jPanel10.setBackground(new java.awt.Color(0, 0, 139));

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
        nameRB.setText("Name company");
        nameRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameRBActionPerformed(evt);
            }
        });

        number.setBackground(new java.awt.Color(0, 0, 139));
        number.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        number.setForeground(new java.awt.Color(228, 234, 250));
        number.setSelected(true);
        number.setText("Number");

        nameship.setBackground(new java.awt.Color(0, 0, 139));
        nameship.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        nameship.setForeground(new java.awt.Color(228, 234, 250));
        nameship.setText("Name ship");

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(Back1)
                        .addGap(18, 18, 18)
                        .addComponent(exit2)
                        .addGap(51, 51, 51)
                        .addComponent(search_by)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(number)
                        .addGap(18, 18, 18)
                        .addComponent(nameRB)
                        .addGap(18, 18, 18)
                        .addComponent(nameship)
                        .addGap(0, 79, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameship)
                            .addComponent(number)
                            .addComponent(nameRB)
                            .addComponent(search))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Back1)
                                    .addComponent(exit2))
                                .addGap(89, 89, 89)))))
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 139));

        Archive1.setFont(new java.awt.Font("Comic Sans MS", 3, 15)); // NOI18N
        Archive1.setForeground(new java.awt.Color(228, 234, 250));
        Archive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Archive_Folder_32.png"))); // NOI18N
        Archive1.setText("Archive");
        Archive1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Archive1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Archive1MouseClicked(evt);
            }
        });

        Add1.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        Add1.setForeground(new java.awt.Color(228, 234, 250));
        Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Addbbb_32.png"))); // NOI18N
        Add1.setText("Add ");
        Add1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add1MouseClicked(evt);
            }
        });

        update1.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        update1.setForeground(new java.awt.Color(228, 234, 250));
        update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Refreshb_32.png"))); // NOI18N
        update1.setText("Update");
        update1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update1MouseClicked(evt);
            }
        });

        ShowAll1.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        ShowAll1.setForeground(new java.awt.Color(228, 234, 250));
        ShowAll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/C_32.png"))); // NOI18N
        ShowAll1.setText("Show All");
        ShowAll1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ShowAll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowAll1MouseClicked(evt);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Archive1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ShowAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAll1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Archive1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1))
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
      void Cleardata(){
          no.setText("");
          labMessage.setText("");
      }

    @Override
    public void setSize(Dimension dmnsn) {
        super.setSize(dmnsn); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSize(int i, int i1) {
        super.setSize(i, i1); //To change body of generated methods, choose Tools | Templates.
    }
         
    Rentel_Ship rs = new Rentel_Ship();
    void setvalues(){
        java.util.Date Date;
        java.sql.Date sqlDate;
        rs.setnumber(Integer.parseInt(no.getText()));
        rs.setNameShip(choice1.getSelectedItem().toString());
        rs.setNameCompany(choice2.getSelectedItem().toString());
        Date = Date_S.getDate();
          sqlDate = new java.sql.Date(Date.getTime());
          rs.setDateStart(sqlDate);
        Date = Date_E.getDate();
          sqlDate = new java.sql.Date(Date.getTime());
          rs.setDateEnd(sqlDate);
//          choice1.getItem(xx);
    }    int xx , xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
         this.setOpacity((float)0.2);//بش نخلي شاشة لما نظغط عليها تصبح شفافة
        xx = evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
       this.setOpacity((float)1.0);
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();//بش نخلي شاشة تتحرك 
        int y  = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_formMouseDragged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        UseDatabase.filComboBox("select ship_name from ship  where Active =1 ", choice1);
        bg.add(nameship);
        bg.add(nameRB);
        bg.add(number);
        UseDatabase.filComboBox("select company_name from company_leased where Active =1 ", choice2);
        UseDatabase.filComboBox("select ship_name from ship where Active = 1 and rentel = 0",choice1);
        UseDatabase.fillJTable("select * from rent_ship where Active=1", JTable_Display_rental);
        String numb_s = rs.GetAutoNumber();
            no.setText(numb_s);
//        jPanel8.setVisible(false);
//        JTable_Display_company_Data.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_noMouseClicked

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noActionPerformed
     public void setcolor(JPanel panel){
        panel.setBackground(new java.awt.Color(9,9,191));
    }
    public void resetcolor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,0,170));
    }
    private void timeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_timeMouseClicked

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void Archive1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Archive1MouseClicked
        setvalues();
        rs.Delete(labMessage);
        database.UseDatabase.fillJTable("select * from rent_ship where Active = 1", JTable_Display_rental);
    }//GEN-LAST:event_Archive1MouseClicked

    private void Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add1MouseClicked
        if(no.getText().length()==0 || Date_E.getDate().equals("") || Date_S.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        setvalues();
        rs.Add(labMessage);
        }    database.UseDatabase.fillJTable("select * from rent_ship where Active = 1", JTable_Display_rental);
    }//GEN-LAST:event_Add1MouseClicked

    private void update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update1MouseClicked
        if(no.getText().length()==0 || Date_E.getDate().equals("") || Date_S.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        setvalues();
        rs.Update(labMessage);
        database.UseDatabase.fillJTable("select * from rent_ship where Active = 1", JTable_Display_rental);
        }
    }//GEN-LAST:event_update1MouseClicked

    private void ShowAll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowAll1MouseClicked
        // TODO add your handling code here:
        database.UseDatabase.fillJTable("select * from rent_ship where Active = 1", JTable_Display_rental);

    }//GEN-LAST:event_ShowAll1MouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        Cleardata();
        String numb_s = rs.GetAutoNumber();
            no.setText(numb_s);
    }//GEN-LAST:event_ClearMouseClicked

    private void JTable_Display_rentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_Display_rentalMouseClicked

        try {
            // TODO add your handling code here:
            int row = JTable_Display_rental.getSelectedRow();
            String C_Number = JTable_Display_rental.getValueAt(row, 0).toString();
            no.setText(C_Number);
            DefaultTableModel model = (DefaultTableModel) JTable_Display_rental.getModel();
            int index = JTable_Display_rental.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 3));
            Date_S.setDate(date);
            DefaultTableModel model1 = (DefaultTableModel) JTable_Display_rental.getModel();
            int index1 = JTable_Display_rental.getSelectedRow();
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model1.getValueAt(index1, 4));
            Date_E.setDate(date1);
            String company = JTable_Display_rental.getValueAt(row, 2).toString();
            String ship =JTable_Display_rental.getValueAt(row, 1).toString();
            choice1.setSelectedItem(ship);
            choice2.setSelectedItem(company);

            
        } catch (ParseException ex) {
            Logger.getLogger(F_Add_Rentel_ship.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JTable_Display_rentalMouseClicked

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
        String strSearch = "select * from rent_ship where ";
        if (number.isSelected()) {
            strSearch += "no_ship_trip";
        } else if (nameship.isSelected()) {
            strSearch += "shipname";
        } else {
            strSearch += "compayname";
        }
        strSearch += " like '%" + Search.getText() + "%'";
        database.UseDatabase.fillJTable(strSearch, JTable_Display_rental);
    }//GEN-LAST:event_search_byMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void nameRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameRBActionPerformed
      
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
            java.util.logging.Logger.getLogger(F_Add_Rentel_ship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_Add_Rentel_ship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_Add_Rentel_ship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_Add_Rentel_ship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_Add_Rentel_ship().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Archive1;
    private javax.swing.JLabel Back1;
    private javax.swing.JLabel Clear;
    private com.toedter.calendar.JDateChooser Date_E;
    private com.toedter.calendar.JDateChooser Date_S;
    private javax.swing.JTable JTable_Display_rental;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel ShowAll1;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JComboBox<String> choice1;
    private javax.swing.JComboBox<String> choice2;
    private javax.swing.JTextField date;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labMessage;
    private javax.swing.JRadioButton nameRB;
    private javax.swing.JRadioButton nameship;
    private javax.swing.JTextField no;
    private javax.swing.JRadioButton number;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search_by;
    private javax.swing.JTextField time;
    private javax.swing.JLabel update1;
    // End of variables declaration//GEN-END:variables
}
