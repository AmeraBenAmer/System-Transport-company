/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmanagmentship;

import Forms.LOOGIN;

public class SystemManagmentShip extends Thread{

    public static void main(String[] args) {
        Tools.openForm(new LOOGIN());
//        try {
//            // TODO code application logic here
//           
////            Tools.openForm(new looding());
//            looding lood = new looding();
//            lood.setVisible(true);
//            for(int i = 0 ; i <= 100 ; i++){
//               Thread.sleep(40);
//               looding.numberbar.setText(Integer.toString(i)+"%");
//               looding.jProgressBar1.setValue(i);
//               if(i==100){
//                 lood.setVisible(false);  
//                 Tools.openForm(new LOOGIN());
//               }
//            }
//        } catch (InterruptedException ex) {
//            Logger.getLogger(SystemManagmentShip.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
