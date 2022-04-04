/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class War {
    String warName;
    String Commander;
    int year; // year the war happened
    int numberOfSoldiers;
   
     
    public War(){
         warName = "";
         Commander = "";
         year = 0;
         numberOfSoldiers = 0;
    }

    public War(String name, String Commander, int year, int numberOfSoldiers){
        this.warName = name;
        this.Commander = Commander;
        this.year = year;
        this.numberOfSoldiers = numberOfSoldiers;
    }

    public void setWar(String nm, String cm, int ye, int no){
         warName = nm;
         Commander = cm;
         year = ye;
         numberOfSoldiers = no;
    }
    
    public String getWarName(){ 
         return warName; 
    }
     
    public String getCommander(){ 
         return Commander; 
    }
    public int getYear(){ 
         return year; 
    }
    public int getNumberOfSoldiers(){ 
         return numberOfSoldiers; 
    }

    public String toString(){ 
         return("\nName : " + warName + "\nCommander : " + Commander + "\nYear : " + year + "\nNumberOfSoldiers : " + numberOfSoldiers);
    }
}
