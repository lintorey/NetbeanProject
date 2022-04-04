/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author user
 */

import javax.swing.JOptionPane;
public class QueueApp2{
    
    public static void main(String [] args){
    //Queue <String> queue = new LinkedList <String>(); //declare queue
    Queue theQueue = new Queue() {}; // original queue
    Queue tempQueue = new Queue(); // temporary queue

     // to input 5 students into the queue
     for (int i=0; i<2; i++){ //access element
         String sIdStd = JOptionPane.showInputDialog("Enter student id :");
         String nameStd = JOptionPane.showInputDialog("Enter name :");
         String sPart = JOptionPane.showInputDialog("Enter part :");
         String sCgpa = JOptionPane.showInputDialog("Enter cgpa :");
         int iIdStd = Integer.parseInt(sIdStd);
         int iPart = Integer.parseInt(sPart);
         double dCgpa = Double.parseDouble(sCgpa);
         
         Student stud = new Student(iIdStd, nameStd, iPart, dCgpa);
         theQueue.enqueue(stud); //insert data //enqueue (enQ) – adds new element to the end of queue.
     }


    // to display all the students in the queue
     Object data;
     Student S;

     while (!theQueue.isEmpty()){
         ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
         data = theQueue.dequeue();//delete first 
         S = (Student) data;//casting
         System.out.println(S.toString());//display
         tempQueue.enqueue(S);//insert data into temporary
     }

     while (!tempQueue.isEmpty()){
         theQueue.enqueue(tempQueue.dequeue());
     }

     // to demonstrate some possible operations on data in the queue
     double max = -99999.99, min = 9999.99;
     int part4 = 0, dList = 0, prob = 0;
     Student bestStudent = null;
     Student weakStudent = null;

     while (!theQueue.isEmpty()){ //access element using while
         data = theQueue.dequeue(); // delete from original queue
         S = (Student) data;

     if (S.getCgpa() > max){ // find maximum cgp
        max = S.getCgpa();
        bestStudent = S; // marked the best student
     }

     if (S.getCgpa() < min){ // find minimum cgpa
        min = S.getCgpa();
        weakStudent = S;
     }

     if (S.getCgpa() > 3.5) // count dean's list student
        dList++;

     if (S.getPart() == 4) // count part 4 student
         part4++;

     if (S.getCgpa() < 1.8) // count probation student
         prob++;
         tempQueue.enqueue(data); // store to temporary queue
     }

     // display result
     System.out.println("\nThe highest cgpa : " + max);
     System.out.println("The lowest cgpa : " + min);
     System.out.println("The number of dean's list student : " + dList);
     System.out.println("The number of part 4 student : " + part4);
     System.out.println("The number of probation student :  " + prob);
     System.out.println("\nBEST STUDENT:");
     System.out.println(bestStudent.toString());
     
     // restore all data from temporary queue to original queue
    while (!tempQueue.isEmpty()){
         theQueue.enqueue(tempQueue.dequeue());
    }

  } // main
} // QueueApp

