/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Imp;

import javax.swing.JLabel;

public class employee implements main_Data{
     private int no;
     private String name;
     private String address;
     private String type_job;
     private int salary;
     
    @Override
    public void Add(JLabel labMessage) { 
    String insert = "insert into employee values("
              + "'" + no +"',"
              + "'" + name +"',"
              + "'" + address +"',"
              + "'" + salary +"',"
              + "'" + type_job +"',"
              + "'" + 1 +"',"
              + "'" + 0 +"')";
      boolean isAdd = database.UseDatabase.RunQuery(insert);
      if(isAdd){
          labMessage.setText("                    Add By Successful !");
      }    }

    @Override
    public void Update(JLabel labMessage) {
      String update = "Update employee set empname='"
              + name +"',"   
              + " address='" +address +"'," 
              + "salary='" +salary  +"'"
              + "typejob='" +type_job  +"'"
              + "where empno='" +no +"'";
      boolean isUpdate = database.UseDatabase.RunQuery(update);
      if(isUpdate){
          labMessage.setText("                    update By Successful !");
      }
    }

    @Override
    public void Delete(JLabel labMessage) {
      String Delete = "Update employee  set Active = 0 where empno='" +no+ "'";
         boolean isDelete = database.UseDatabase.RunQuery(Delete);
      if(isDelete){
          labMessage.setText("                    Archive By Successful !");
      }    }

    @Override
    public String GetAutoNumber() {
        return database.UseDatabase.GetAutoNumber("employee", "empno");
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType_job() {
        return type_job;
    }

    public void setType_job(String type_job) {
        this.type_job = type_job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
