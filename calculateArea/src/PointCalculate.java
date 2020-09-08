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
public class PointCalculate {
    private static double length ,width,heigth; 

     public static double calculate(double l, double w , double h) {
         double area = (2*(l*w)+2*(l*h));
         return area ;
     }
    public static void main (String[]args){
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter length");
    length = Sc.nextDouble();
    System.out.println("Enter heigth");
    heigth = Sc.nextDouble();
    System.out.println("Enter width");
    width = Sc.nextDouble();
    System.out.println("Area is:"+ calculate(length ,width,heigth ));
}
}
