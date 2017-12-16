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
          int complist[] = new int[10];
          int skcount = 0;
          skater[] skatearray = new skater[10];
          
          String delim = " ";
          String strin;  
           BufferedReader fin = new BufferedReader(new FileReader("skaterData.txt"));
          
	// ***** create objects *****
         strin = fin.readLine();
         String tokens[] = null;
        
        strin = fin.readLine();
        while (strin != null){
        tokens = strin.split(delim);
        skatearray[count] = new skater(skcount, tokens);
        skcount ++; 
        
         complist = skatearray[count].getcomptime();
        for(int smallcount = 0; smallcount < 10; smallcount++){
        System.out.print(complist[smallcount]/60 + ":" + complist[smallcount] % 60 + " ");    
        }//end small for
        System.out.println();
        
        
        strin = fin.readLine();
        }//end while
        
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
		System.out.println("**********************************");
		
	// ***** get input *****
	
            

                // all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
	
        
	// ***** output *****
	

        complist = skatearray[count].getcomptime();
        for(int smallcount = 0; smallcount < 10; smallcount++){
        System.out.print(complist[smallcount]/60 + ":" + complist[smallcount] % 60 + " ");    
        }//end small for
        System.out.println();

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class