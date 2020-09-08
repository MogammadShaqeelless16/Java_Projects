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

public class ReverseNumber {
    public static void main (String[]args)
   {
      int a, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
 
      while( a != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + a%10;
          a = a/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }
}

