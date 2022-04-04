/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class KetupatApp {
    public static void main(String [] args){
        //Queue <String> queue = new LinkedList <String>(); //declare queue
        Queue QueueKetupat = new Queue() {}; // original queueing>(); //declare queue     
        Queue QueueBig = new Queue(); // temporary queue

         // to input 5 ketupat raya into the queue
         for (int i=0; i<2; i++){ //access element
             String tp = JOptionPane.showInputDialog("Enter Type :");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price :"));
             double kg = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight :"));

             Ketupat ket = new Ketupat(tp,rm,kg);
             QueueKetupat.enqueue(ket); //insert data //enqueue (enQ) – adds new element to the end of queue.
         }
         
         // to display all the ketupat in the queue
         Object data;
         Ketupat K;

         while (!QueueKetupat.isEmpty()){//check list empty or not
             ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
             data = QueueKetupat.dequeue();//delete first 
             K = (Ketupat) data;//casting
             System.out.println(K.toString());//display
             QueueBig.enqueue(K);//insert data into temporary
         }

         while (!QueueBig.isEmpty()){
             QueueKetupat.enqueue(QueueBig.dequeue());
         }
         
         //move weight > 500 to queue big
         while (!QueueKetupat.isEmpty()){ //access element using while
         data = QueueKetupat.dequeue(); // delete from original queue
         K = (Ketupat) data;
         
             if(K.getType().equalsIgnoreCase("Ketupat Nasi")){
                 if(K.getWeight()>= 500){
                     QueueBig.enqueue(K);
                     }
             }
             else{
                  QueueKetupat.enqueue(K);
             }
         }
         
         //cal n display total price
         int count = 0;
         while (!QueueKetupat.isEmpty()){ //access element using while
         data = QueueKetupat.dequeue(); // delete from original queue
         K = (Ketupat) data;
         
             if(K.getType().equalsIgnoreCase("Ketupat")){
                     QueueKetupat.enqueue(K);
                     count++;
                     System.out.print("\nTotal Price Each Type Ketupat : RM " +count);
             }
         }
             
     }
    
}
