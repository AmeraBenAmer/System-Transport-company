
package Interface_Imp;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import systemmanagmentship.Tools;

public class trip implements main_Data{
   private int trip_no;
   private String ship_name;
   private String company_name;
   private String from_seaport;
   private String to_seaport;
   private String loadwieght;
   private Date date_s;
   private Date date_e;
   private String time_trip;

    public int getTrip_no() {
        return trip_no;
    }

    public void setTrip_no(int trip_no) {
        this.trip_no = trip_no;
    }

    public String getShip_name() {
        return ship_name;
    }

    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getFrom_seaport() {
        return from_seaport;
    }

    public void setFrom_seaport(String from_seaport) {
        this.from_seaport = from_seaport;
    }

    public String getTo_seaport() {
        return to_seaport;
    }

    public void setTo_seaport(String to_seaport) {
        this.to_seaport = to_seaport;
    }

    public String getLoadwieght() {
        return loadwieght;
    }

    public void setLoadwieght(String loadwieght) {
        this.loadwieght = loadwieght;
    }

    public Date getDate_s() {
        return date_s;
    }

    public void setDate_s(Date date_s) {
        this.date_s = date_s;
    }

    public Date getDate_e() {
        return date_e;
    }

    public void setDate_e(Date date_e) {
        this.date_e = date_e;
    }

    public String getTime_trip() {
        return time_trip;
    }

    public void setTime_trip(String time_trip) {
        this.time_trip = time_trip;
    }

    @Override
    public void Add(JLabel labMessage) {
         String time="[0-9]{2}:[0-9]{2}:[0-9]{2}(am||pm)";
            Pattern pattern = Pattern.compile(time);
            Matcher reMatcher = pattern.matcher(time_trip);
            if(!reMatcher.matches()){
                Tools.msBox("The Time Format is no correct");
            }else{
            String insert = "insert into trip values("
               + "'" + trip_no +"',"
              + "'" + ship_name +"',"
             + "'" +company_name +"',"
              + "'" + from_seaport +"',"
              + "'" + to_seaport +"',"
              + "'" + loadwieght +"',"
              + "'" + date_s +"',"
              + "'" + date_e +"',"
              + "'" + time_trip +"',"
              + "'" + 1 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }
            }

    }

    @Override
    public void Update(JLabel labMessage) {
 String time="[0-9]{2}:[0-9]{2}:[0-9]{2}(am||pm)";
            Pattern pattern = Pattern.compile(time);
            Matcher reMatcher = pattern.matcher(time_trip);
            if(!reMatcher.matches()){
                Tools.msBox("The Time Format is no correct");
            }else{
         String update = "Update trip set companyname='"
              + company_name +"',"   
              + "shipname='" + ship_name +"',"
              + "f_seaport='" + from_seaport +"'," 
              + "t_seaport='" + to_seaport +"',"
              + "load_wieght='" + loadwieght +"',"
              + "date_trip_s='" + date_s +"',"
              + "date_trip_e='" + date_e +"',"
              + "time_trip='" + time_trip +"'"
              + "where trip_no='" +trip_no +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
            }
    }

    @Override
    public void Delete(JLabel labMessage) {

  String Delete = "Update trip set Active = 0 where trip_no='" + trip_no+"'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    @Override
    public String GetAutoNumber() {

        return database.UseDatabase.GetAutoNumber("trip", "trip_no");
    }
   
}
