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
public class minimum {
    
    public static void main (String []args) {
         Scanner user_input = new Scanner( System.in );  
        System.out.println("Enter first Number ");
         int x =user_input.nextInt();
         System.out.println("Enter Second Number ");
	int y = user_input.nextInt();

	int min;
 
	min = (x < y ) ?x : y ;
 
	System.out.println("Minimum of two numbers is "+ min);
    }
 
    }
