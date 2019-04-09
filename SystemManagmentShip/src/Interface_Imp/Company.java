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

public class Company implements main_Data{
    private int number;
    private String name;
    private String Email;
    private Date Date_start;
    private Date Date_end;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDate_start() {
        return Date_start;
    }

    public void setDate_start(Date Date_start) {
        this.Date_start = Date_start;
    }

    public Date getDate_end() {
        return Date_end;
    }

    public void setDate_end(Date Date_end) {
        this.Date_end = Date_end;
    }

    @Override
    public void Add(JLabel labMessage) {
//             String wieght_pattren="[a-zA-Z0-9].[a-z]@[a-zA-Z].[a-zA-Z]";
//            Pattern pattern = Pattern.compile(wieght_pattren);
//            Matcher reMatcher = pattern.matcher(Email);
//            if(!reMatcher.matches()){
//                Tools.msBox("The Email Format is no correct");
//            }else{
          String insert = "insert into company_leased values("
              + "'" +number +"',"
              + "'" + name +"',"
              + "'" + Date_start +"',"
              + "'" + Date_end +"',"
              + "'" + Email +"',"
              + "'" + 1 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
//      }
            }
        }
    

    @Override
    public void Update(JLabel labMessage) {
//          String wieght_pattren="[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]";
//            Pattern pattern = Pattern.compile(wieght_pattren);
//            Matcher reMatcher = pattern.matcher(Email);
//            if(!reMatcher.matches()){
//                Tools.msBox("The Email Format is no correct");
//            }else{
                // 	company_name 	con _start_date 	con_end_date 	Email
            String update = "Update company_leased set company_name='"
              + name +"',"   
              + "con_start_date='" + Date_start +"'," 
              + "con_end_date='" + Date_end +"',"
              + "Email='" + Email +"'"
              + "where company_num='" +number +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
            }
    

    @Override
    public void Delete(JLabel labMessage) {
          String Delete = "Update company_leased set Active = 0 where company_num='" + number+"'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    @Override
    public String GetAutoNumber() {
      return database.UseDatabase.GetAutoNumber("company_leased", "company_num");
    }
}
