/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class StudentApp {
    public static void main(String [] args) {

     LinkedList StudentLL = new LinkedList();
         // to input 20 students into the list
         for (int i=0; i<20; i++){ 
             String id = JOptionPane.showInputDialog("Enter student id");
             String n = JOptionPane.showInputDialog("Enter name");
             int p = Integer.parseInt(JOptionPane.showInputDialog("Enter part"));
             int c = Integer.parseInt(JOptionPane.showInputDialog("Enter cgpa"));
             
             Student stud = new Student(id,n,p,c);
             StudentLL.insertAtFront(stud); // OR theList.insertAtBack(stud); }

             // to display all students in the linked list
             System.out.println("LIST OF STUDENTS:");
             Student S = null;
             Object data = StudentLL.getFirst();

             while (data != null){ 
                 S = (Student) data;
                 System.out.println(S.toString());
                 data = StudentLL.getNext();
             } // while

            // to find the best student
            // to count the number of students in part 5
             // to count the number of students who reach cgpa 3.0
             int scorer = 0;
             int part5 = 0;
             Student NewStudent = new Student();
             data = StudentLL.getFirst();
             while (data != null){ 
                 double cg = 0.0;
                 S = (Student) data;

                 if (S.getCgpa() > cg){ 
                     cg = S.getCgpa();
                     NewStudent = S; 
                 }
                 if ( S.getPart() == 5){
                 part5++;
                 }
                 if (S.getCgpa() > 3.00){
                 scorer++;
                 data = StudentLL.getNext();
                 } 
                 
                 
            }// while

             System.out.println("The best student is :");
             System.out.println(NewStudent.toString());
             System.out.println("There are " + part5 + " part 5 students");
             System.out.println("There are " + scorer + "students who score 3.0 and above");

             // to delete a student
             data = StudentLL.removeFromFront(); // OR data = theList.removeFromBack();
             if (data != null){ 
                 S = (Student) data; 
                 if(data!=null)
                 System.out.println("DATA DELETED");
                 System.out.println(S.toString()); 
             }
                 else
                 System.out.println("CANNOT DELETE - LIST EMPTY");
            }
         } // main
}
