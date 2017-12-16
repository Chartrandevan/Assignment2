package assignment2actual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

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
 
 
 public class time
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        private static int linenum;
     
 	// ********** constructors ***********
 	    
 	// ********** accessors **********
 	
        public static int[] getTime(int i, String[] tokens) throws IOException{
       linenum=i;
               
            tokens = addtime(tokens, linenum + 1);
         int[] comptime = new int[10]; 
          comptime = time.compressearray(tokens);  
            return comptime;            
        }//end getTime
        
 	// ********** mutators **********

    
        
        public static int[] compressearray(String[] tokens){
            int singlecount = 0;// a counter for spliting up tokens
            int count = 0;
            int []comptime = new int[tokens.length];
            String delim = ":";
            int minutes = 0;
            int seconds = 0;
            int lcount = 0;
            String smalltokens [] = null;
            
            for(count = 0; count < tokens.length; count++){
            minutes = 60 * Integer.parseInt(tokens[count].split(delim)[0]);     
            seconds = Integer.parseInt( tokens[count].split(delim)[1]); 
                
            for (lcount = 0; lcount <= 1; lcount++){
             comptime[count] = minutes + seconds;  
            }//end lcount for
            }//end for
            
            return comptime;            
        }//end compresse array
        
        public static String[] addtime(String[]token, int num){
        String[]tokens = null;
 
        if(token.length < 10){
         tokens = new String[token.length+1];  
         for(int count = 0; count < token.length; count++) {
           tokens[count] = token[count];   
       }//end for  
         tokens[token.length] = JOptionPane.showInputDialog("Enter the time you would like to add for skater " + num, "M:SS");
        }
        else {
        tokens = new String[token.length];
         for(int count = 0; count < token.length-1; count++) {
           tokens[count] = token[count+1];   
       }//end for  
         tokens[token.length-1] = JOptionPane.showInputDialog("Enter the time you would like to add for skater " + num, "M:SS");
        }
        return tokens;
            }//end
        
        
 }  // end class