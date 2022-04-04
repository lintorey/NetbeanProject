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
public class Appliances {
    public String name;
    public int watt;
   
     
    public Appliances(){
         name = "";
         watt = 0;
    }

    public Appliances(String name, int watt){
        this.name = name;
        this.watt = watt;
    }

    public void setAppliances(String nm, int wa){
         name = nm;
         watt = wa;
    }
    
    public String getName(){ 
         return name; 
    }
     
    public int getWatt(){ 
         return watt; 
    }

    public String toString(){ 
         return("\nName : " + name + "\nWatt : " + watt );
    }
}
