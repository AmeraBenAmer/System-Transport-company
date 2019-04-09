package database;

import Forms.FromAdmin1;
import Forms.LOOGIN;
import java.io.IOException;
import systemmanagmentship.Tools;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UseDatabase {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/companytransport";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;

    public static void setConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
          private static final Logger LOG = Logger.getLogger(LOOGIN.class.getName());

    public static boolean validate_login(String username, String password) throws SQLException {
        
            try {
                
                setConnection();
                PreparedStatement pst = conn.prepareStatement("Select TypeAdmin from users where username=? and pass=?");
                    pst.setString(1, username);
                    pst.setString(2, password);
                    ResultSet rs = pst.executeQuery();
                 
                    while (rs.next()) {
                        String type = rs.getString("TypeAdmin");
                        switch (type) {
                            case "Admin": 
                               Tools.openForm(new FromAdmin1());
                               FromAdmin1.Type(type);
                                break;
                            case "Commercial Manager":
                                Tools.openForm(new FromAdmin1());
                                FromAdmin1.Type(type);
                                 break;
                            case "Human resources manager":
                                Tools.openForm(new FromAdmin1());
                                FromAdmin1.Type(type);
                                 break;
                            default:
                                 break;
                        }
                        return true;
                    }
                    rs.close();
                FileHandler fh = new FileHandler("mylogger.log");
                fh.setLevel(Level.INFO);
                LOG.addHandler(fh);
            } catch (SQLException |IOException| SecurityException |ClassNotFoundException ex) {
                Tools.msBox("error! " + ex);
                LOG.log(Level.WARNING, "file logger not working ",ex);
            }  finally {
                    conn.close();
                }
                
        return false;
}
    public static void Registration(String username, String password, String Admin, String Fname) throws SQLException {
        try {
            setConnection();
            PreparedStatement pst = conn.prepareStatement("insert into users values(?,?,?,?)");
                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, Admin);
                pst.setString(4, Fname);
                int rs = pst.executeUpdate();
            

        } catch (ClassNotFoundException | SQLException e) {
            Tools.msBox(e.getMessage());

        } finally {
            conn.close();
        }
    }
    public static boolean RunQuery(String sqlStatment){
        try {
            setConnection();
            Statement stm = conn.createStatement();
            stm.execute(sqlStatment);
            conn.close();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Tools.msBox(ex.getMessage());
            return false;
        }
       
    }
 

    public static void fillJTable(String tableName_Or_statment, JTable table) {
        try {
            setConnection();
            Statement stm = conn.createStatement();
            ResultSet rs;
            rs = stm.executeQuery(tableName_Or_statment);
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();//number of column
            DefaultTableModel model = (DefaultTableModel) table.getModel();  //للتعامل مع الجدول
            Vector row = new Vector();
            model.setRowCount(0);
            while (rs.next()) {//تلف علي الصفوف
                row = new Vector(count);
                for (int i = 1; i <= count; i++) {
                    row.add(rs.getString(i));
                }
                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UseDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String GetAutoNumber(String tablename , String columnName){
        try {
            setConnection();
            Statement stmt = conn.createStatement();
            String strAuto = "select max(" + columnName + ")+1 as "+ columnName + " from " + tablename;
            stmt.executeQuery(strAuto);
            String Number = ""; //save in value Autonumber
            while(stmt.getResultSet().next()){
              Number = stmt.getResultSet().getString(columnName); 
            }
            conn.close();
            // if return null or empty meaning this first record
            if(Number == null || "".equals(Number)){
                return  "1";
            }else{
                return  Number;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Tools.msBox(ex.getMessage());
            return "0";
        }
      
    }
    
    public static void filComboBox(String SqlStatment, JComboBox comboname){
        try {
            setConnection();
            Statement stm = conn.createStatement();
            ResultSet rs;
            rs = stm.executeQuery(SqlStatment);
            rs.last();// نخلي المؤشر علي اخر صف لاني نبي عرف عدد الصفوف
            int counture = rs.getRow();//number of row
            rs.beforeFirst();
            String values[] = new String[counture];
            int i=0;
            while(rs.next()){
                values[i] = rs.getString(1);
                i++;
                
            }
            conn.close();
            comboname.setModel(new DefaultComboBoxModel(values));
            
        } catch (ClassNotFoundException | SQLException ex) {
            Tools.msBox(ex.getMessage());
        }
     
    }
    }
    


