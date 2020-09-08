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
public class input_string {
     
  public static void main(String[] args) {
      try (Scanner user_input = new Scanner(System.in)) {
          System.out.println("Enter your word: \n");
          String word1 = user_input.next();
          System.out.println(word1.length());
      }
  }
}

