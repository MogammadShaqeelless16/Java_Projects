
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

public class Method {
         static int length;  
         static int width;  
           public  void calculatearea(int l ,int w ){
               this.length =l;
               this.width =w;
               int  area = length*width;
               JOptionPane.showMessageDialog(null, "AREA is "+area);
           }
           public static void main (String[]args){
               Scanner s =new Scanner(System.in);           
                 Method area =new Method();
               Method b =new Method();
                System.out.println("Please enter length");
                b.length = s.nextInt();
                area.length = s.nextInt();
                System.out.println("Please enter width");
                b.width = s.nextInt(); 
                area.width = s.nextInt();
               b.calculatearea(b.length, b.width);
               area.calculatearea(b.length, b.width);
           }
}
        
