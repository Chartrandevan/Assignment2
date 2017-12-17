package assignment2actual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/* **********************************************************
 * Programmer:	Evan Chartrand
 * Class:		CS30S
 * 
 * Assignment:	Assignment 2
 *
 * Description:	an object for data manipulation
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class time
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        private static int linenum;//the skaters id
     
 	// ********** constructors ***********
 	    
 	// ********** accessors **********
 	
        public static int[] getTime(int i, String[] tokens) throws IOException{
       linenum = i;//gives linenum a value
               
            tokens = addtime(tokens, linenum + 1);//tokens is given a value
         int[] comptime = new int[9]; //an array of compressed times
          comptime = time.compressearray(tokens);  //assigns comptime
            return comptime;            
        }//end getTime
        
 	// ********** mutators **********

    
        
        public static int[] compressearray(String[] tokens){
            int singlecount = 0;// a counter for spliting up tokens
            int count = 0;//a counter
            int []comptime = new int[tokens.length];//creates array for the compressed values
            String delim = ":";//a deliminator
            int minutes = 0;// the minutes
            int seconds = 0;// the seconds
            String smalltokens [] = null;//a tokens for each indivdual time
            
            for(count = 0; count < tokens.length; count++){
            minutes = 60 * Integer.parseInt(tokens[count].split(delim)[0]);  //assigns minutes   
            seconds = Integer.parseInt( tokens[count].split(delim)[1]); //assigns seconds
                
             comptime[count] = minutes + seconds;  //declares comptime
            }//end for
            
            return comptime;            
        }//end compresse array
        
        public static String[] addtime(String[]token, int num){
        String[]tokens = null;//the array that will be returned 
 
        if(token.length < 10){//loads tokens if no times have to be changed just added
         tokens = new String[token.length+1];  
         for(int count = 0; count < token.length; count++) {
           tokens[count] = token[count];   
       }//end for  
         tokens[token.length] = JOptionPane.showInputDialog("Enter the time you would like to add for skater " + num, "M:SS");
        }//end if
        else {//loads tokens if there already ten times and one must be deleted
        tokens = new String[token.length];
         for(int count = 0; count < token.length-1; count++) {
           tokens[count] = token[count+1];   
       }//end for  
         tokens[token.length-1] = JOptionPane.showInputDialog("Enter the time you would like to add for skater " + num, "M:SS");
        }//end else
        return tokens;
            }//end add times
        
        
 }  // end class