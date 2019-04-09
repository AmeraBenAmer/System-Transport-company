/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Imp;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import systemmanagmentship.Tools;

public class ship implements main_Data{

   private int Shipno;
   private String Ship_Name;
   private String Type_load;
   private java.util.Date join_Date;
   private String Load_Wieght;
   
 
    public ship() {
    }

    public int getShipno() {
        return Shipno;
    }

    public void setShipno(int Shipno) {
        this.Shipno = Shipno;
    }

    public String getShip_Name() {
        return Ship_Name;
    }

    public void setShip_Name(String Ship_Name) {
        this.Ship_Name = Ship_Name;
    }

    public String getType_load() {
        return Type_load;
    }

    public void setType_load(String Type_load) {
        this.Type_load = Type_load;
    }

    public Date getDate() {
        return join_Date;
    }

    public void setDate(Date date) {
        this.join_Date = date;
    }

    public String getLoad_Wieght() {
        return Load_Wieght;
    }

    public void setLoad_Wieght(String Load_Wieght) {
        this.Load_Wieght = Load_Wieght;
    }

    @Override
    public void Add(JLabel labMessage) {
        String wieght_pattren="[0-9]{1,10},[0-9]{1,10}[T]";
            Pattern pattern = Pattern.compile(wieght_pattren);
            Matcher reMatcher = pattern.matcher(Load_Wieght);
            if(!reMatcher.matches()){
                Tools.msBox("The Load Wieght Format is no correct");
            }else{
          String insert = "insert into ship values("
              + "'" +Shipno +"',"
              + "'" + Ship_Name +"',"
              + "'" + join_Date +"',"
              + "'" + Type_load +"',"
              + "'" + Load_Wieght +"',"
              + "'" + 1 +"',"
              + "'" + 0 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }
        }
    }

    @Override
    public void Update(JLabel labMessage) {
        String wieght_pattren="[0-9]{1,10},[0-9]{1,10}[T]";
            Pattern pattern = Pattern.compile(wieght_pattren);
            Matcher reMatcher = pattern.matcher(Load_Wieght);
            if(!reMatcher.matches()){
                Tools.msBox("The Load Wieght Format is no correct");
            }else{
          String update = "Update ship set ship_name='"
              + Ship_Name +"',"   
              + "join_date='" + join_Date +"',"
              + "Load_Type='" + Type_load +"'," 
              + "load_width='" + Load_Wieght +"'"
              + "where NumberShip='" +Shipno +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
            }  
    }

    @Override
    public void Delete(JLabel labMessage) {
        String Delete = "Update ship set Active = 0 where NumberShip='" + Shipno+"'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    
    @Override
    public String GetAutoNumber() {
        return database.UseDatabase.GetAutoNumber("ship", "NumberShip");
    }

}
