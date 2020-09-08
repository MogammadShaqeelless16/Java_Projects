/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;
   
public class Japplet extends Applet implements ActionListener {
     String st="";
   private Button morningButton, afternoonButton,eveningButton;
   
   public void init() { 
       morningButton = new Button("Morning"); 
      add(morningButton); 
      morningButton.addActionListener(this); 
      afternoonButton = new Button("Afternoon"); 
      add(afternoonButton); 
      afternoonButton.addActionListener(this); 
    eveningButton = new Button("Evening"); 
      add(eveningButton); 
      eveningButton.addActionListener(this); 
   }
      public void paint(Graphics g) {
      if(st.equals("Good Morning to you")){
  g.setColor(Color.green);
  g.setFont(new Font("Helvetica",Font.BOLD,20));
      }
      if(st.equals("Good Afternoon to you")){
  g.setColor(Color.yellow);
  g.setFont(new Font("Arial",Font.BOLD,20));
      }
      if(st.equals("Good Evening to you")){
  g.setColor(Color.blue);
  g.setFont(new Font("Book Antiqua",Font.BOLD,20));
      }
  g.drawString(st,100,200);  
   }
      public void actionPerformed(ActionEvent event) { 
      if (event.getSource() == morningButton) {
         st ="Good Morning to you";
     repaint();
    }
      if (event.getSource() == afternoonButton){ 
         st ="Good Afternoon to you";
         repaint();
    }
    if (event.getSource() == eveningButton) {
         st ="Good Evening to you";
         repaint(); 
    }
   } 
} 

