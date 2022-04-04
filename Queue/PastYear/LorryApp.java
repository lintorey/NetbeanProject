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
public class LorryApp {
    public static void main(String [] args){
        //Queue <String> queue = new LinkedList <String>(); //declare queue
        Queue lorryQueue = new Queue() {}; // original queueing>(); //declare queue     
        Queue tempQueue = new Queue(); // temporary queue

         // to input 30 lorries into the queue
         for (int i=0; i<2; i++){ //access element
             String no = JOptionPane.showInputDialog("Enter Reg No :");
             String date = JOptionPane.showInputDialog("Enter Date Reg :");
             String nm = JOptionPane.showInputDialog("Enter Owner :");
             String st = JOptionPane.showInputDialog("Enter State Reg :");

             Lorry lor = new Lorry(no, date, nm, st);
             lorryQueue.enqueue(lor); //insert data //enqueue (enQ) – adds new element to the end of queue.
         }
         
         // to display all the students in the queue
         Object data;
         Lorry L;

         while (!lorryQueue.isEmpty()){
             ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
             data = lorryQueue.dequeue();//delete first 
             L = (Lorry) data;//casting
             System.out.println(L.toString());//display
             tempQueue.enqueue(L);//insert data into temporary
         }

         while (!tempQueue.isEmpty()){
             lorryQueue.enqueue(tempQueue.dequeue());
         }
         
         //question 5a
         int countLor = 0;
         
         while (!lorryQueue.isEmpty()){ //access element using while
             data = lorryQueue.dequeue(); // delete from original queue
             L = (Lorry) data;
             if(L.getDateReg().substring(5,9).equals("2016")){
                 countLor++;
                 tempQueue.enqueue(data);
             } 
             
             System.out.println("Total Lorry That Register On 2016 : "+countLor);
             
         }//while
         
         // display result
         System.out.println("Total Lorry That Register On 2016 : "+countLor);
         
        // restore all data from temporary queue to original queue
        while (!tempQueue.isEmpty()){
             lorryQueue.enqueue(tempQueue.dequeue());
        }
    }
}
