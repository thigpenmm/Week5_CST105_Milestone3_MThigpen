/**Program: NFLPlayerManager Program
 *File: NFLPlayerManager.java
 *Summary: Prints listing of NFL Players and positions
 *Author: Mercedes Thigpen
 *Date: March 24, 2018
 **/

 package NFLList;
/**
 *
 * @author mthigpen
 */

import java.util.ArrayList;

 
 
        
public class NFLPlayerManager{
// begin NFLPlayerManager program class
 public static void main(String[] args) {
     ArrayList<String> nflPlayer = new ArrayList<>();
     ArrayList<String> position = new ArrayList<>();
     //creating parallel array lists for the NFL Player's names and Positions
     
     nflPlayer.add("Demarcus Lawrence"); //adding player name to nflPlayer Array
     position.add(" Defensive End");//adding player position to position Array
     
     nflPlayer.add("Maliek Collins");//adding player name to nflPlayer Array
     position.add(" Defensive Tackle");//adding player position to position Array
     
     nflPlayer.add("Tyrone Crawford");//adding player name to nflPlayer Array
     position.add(" Defensive End");//adding player position to position Array
     
     nflPlayer.add("Damien Wilson");//adding player name to nflPlayer Array
     position.add(" SS Linebacker");//adding player position to position Array
     
     nflPlayer.add("Anthony Hitchens");//adding player name to nflPlayer Array
     position.add(" Middle Linebacker");//adding player position to position Array
     
     nflPlayer.add("Jourdan Lewis");//adding player name to nflPlayer Array
     position.add(" Cornerback");//adding player position to position Array
    
     String NFLList = ""; //Stringing the full value of the list
     for (int i = 0; i < nflPlayer.size(); i++) { //setting the loop to read as of the size of nflPlayer Array
         NFLList = NFLList + "The" + position.get(i) + " is " + nflPlayer.get(i) + "\n";  
         //prints one name and positon per line
         System.out.println(NFLList); //Using the array contents to fill in statement.
     }
 }  
    }//End program