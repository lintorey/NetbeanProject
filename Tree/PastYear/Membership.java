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
public class Membership {
    private String memberID;
    private String name;
    private int age;
    private int weight;
    private int height;
    private String membershipType;
     
     public Membership(){
        memberID = " ";
        name = " ";
        age = 0;
        weight = 0;
        height = 0;
        membershipType = " ";
     }

     public Membership(String memberID, String name, int age, int weight, int height, String membershipType){
         this.memberID = memberID;
         this.name = name;
         this.age = age;
         this.weight = weight;
         this.height = height;
         this.membershipType = membershipType;
     }

     public void setMembership(String id, String nm, int old, int kg, int cm, String type){
         memberID = id;
         name = nm;
         age = old;
         weight = kg;
         height = cm;
         membershipType = type;
     }
     
     public String getMemberID(){ 
         return memberID; 
     }
     
     public String getName(){ 
         return name; 
     }

     public int getAge(){ 
         return age; 
     }
     
     public int getWeight(){ 
         return weight; 
     }
     
     public int getHeight(){ 
         return height; 
     }
     
     public String getMembershipType(){ 
         return membershipType;
     }
     
     public double caculateBMI(){
         height = height / 100;
         double BMI = weight / height;
         
         if (BMI <= 18.5){
             System.out.println("LOWER BMI");
         }
         
         if (BMI >= 20){
             System.out.println("UPPER BMI");
         }
         return BMI;
     }
     
     public String toString(){ 
         return("\nMember ID : " + memberID + "\nName : " + name + "\nAge : " + age + "\nWeight :  " + weight + "\nHeight : " + height + "\nMembership Type : " + membershipType);
     }
}
