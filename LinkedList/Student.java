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
public class Student{
    private int id;
    private String name;
    private int part;
    private double cgpa;
    
    public Student(){
        id = -1;
        name = "";
        part = -1;
        cgpa = -1.0;
     }

     public Student(int id, String name, int part, double cgpa){
         this.id = id;
         this.name = name;
         this.part = part;
         this.cgpa = cgpa;
     }

    Student(String nm, String or, String ve, double rm, boolean st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public void setStudent(int i, String n, int p, double c){
         id = i;
         name = n;
         part = p;
         cgpa = c;
     }

     public int getId(){ 
         return id; }

     public String getName(){ 
         return name; }

     public int getPart(){ 
         return part; }

     public double getCgpa(){ 
         return cgpa; }

     public String toString(){ 
         return("Id = " + id + " Name = " + name + " Part = " + part + " Cgpa = " + cgpa);
     }
} 
