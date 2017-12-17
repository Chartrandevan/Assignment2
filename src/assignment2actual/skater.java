package assignment2actual;

import java.io.IOException;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	Assignment 2
 *
 * Description:	a skater with a list of compressed times
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class skater
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
    
    private int length;//the length of the time
    private int [] comptime;//the array of times
    private int id = 0 ; //the unique id
    
        // ********** constructors ***********
 	
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //purpose: create a new skater with a list of times
        //interface
        //in: id and array of data
        //out: none
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        public skater(int i, String[] tokens) throws IOException{
        comptime = time.getTime(i,tokens);//gives a valuue to the list of times
        length = tokens.length;//declares variable length
               id = i + 1;
        }//end skater
        
         //end of default constructer
     
 	// ********** accessors **********
 	
        public int[] getcomptime(){
        return comptime;    
        }//returns list of times
        
        public int getid(){
        return id;
        }//returns id
        
        public int getaverage(){
          int sum = 0;
          int avcount = 0;
        for (int count = 0; count < length; count++) {
            sum = sum + comptime[count];//adds the numbers together
            avcount++;
        } //end for 
        sum = sum/avcount;//divides sum by the number of numbers
        return sum;
        }//returns average
           
 	// ********** mutators **********
    
 }  // end class