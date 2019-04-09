/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Imp;

import javax.swing.JLabel;

public class workin implements main_Data{
    private int tripno;
    private String shipname;
    private String empname;
    private String typejob;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTripno() {
        return tripno;
    }

    public void setTripno(int tripno) {
        this.tripno = tripno;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getTypejob() {
        return typejob;
    }

    public void setTypejob(String typejob) {
        this.typejob = typejob;
    }

    @Override
    public void Add(JLabel labMessage) {
          String insert = "insert into workin values("
              + "'" +number +"',"    
              + "'" +tripno +"',"
              + "'" +  empname+"',"
              + "'" +  shipname+"',"
              + "'" + typejob +"',"
              + "'" + 1 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }
    }

    @Override
    public void Update(JLabel labMessage) {
            String update = "Update workin set empname='" 
              + empname +"',"
              + "ship_name='" +shipname  +"'," 
              + "typejob='" + typejob +"',"
              + "tripno='" + tripno +"'"
              + "where no='" +number +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }

    }

    @Override
    public void Delete(JLabel labMessage) {
          String Delete = "Update workin set Active = 0  where no='" + number+"'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }
    }

    @Override
    public String GetAutoNumber() {
      return database.UseDatabase.GetAutoNumber("workin", "no");
    }
    
}
