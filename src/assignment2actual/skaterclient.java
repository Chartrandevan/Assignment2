// **********************************************************************
// Programmer:	Rob Sveinson
// Class:		CS20S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************

import assignment2actual.skater;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class skaterclient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[]) throws FileNotFoundException, IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
          int count = 0;
          int complist[] = null;
          int skcount = 0;
          skater[] skatearray = new skater[10];
          
          String delim = " ";
          String strin;  
           BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
           
           	System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
		System.out.println("**********************************");
          
	// ***** create objects *****
    
         String tokens[] = null;
        
        strin = fin.readLine();
        while (strin != null){
        tokens = strin.split(delim);
        skatearray[skcount] = new skater(skcount, tokens);
         
       
        
         complist = skatearray[skcount].getcomptime();
         
         //while output
         
      System.out.print("skater " + skatearray[skcount].getid() + "'s times: ");   
        for(int smallcount = 0; smallcount < complist.length; smallcount++){
        System.out.print(complist[smallcount]/60 + ":");
              if(complist[smallcount]>= 420 && complist[smallcount] < 430) {
                 System.out.print("0"); 
            }//end if
            System.out.print(complist[smallcount] % 60 + " ");
        }//end small for
        System.out.print(", average time = " + skatearray[skcount].getaverage()/60 + ":");
              if(skatearray[skcount].getaverage() >= 420 && skatearray[skcount].getaverage() < 430) {
                 System.out.print("0"); 
            }//end if
            System.out.print(skatearray[skcount].getaverage() % 60 + " ");
            
            System.out.println(" , Average speed = " + (int) (5 / ((double)skatearray[skcount].getaverage() / 3600)) + "km/hr");
            
        System.out.println();

        skcount ++;
        strin = fin.readLine();      
        }//end while

        

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
        

    
    
        public static int getNumber(String banner, String promt) {
        int n = 0;          // local varible to hold integer from keyboard buffer
        n = Integer.parseInt(JOptionPane.showInputDialog(banner, promt));
        return (n);
    } // end getNumber
}  // end class