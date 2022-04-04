/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

/**
 *
 * @author user
 */
public class Bowling {

    String name;
    int playerID;
    int score;
    String status;
     
     public Bowling(){
        name = " ";
        playerID = 0;
        score = 0;
        status = " ";
     }

     public Bowling(String name, int playerID, int score, String status){
        this.name = name;
        this.playerID = playerID;
        this.score = score;
        this.status = status;
     }

     public void setBowling(String nm, int id, int sc, String st){
        name = nm;
        playerID = id;
        score = sc;
        status = st;
     }

     public String getName(){ 
         return name; 
     }

     public int getPlayerID(){ 
         return playerID; 
     }
     
     public int getScore(){ 
         return score; 
     }
     
     public String getStatus(){ 
         return status; 
     }


     public String toString(){ 
         return("\nName : " + name + "\nPlayer ID : " + playerID + "\nScore : " + score + "\nStatus : " + status);
     }
}
