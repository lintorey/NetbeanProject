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
public class Lecturer {
    private String lecturerName;
    private String facultyName;
    private String phoneNumber;
    
    public Lecturer(){
        lecturerName = " ";
        facultyName = " ";
        phoneNumber = " ";
     }
    
    public Lecturer(String lecturerName, String facultyName, String phoneNumber){
        this.lecturerName = lecturerName;
         this.facultyName = facultyName;
         this.phoneNumber = phoneNumber;
     }
    
     public void setLecturer(String name, String fac, String no){
         lecturerName = name;
         facultyName = fac;
         phoneNumber = no;  
     }

     

     public String getLecturerName(){ 
         return lecturerName; 
     }

     public String getFacultyName(){ 
         return facultyName; 
     }

     public String getPhoneNumber(){ 
         return phoneNumber; 
     }


     public String toString(){ 
         return("\n Lecturer Name:  " + lecturerName + " Faculty Name : " + facultyName + " Phone Number : " + phoneNumber);
     }
}
