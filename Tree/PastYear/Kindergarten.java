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
public class Kindergarten {
    private String name;
    private char gender;
    private int age;
    private String className;
    private String teacher;
     
     public Kindergarten(){
        name = " ";
        gender = ' ';
        age = 0;
        className = " ";
        teacher = " ";
     }

     public Kindergarten(String name, char gender, int age, String className, String teacher){
         this.name = name;
         this.gender = gender;
         this.age = age;
         this.className = className;
         this.teacher = teacher;
     }

     public void setKindergarten(String nm, char gen, int old, String name, String teach){
         name = nm;
         gender = gen;
         age = old;
         className = name;
         teacher = teach;
     }

     public String getName(){ 
         return name; 
     }

     public char getGender(){ 
         return gender; 
     }
     
     public int getAge(){ 
         return age; 
     }
     
     public String getClassName(){ 
         return className; 
     }
     
     public String getTeacher(){ 
         return teacher;
     }

     

     public String toString(){ 
         return("\nName : " + name + "\nGender : " + gender + "\nAge : " + age + "\nClass Name :  " + className + "\nTeacher : " + teacher);
     }
}
