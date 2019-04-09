/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Imp;

import java.util.Date;
import javax.swing.JLabel;

public class Rentel_Ship implements main_Data{
  private String nameShip;
  private String nameCompany;
  private Date dateStart;
  private Date dateEnd;
  private int  number;
  

    public String getNameShip() {
        return nameShip;
    }

    public void setNameShip(String nameShip) {
        this.nameShip = nameShip;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
    public int getnumber() {
        return number;
    }

    public void setnumber(int shipno) {
        this.number = shipno;
    }


    @Override
    public void Add(JLabel labMessage) {
            String insert = "insert into rent_ship values("
              + "'" + number +"',"
              + "'" + nameShip +"',"
              + "'" + nameCompany +"',"
              + "'" + dateStart +"',"
              + "'" + dateEnd +"',"
              + "'" + 1 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }
        }
    

    @Override
    public void Update(JLabel labMessage) {
             String update = "Update rent_ship set shipname='"
              + nameShip +"',"   
              + "start_date='" +dateStart +"'," 
              + "end_date='" + dateEnd +"'"
              + "where no_ship_trip='" +number +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
            

    }

    @Override
    public void Delete(JLabel labMessage) {
     String Delete = "Update rent_ship  set Active = 0 where no_ship_trip='" +number+ "'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    @Override
    public String GetAutoNumber() {

      return database.UseDatabase.GetAutoNumber("rent_ship", "no_ship_trip");
    }

   

}
