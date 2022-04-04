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
public class ClinicApp {
    public static void main(String [] args){
    //Queue <String> queue = new LinkedList <String>(); //declare queue
    Queue patientList = new Queue() {}; // original queue
    Queue tempQueue = new Queue(); // temporary queue

     // to input 5 students into the queue
     for (int i=0; i<2; i++){ //access element
         String id = JOptionPane.showInputDialog("Enter Id :");
         String sick = JOptionPane.showInputDialog("Enter Sickness Type :");
         int type = Integer.parseInt(JOptionPane.showInputDialog("Enter Critical Type :"));
         
         Clinic cli = new Clinic(id,sick,type);
         patientList.enqueue(cli); //insert data //enqueue (enQ) – adds new element to the end of queue.
     }
     
     // to display all the students in the queue
         Object data;
         Clinic C;

         while (!patientList.isEmpty()){
             ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
             data = patientList.dequeue();//delete first 
             C = (Clinic) data;//casting
             System.out.println(C.toString());//display
             tempQueue.enqueue(C);//insert data into temporary
         }

         while (!tempQueue.isEmpty()){
             patientList.enqueue(tempQueue.dequeue());
         }
         
         
         Clinic name = null;
         
         while (!patientList.isEmpty()){ //access element using while
             data = patientList.dequeue(); // delete from original queue
             C = (Clinic) data;
             
            Queue room1 = new Queue(); // new queue
            Queue room2 = new Queue(); // new queue
            Queue room3 = new Queue(); // new queue
             
             if(C.getCriticalType() == 1){
                 room1.enqueue(C);
             }
             if(C.getCriticalType() == 2){
                 room2.enqueue(C);
             }
             if(C.getCriticalType() == 3){
                 room3.enqueue(C);
             }
             
             if(C.getSicknessType().equalsIgnoreCase("FLU")){
                 name = C;
                 tempQueue.enqueue(data); // store to temporary queue
             }
             
         }//while
         
         // display result
         System.out.print("\nPATIENT WITH FLU");
         System.out.println(name.toString());
         
         // restore all data from temporary queue to original queue
            while (!tempQueue.isEmpty()){
                 patientList.enqueue(tempQueue.dequeue());
            }
     
    }//main
}
