package assignment2actual;

import java.io.IOException;

/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class skater
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
    
    private int length;
    private int [] comptime;
    private int id = 0 ;
    
        // ********** constructors ***********
 	
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //purpose: create a new circle with default properties
        //interface
        //in: none
        //out: none
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        public skater(int i, String[] tokens) throws IOException{
        comptime = time.getTime(i,tokens);
        length = tokens.length;
               id = i + 1;
        }//end skater
        
         //end of default constructer
     
 	// ********** accessors **********
 	
        public int[] getcomptime(){
        return comptime;    
        }
        
        public int getid(){
        return id;
        }
        
        public int getaverage(){
          int sum = 0;
          int avcount = 0;
        for (int count = 0; count < length; count++) {
            sum = sum + comptime[count];
            avcount++;
        } //end for 
        sum = sum/avcount;
        return sum;
        }
           
 	// ********** mutators **********
 
                    //************************************************
    // Purpose: to average an array
    // Interface: IN: the array and length of it
    // Returns: the average of an array
    // *****************************************************
    public static int averagearray(int[] arreh, int max) {
        int average = addarray(arreh, max) / max;
        return average;
    }//end average
    //************************************************
    // Purpose: to add an array
    // Interface: IN: the array and length of it
    // Returns: the sum of an array
    // *****************************************************
    public static int addarray(int[] arreh, int max) {
        int sum = 0;
        for (int count = 0; count < max; count++) {
            sum = sum + arreh[count];
        } //end for 
        return sum;
    }//end printarray
    
    
 }  // end class