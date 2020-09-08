/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class Method {
    
   
        static int l;  
        static int w;  
    
    
           public static void calculatearea(){
              Scanner user_input = new Scanner( System.in );  
              
              System.out.println("Enter a length: " );
                l = user_input.nextInt();
                System.out.println("Enter a width: ");  
            w = user_input.nextInt();
                int Area = l*w;
                System.out.println("area is:" +Area);
           }
           
   public static void main(String[] args){
      calculatearea();      
       
}
}
