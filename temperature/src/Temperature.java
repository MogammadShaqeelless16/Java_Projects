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

public class Temperature {
    public static void main (String[]args){
     Scanner S = new Scanner (System.in);
     System.out.println("Enter celies");
     double c = S.nextInt();
     double f; 
     f = (32 + c)*5/9; 
      System.out.println("Fahrenheit is:"+f);
     
    }
}
