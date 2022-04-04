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
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class StudentArrayList
{
   public static void main(String[] args)
   {
      //i.	Declare studentList and Create ArrayList 
      ArrayList studentList =  new ArrayList();
      
      //ii.	Insert/input data into ArrayList
      for (int i=1; i<2;i++)
      {
        
         String id = JOptionPane.showInputDialog("enter id " );
         String name = JOptionPane.showInputDialog("enter name " );
         String part = JOptionPane.showInputDialog("enter part " );
         String cgpa = JOptionPane.showInputDialog("enter cgpa " );
         
         int ids = Integer.parseInt(id);
         int ps = Integer.parseInt(part);
         double cs = Double.parseDouble(cgpa);

         Students st = new Students(ids,name,ps,cs);
         studentList.add(st);
        
      }//end of for
      
      //iii.	Display all element in Arraylist
      System.out.println(studentList);
      
      for (int i=0; i<studentList.size();i++)
      {
         Student S =  (Student) studentList.get(i);
         System.out.println(S.toString());
      }
      
      int ind = 0;
      double cg = 0.0;
      int countpart4 = 0, countdl = 0;
      
      for (int i=0; i<studentList.size();i++)
      {
         Student S =  (Student) studentList.get(i);
         
         if(S.getcgpa() > cg)
         {
            cg = S.getcgpa();
            ind = i;
         
         }
         
         if(S.getpart()== 4)
            countpart4++;
      

      }//end of for
      
      System.out.println("Nama pelajar DL :");
      System.out.println("-----------------");
      for(int j = 0; j< studentList.size();j++)
      {
         Student SS = (Student) studentList.get(j);
         
         if (SS.getcgpa() > 3.5)
         {
            countdl++;
            System.out.println(SS.getname());
         }
      }//end of for
      System.out.println("-----------------");
      System.out.println();
 
      
      Student S =  (Student) studentList.get(ind);
      System.out.println("The best Student is :" + S.toString());
      System.out.println("The best Student is :" +  S.getname() + " with mark " +  S.getcgpa());
      
      System.out.println("No of part 4 Student :" + countpart4 +  " person");
      System.out.println("No of dean's list Student :" + countpart4 +  " person");

      System.out.println("Nama pelajar Dissmiss :");
      System.out.println("-----------------");

       for(int x = 0; x< studentList.size();x++)
       {
         Student r = (Student) studentList.get(x);
         
         if (r.getcgpa() < 2.0 && r.getpart() == 1)
         {
            studentList.remove(x);
            x--;
            System.out.println(r.getname());
         }
      }//end of for
       System.out.println("-----------------");
       
      System.out.println(studentList);

   }//end of main

}//end of Class
