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
public class Alumni {

    String alumniName;
    String occupation;
    int yearGrad;
    double amtDonation;
     
     public Alumni(){
        String alumniName;
        String occupation;
        int yearGrad;
        double amtDonation;
     }

     public Alumni(String alumniName, String occupation, int yearGrad, double amtDonation){
        this.alumniName = alumniName;
        this.occupation = occupation;
        this.yearGrad = yearGrad;
        this.amtDonation = amtDonation;
     }

     public void setAlumni(String nm, String occ, int year, double rm){
         this.alumniName = nm;
         this.occupation = occ;
         this.yearGrad = year;
         this.amtDonation = rm;
     }

     public String getAlumniName (){ 
         return alumniName ; 
     }

     public String getOccupation(){ 
         return occupation; 
     }
     
     public int getYearGrad(){ 
         return yearGrad; 
     }
     
     public double getAmtDonation(){ 
         return amtDonation; 
     }


     public String toString(){ 
         return("\nAlumni Name : " + alumniName + "\nOccupation : " + occupation + "\nYear Grad : " + yearGrad + "\nAmount Donation : RM  " + amtDonation);
     }
}
