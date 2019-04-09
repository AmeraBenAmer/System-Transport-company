
package Interface_Imp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import systemmanagmentship.Tools;

public class seaPort implements main_Data{
    private int number_seaport;
    private String name_seaport;
    private String Location;
    
    public int getNumber_seaport() {
        return number_seaport;
    }

    public void setNumber_seaport(int number_seaport) {
        this.number_seaport = number_seaport;
    }

    public String getName_seaport() {
        return name_seaport;
    }

    public void setName_seaport(String name_seaport) {
        this.name_seaport = name_seaport;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    @Override
    public void Add(JLabel labMessage) {
            String wieght_pattren="[a-zA-Z]{1,20}";
            Pattern pattern = Pattern.compile(wieght_pattren);
            Matcher reMatcher = pattern.matcher(name_seaport);
            if(!reMatcher.matches()){
                Tools.msBox("The name Format is no correct");
            }else{
          String insert = "insert into seaport values("
              + "'" +number_seaport +"',"
              + "'" + name_seaport +"',"
              + "'" + Location +"',"
              + "'" + 1 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }
        }
    }

    @Override
    public void Update(JLabel labMessage) {
         String wieght_pattren="[a-zA-Z]{1,20}";
            Pattern pattern = Pattern.compile(wieght_pattren);
            Matcher reMatcher = pattern.matcher(name_seaport);
            if(!reMatcher.matches()){
                Tools.msBox("The name Format is no correct");
            }else{
        String update = "Update seaport set Seaportname ='"
              +  name_seaport+"',"   
              + "location='" + Location +"'"
              + "where numseaport='" + number_seaport +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
        
            }
    }

    @Override
    public void Delete(JLabel labMessage) {
         String Delete = "Update seaport set Active = 0 where numseaport='" + number_seaport+"'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    @Override
    public String GetAutoNumber() {
    return database.UseDatabase.GetAutoNumber("seaport", "numSeaPort"); 
    }

   
}
