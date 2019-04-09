package Forms;

import systemmanagmentship.Tools;
import Interface_Imp.ship;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FleetOpertions extends javax.swing.JFrame {
    public FleetOpertions() {
        initComponents();
        this.setLocationRelativeTo(null);
        name.requestFocus();//هذا يخلي المؤشر داخل حقل الاسم المستخدم
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_Ship = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        wieght = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        joindate = new com.toedter.calendar.JDateChooser();
        number = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        Update = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        labMessage = new javax.swing.JLabel();
        Delet1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        search_by = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        Search = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        nameRB = new javax.swing.JRadioButton();
        Typeload = new javax.swing.JRadioButton();
        loadWieght = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_Display_Ship.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTable_Display_Ship.setForeground(new java.awt.Color(0, 0, 139));
        jTable_Display_Ship.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Name", "Join Date", "Type load", "Load wieght"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Display_Ship.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable_Display_Ship.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_Display_Ship.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_ShipMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Display_Ship);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 139));
        jLabel3.setText("Name Ship:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 139));
        jLabel4.setText("Type Load:");

        name.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 139));
        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 139));
        jLabel7.setText("Join Date:");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 139));
        jLabel9.setText("load wieght:");

        type.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        type.setForeground(new java.awt.Color(0, 0, 139));
        type.setBorder(null);
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        wieght.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        wieght.setForeground(new java.awt.Color(0, 0, 139));
        wieght.setBorder(null);
        wieght.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wieghtActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 0, 139));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 139));
        jSeparator9.setAlignmentY(0.8F);

        jSeparator10.setBackground(new java.awt.Color(0, 0, 139));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 139));
        jSeparator10.setAlignmentY(0.8F);

        jSeparator11.setBackground(new java.awt.Color(0, 0, 139));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 139));
        jSeparator11.setAlignmentY(0.8F);

        jSeparator12.setBackground(new java.awt.Color(0, 0, 139));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 139));
        jSeparator12.setAlignmentY(0.8F);

        joindate.setBackground(new java.awt.Color(255, 255, 255));
        joindate.setForeground(new java.awt.Color(0, 0, 139));
        joindate.setToolTipText("");
        joindate.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N

        number.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 139));
        number.setText("number");

        num.setEditable(false);
        num.setBackground(new java.awt.Color(255, 255, 255));
        num.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        num.setForeground(new java.awt.Color(0, 0, 139));
        num.setBorder(null);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        jSeparator13.setBackground(new java.awt.Color(0, 0, 139));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 139));
        jSeparator13.setAlignmentY(0.8F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wieght, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wieght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Add.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 0, 139));
        Add.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\icon8\\icons8_Add_New_32.png")); // NOI18N
        Add.setText("Add Ship");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Update.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(0, 0, 139));
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Refresh_32_1.png"))); // NOI18N
        Update.setText("Update");
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        Show.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Show.setForeground(new java.awt.Color(0, 0, 139));
        Show.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\icon8\\icons8_Show_Property_32.png")); // NOI18N
        Show.setText("Show All");
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 0, 139));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Broom_32.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });

        labMessage.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        labMessage.setForeground(new java.awt.Color(0, 0, 139));

        Delet1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        Delet1.setForeground(new java.awt.Color(0, 0, 139));
        Delet1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\icon8\\icons8_Trash_32.png")); // NOI18N
        Delet1.setText("Delet");
        Delet1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delet1MouseClicked(evt);
            }
        });

        exit.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 139));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Cancel_32.png"))); // NOI18N
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 139));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Prin_32.png"))); // NOI18N
        jLabel17.setText("Print");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(labMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Delet1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delet1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(labMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 139));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_Back_32.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        search_by.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Search_32.png"))); // NOI18N
        search_by.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search_by.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_byMouseClicked(evt);
            }
        });

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator7.setAlignmentY(0.8F);

        Search.setBackground(new java.awt.Color(0, 0, 139));
        Search.setFont(new java.awt.Font("Comic Sans MS", 2, 15)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setBorder(null);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search By :");

        nameRB.setBackground(new java.awt.Color(0, 0, 139));
        nameRB.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        nameRB.setForeground(new java.awt.Color(255, 255, 255));
        nameRB.setSelected(true);
        nameRB.setText("Name");

        Typeload.setBackground(new java.awt.Color(0, 0, 139));
        Typeload.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        Typeload.setForeground(new java.awt.Color(255, 255, 255));
        Typeload.setText("Type Load");

        loadWieght.setBackground(new java.awt.Color(0, 0, 139));
        loadWieght.setFont(new java.awt.Font("Comic Sans MS", 2, 13)); // NOI18N
        loadWieght.setForeground(new java.awt.Color(255, 255, 255));
        loadWieght.setText("Load Wieght");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addGap(41, 41, 41)
                .addComponent(search_by)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(nameRB)
                .addGap(29, 29, 29)
                .addComponent(Typeload)
                .addGap(28, 28, 28)
                .addComponent(loadWieght)
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loadWieght)
                            .addComponent(Typeload)
                            .addComponent(nameRB)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_by, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void wieghtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wieghtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wieghtActionPerformed
    java.util.Date date;
    java.sql.Date sqlDate;

    public void ClearData() {
        name.setText("");
        type.setText("");
        wieght.setText("");
        Date Date = null;
        joindate.setDate((Date));
        labMessage.setText("");
        Add.setEnabled(true);
        Update.setEnabled(false);
        Delet1.setEnabled(false);
        name.requestFocus();//هذا يخلي المؤشر داخل حقل الاسم المستخدم
        String numb_ship = sh.GetAutoNumber();
            num.setText(numb_ship);
    }
     ship sh = new ship();
    public void setvalues(){
    sh.setShipno(Integer.parseInt(num.getText()));
    sh.setShip_Name(name.getText());
    sh.setType_load( type.getText());
    sh.setLoad_Wieght(wieght.getText());
    date = joindate.getDate();
    sqlDate = new java.sql.Date(date.getTime());
    sh.setDate(sqlDate);
    
}
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if(num.getText().length()==0 || name.getText().length()==0 || type.getText().length()==0  ||
                wieght.getText().length()==0 || joindate.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        setvalues();
        sh.Add(labMessage);
        database.UseDatabase.fillJTable("select * from ship where Active = 1", jTable_Display_Ship);
        }
    }//GEN-LAST:event_AddMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked

        this.dispose();
        Tools.openForm(new FromAdmin1());
    }//GEN-LAST:event_BackMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        name.requestFocus();
        // واحد فقط اي حتطتيها في قروبbottion تحدد  
        btGroup1.add(nameRB);
        btGroup1.add(Typeload);
        btGroup1.add(loadWieght);
        Update.setEnabled(false);
        Delet1.setEnabled(false);
        database.UseDatabase.fillJTable("select * from ship where Active = 1", jTable_Display_Ship);
        jTable_Display_Ship.getTableHeader().setReorderingAllowed(false);
        String numb_ship = sh.GetAutoNumber();
            num.setText(numb_ship);
    }//GEN-LAST:event_formWindowOpened
   
    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
     
         if(num.getText().length()==0 || name.getText().length()==0 || type.getText().length()==0  ||
                wieght.getText().length()==0 || joindate.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        setvalues();
        sh.Update(labMessage);
        database.UseDatabase.fillJTable("select * from ship where Active = 1", jTable_Display_Ship);
         }
    }//GEN-LAST:event_UpdateMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        ClearData();
        Add.setEnabled(true);
    }//GEN-LAST:event_ClearMouseClicked

    private void search_byMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_byMouseClicked
        // TODO add your handling code here:
        String strSearch = "select * from ship where ";
        if (nameRB.isSelected()) {
            strSearch += "ship_name";
        } else if (Typeload.isSelected()) {
            strSearch += "load_type";
        } else {
            strSearch += "load_width";
        }
        strSearch += " like '%" + Search.getText() + "%'";
        database.UseDatabase.fillJTable(strSearch, jTable_Display_Ship);
    }//GEN-LAST:event_search_byMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        // TODO add your handling code here:
        database.UseDatabase.fillJTable("select * from ship where Active = 1", jTable_Display_Ship);
    }//GEN-LAST:event_ShowMouseClicked

    private void Delet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delet1MouseClicked
        if(num.getText().length()==0 || name.getText().length()==0 || type.getText().length()==0  ||
                wieght.getText().length()==0 || joindate.getDate().equals("")){
            labMessage.setText("please fill fields ! ");
        }else{
        setvalues();
        sh.Delete(labMessage);
        database.UseDatabase.fillJTable("select * from ship where Active = 1", jTable_Display_Ship);
        }
    }//GEN-LAST:event_Delet1MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked
    int xx, xy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        this.setOpacity((float) 0.2);//بش نخلي شاشة لما نظغط عليها تصبح شفافة
        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();//بش نخلي شاشة تتحرك 
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        this.setOpacity((float) 1.0);
    }//GEN-LAST:event_formMouseReleased

    private void jTable_Display_ShipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_ShipMouseClicked
        try {
            // TODO add your handling code here:
            int row = jTable_Display_Ship.getSelectedRow();
            String strNo = jTable_Display_Ship.getValueAt(row, 0).toString();
            String strName = jTable_Display_Ship.getValueAt(row, 1).toString();
            DefaultTableModel model = (DefaultTableModel) jTable_Display_Ship.getModel();
            int index = jTable_Display_Ship.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 2));
            joindate.setDate(date);
            String strTypeLoad = jTable_Display_Ship.getValueAt(row, 3).toString();
            String strLoadWieght = jTable_Display_Ship.getValueAt(row, 4).toString();
            name.setText(strName);
            type.setText(strTypeLoad);
            num.setText(strNo);
//        joindate.setDate(strJoinDate);
wieght.setText(strLoadWieght);
Add.setEnabled(false);
Update.setEnabled(true);
Delet1.setEnabled(true);
        } catch (ParseException ex) {
            Logger.getLogger(FleetOpertions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_Display_ShipMouseClicked

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            MessageFormat header = new MessageFormat("Report to Ships working on Company "+"\n");
            MessageFormat footer = new MessageFormat("Page - {0}");
            jTable_Display_Ship.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            Logger.getLogger(workOnShip.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(FleetOpertions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FleetOpertions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FleetOpertions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FleetOpertions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FleetOpertions().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Delet1;
    private javax.swing.JTextField Search;
    private javax.swing.JLabel Show;
    private javax.swing.JRadioButton Typeload;
    private javax.swing.JLabel Update;
    private javax.swing.ButtonGroup btGroup1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable_Display_Ship;
    private com.toedter.calendar.JDateChooser joindate;
    private javax.swing.JLabel labMessage;
    private javax.swing.JRadioButton loadWieght;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton nameRB;
    private javax.swing.JTextField num;
    private javax.swing.JLabel number;
    private javax.swing.JLabel search;
    private javax.swing.JLabel search_by;
    private javax.swing.JTextField type;
    private javax.swing.JTextField wieght;
    // End of variables declaration//GEN-END:variables
}
