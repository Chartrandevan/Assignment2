package assignment2actual;

// **********************************************************************
// Programmer:	Evan Chartrand
// Class:		CS30S
//
// Assignment:	Assignment 2
//
// Description:	my program will create a array of skater objects and perform 
//various functions with it
//
//
//	Input:		a series of times from a text file
//
//  Output:		the times, the skaters id, the average speed 
//and the average time
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
	
      int timereq = 0;//the time or speed of the race the user would like to see
          int skaterreq = 0;//the skater the user would like to see
          int count = 0;//a counter
          int complist[] = null;//the list of compressed times
          int skcount = 0;//a counter of the number of skaters
          skater[] skatearray = new skater[10];//an array of skater objects
          
          String delim = " ";//a deliminator
          String strin;  //a string for getting input
           BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));//for reading data from a texxt file
           
            String banner;               // output banner

        // **** create banner ****
        banner = "*******************************************\n";
        banner += "Name:		Evan Chartrand\n";
        banner += "Class:		CS30S\n";
        banner += "Assignment:	Assignment 2\n";
        banner += "*******************************************\n\n";
        System.out.println(banner);

          
	// ***** create objects *****
    
         String tokens[] = null;//an array of strings
        
        strin = fin.readLine();
        while (strin != null){
        tokens = strin.split(delim);
        skatearray[skcount] = new skater(skcount, tokens);//creation of skater objects
        complist = skatearray[skcount].getcomptime();//give the skater object in the skater array their list of data
         
         //while output
         
      System.out.print("skater " + skatearray[skcount].getid() + "'s times: "); //prints the skaters id 
        for(int smallcount = 0; smallcount < complist.length; smallcount++){ //prints each time
        System.out.print(complist[smallcount]/60 + ":");//
              if(complist[smallcount]>= 420 && complist[smallcount] < 430) { // helps format numbers like, 7:05
                 System.out.print("0"); 
            }//end if
            System.out.print(complist[smallcount] % 60 + " ");
        }//end small for
        System.out.print(", average time = " + skatearray[skcount].getaverage()/60 + ":");//prints average time
              if(skatearray[skcount].getaverage() >= 420 && skatearray[skcount].getaverage() < 430) {//helps format average time
                 System.out.print("0"); 
            }//end if
            System.out.print(skatearray[skcount].getaverage() % 60 + " ");
            
            System.out.println(" , Average speed = " + (int) (5 / ((double)skatearray[skcount].getaverage() / 3600)) + "km/hr");//prints average speed
            
        System.out.println();//helps with formating

        skcount ++;//number of times through the loop
        strin = fin.readLine(); //loop update statement     
        }//end while
        
         String promt = "which skater would you like to see the times of"+ "\nex 3"+"\nenter -1 to cancel";//updates prompt
         skaterreq = getNumber(banner, promt);//finds the skater the user would like
        while(skaterreq != -1){
         promt = "Which time would you like to view"+"\nex 7"+"\nenter -1 to cancel or select antoher skater";//finds the time they would like to see
         timereq = getNumber(banner, promt);//loop control statement
         while (timereq != -1){
         System.out.print("time = " + skatearray[skaterreq-1].getcomptime()[timereq-1]/60 + ":");//prints the time
              if(skatearray[skaterreq-1].getcomptime()[timereq-1] >= 420 && skatearray[skaterreq-1].getcomptime()[timereq-1] < 430) {//helps with formating
                 System.out.print("0"); 
            }//end if
            System.out.print(skatearray[skaterreq-1].getcomptime()[timereq-1] % 60 + " ");
            
          timereq = getNumber(banner, promt);//loop update statement
         }//end while time req
         promt = "which skater would you like to see the times of"+ "\nex 3"+"\nenter -1 to cancel";
         skaterreq = getNumber(banner, promt);
        }//end while skaterreq
        
         promt = "which skater would you like to see the speed of"+ "\nex 3"+"\nenter -1 to cancel";
         skaterreq = getNumber(banner, promt);//loop control statement 
         while(skaterreq != -1){
         promt = "Which race would you like to see the speed of"+"\nex 7"+"\nenter -1 to cancel or select antoher skater";
         timereq = getNumber(banner, promt);//loop control statement
         while (timereq != -1){
         System.out.println("time = " + (int) (5 / ((double)skatearray[skaterreq -1].getaverage() / 3600)) + "km/hr");//prints the speed of a requested race
          timereq = getNumber(banner, promt);
         }//end while timereq
         promt = "which skater would you like to see the speeds of"+ "\nex 3"+"\nenter -1 to cancel";
         skaterreq = getNumber(banner, promt);
        }//end while skaterreq

	// ***** closing message *****
	
		System.out.println("\nend of processing");
	
	}  // end main	
        
        
    
        public static int getNumber(String banner, String promt) {
        int n = 0;          // local varible to hold integer from keyboard buffer
        n = Integer.parseInt(JOptionPane.showInputDialog(banner+ promt));
        return (n);
    } // end getNumber
}  // end class