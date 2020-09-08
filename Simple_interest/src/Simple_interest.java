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
public class Simple_interest {
    public static void main(String[]args){
       Scanner user_input = new Scanner( System.in );  
         System.out.println("Enter a Percentage: ");
        double Percentage;  
        Percentage = user_input.nextDouble();
        System.out.println("Enter a Rand: ");
        double Rand;  
        Rand = user_input.nextDouble();
        System.out.println("Enter a number of years: ");
        double number_of_years;  
        number_of_years = user_input.nextDouble(); 
        double Simple_interest;
        Simple_interest = (Percentage * Rand * number_of_years)/100; 
         System.out.println("price per square metres = R" +Simple_interest); 
    }
}
