package systemmanagmentship;


import java.awt.*;
import java.io.*;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.*;
       //create message in window
public class Tools{
    public static void msBox(String Message){
        JOptionPane.showMessageDialog(null, Message);
         JOptionPane.setDefaultLocale(Locale.ROOT);
}
    //for open window with image
    public static void openForm(JFrame form){
        form.setLocationRelativeTo(null);
        form.setOpacity((float)1.0);
        try {
            Image img = ImageIO.read(Tools.class.getResource("logo.png"));
            form.setIconImage(img);
            form.setVisible(true);
           
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        }     
         
     }

            
        
    
    
