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

public class Converts {

 
private static String toRoman(int num) {
String[] RCharacters = { "M", "CM", "D", "C", "XC", "L", "X", "IX", "V", "I" };
int [] RValues = { 1000, 900, 500, 100, 90, 50, 10, 9, 5, 1 };
String result = "";



for (int N = 0; N < RValues.length; N++) {
int numberInPlace = num / RValues[N];
if (numberInPlace == 0) continue;

result += numberInPlace == 4 && N > 0? RCharacters[N] + RCharacters[N - 1]:
new String(new char[numberInPlace]).replace("\0",RCharacters[N]);
num = num % RValues[N];
}
return result;
}
 
public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number : ");
int decimal = scanner.nextInt();
if ( decimal < 0 ){ 
    System.out.println("You entered a negative number!");
decimal = 0; 
}else if(decimal == 0){ 
    System.out.println("You entered Zero or null!");
decimal = 0; 
}

System.out.println(toRoman(decimal)); 
}
}

