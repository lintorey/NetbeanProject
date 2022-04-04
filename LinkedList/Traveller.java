/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author user
 */
public class Traveller {
    private String Name;
    private int packageCode;
    private String email;
    private int numofParticipants;
    private double packagePrice;
    
    public Traveller(){
        Name = " ";
        packageCode = 0;
        email = " ";
        numofParticipants = 0;
        packagePrice = 0.0;
     }
    
    public Traveller(String Name, int packageCode, String email, int numofParticipants, double packagePrice){
        this.Name = Name;
        this.packageCode = packageCode;
        this.email = email;
        this.numofParticipants = numofParticipants;
        this.packagePrice = packagePrice;
     }

    
     public void setTraveller(String nm, int code, String em, int no, double rm){
        Name = nm;
        packageCode = code;
        email = em;
        numofParticipants = no;
        packagePrice = rm;
     }


     public String getName(){ 
        return Name; 
     }

     public int getPackageCode(){ 
        return packageCode; 
     }

     public String getEmail(){ 
        return email; 
     }
     public int getNumOfParticipants(){
         return numofParticipants;
     }
     public double getPackagePrice(){
         return packagePrice;
     }   

     public String toString(){ 
        return("\n Traveller Name:  " + Name + " Package Code : " + packageCode + " Email : " + email + "No Of Participant :  " + numofParticipants + " Package Price : RM  " + packagePrice);
     }
}
