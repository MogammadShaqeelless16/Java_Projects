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
public class Room_Dimension {
    public static void main(String[]args){
       Scanner user_input = new Scanner( System.in );
       
       System.out.println("Enter a length: ");
        double length;  
        length = user_input.nextDouble();
        System.out.println("Enter a width: ");
        double width;     
        width=  user_input.nextDouble();
        double answer;  
    
        System.out.println("Enter a Price: ");
        double price;
        price=user_input.nextDouble();
       
        answer = length *width;      
        System.out.println("price per square metres = R" +price); 
        System.out.println("Area of floor to get carpet = R" +answer+"m^2");
        System.out.println("price per carpet = R" +price*answer );  

    } 
}
    
        
        
        
   

  