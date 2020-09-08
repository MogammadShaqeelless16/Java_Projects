/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.io.*;
public class repeat_occurrence {


    public static void main(String[] args) throws IOException
    {
      String ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Words :");
      ch=br.readLine();
      int c=0,len=0;
        do
        {  
          try
          {
          char n[]=ch.toCharArray();
              len=n.length;
              c=0;
              for(int j=0;j<len;j++)
               {
                  if((n[0]==n[j])&&((n[0]>=65&&n[0]<=91)||(n[0]>=97&&n[0]<=123))) 
                      c++;
               }
              if(c!=0)
                System.out.println(n[0]+" "+c+" Time");
              ch=ch.replace(""+n[0],"");          
          }
          catch(Exception ex){}
        }
        while(len!=1);
   }

}