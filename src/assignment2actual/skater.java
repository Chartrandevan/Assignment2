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
     
    private int [] comptime;
 	
        // ********** constructors ***********
 	
            //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //purpose: create a new circle with default properties
        //interface
        //in: none
        //out: none
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        public skater(int id, String[] tokens) throws IOException{
       comptime = time.getTime(id,tokens);
        
        }//end skater
        
         //end of default constructer
     
 	// ********** accessors **********
 	
        public int[] getcomptime(){
        return comptime;    
        }
        
 	// ********** mutators **********
 
 }  // end class