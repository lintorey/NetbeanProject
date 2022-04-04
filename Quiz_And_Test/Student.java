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
public class Student {
    String idUitm;
    String name;
    int part;
    int cgpa;
    
    public Student(){
        idUitm = "";
        name = "";
        part = -1;
        cgpa = -1;
     }

     public Student(String id, String name, int part, int cgpa){
         this.idUitm = id;
         this.name = name;
         this.part = part;
         this.cgpa = cgpa;
     }

     public void setStudent(String id, String n, int p, int c){
         idUitm = id;
         name = n;
         part = p;
         cgpa = c;
     }

     public String getId(){ 
         return idUitm; }

     public String getName(){ 
         return name; }

     public int getPart(){ 
         return part; }

     public int getCgpa(){ 
         return cgpa; }

     public String toString(){ 
         return("Id = " + idUitm + " Name = " + name + " Part = " + part + " Cgpa = " + cgpa);
     }
}
