/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author user
 */
public class Students
{

   private int id;
   private String name;
   private int part;
   private double cgpa;
   //default constructor
   public Students()
   {
      id = -1;
      name = "";
      part = -1;
      cgpa = -1.0;
   }
   //normal constructor
  public Students(int i,String n, int p, double c)
   {
      id = i;
      name = n;
      part = p;
      cgpa = c;
   }
   
   //setter/mutator method
   public void setStudent(int i,String n, int p, double c)
   {
      id = i;
      name = n;
      part = p;
      cgpa = c;
   }
   
   
   public int getId()
   { return id; }
   

   public String getname()
   { return name; }

   public int getpart()
   { return part; }
   
   public double getcgpa()
   { return cgpa; }
   
   public String toString()
   {
      return ("id : "+ id + "; name : " + name + "; part:  " + part + "; cgpa : " + cgpa) ;
   }
}//end of class
