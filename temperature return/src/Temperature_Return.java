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
public class Temperature_Return { 
    private static double temp;
    
public static double degreecelcies (double c){
     c = temp;
     double f = ((32+c)*5/9);
     return f; 
}
    public static void main (String[]args) {
     Scanner S = new Scanner (System.in);
     System.out.println("Enter celies");
      temp = S.nextDouble();
      System.out.println("Fahrenheit is:"+ degreecelcies(temp));
    }
  }  
