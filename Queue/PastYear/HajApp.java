/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

import javax.swing.JOptionPane;

/**
 *
 * @author lintorey
 */
public class HajApp {
    public static void main(String [] args){
        //Queue <String> queue = new LinkedList <String>(); //declare queue
        Queue qapplicant = new Queue() {}; // original queueing>(); //declare queue     
        Queue greserve = new Queue(); // temporary queue

         // to input 5 haji into the queue
         for (int i=0; i<2; i++){ //access element
             String nm = JOptionPane.showInputDialog("Enter  Name :");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Money :"));
             int old = Integer.parseInt(JOptionPane.showInputDialog("Enter Age :"));
             boolean st = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter First Haj? [TRUE] or [FALSE]:"));

             HajApplicant haj = new HajApplicant(nm, rm, old, st);
             qapplicant.enqueue(haj); //insert data //enqueue (enQ) – adds new element to the end of queue.
         }
         
         // to display all the students in the queue
         Object data;
         HajApplicant H;

         while (!qapplicant.isEmpty()){//check list empty or not
             ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
             data = qapplicant.dequeue();//delete first 
             H = (HajApplicant) data;//casting
             System.out.println(H.toString());//display
             greserve.enqueue(H);//insert data into temporary
         }

         while (!greserve.isEmpty()){
             qapplicant.enqueue(greserve.dequeue());
         }
         
         // to demonstrate some possible operations on data in the queue
         String name = " ";
         int count = 0;
         HajApplicant success = null;
         
         
         while (!qapplicant.isEmpty()){ //access element using while
         data = qapplicant.dequeue(); // delete from original queue
         H = (HajApplicant) data;
         
         if(H.getAge() >= 50){
             if(H.getMoney() >= 9500){
                 if(H.getFirstHaj() == true){
                     name = H.getName();
                     success = H;
                     count++;
                     //System.out.print("\nHaj Name : " + name);
                     System.out.print("\nNo Of Succesful Haj Applicants : " +count);
                 }
             }
         }
         else{
                 if(H.getMoney() >= 9500){
                     if(H.getFirstHaj() == true){
                         //name1 = H.getName();
                         //System.out.println("\nHaj Name : " + name1);
                         greserve.enqueue(data); // store to temporary queue
                         
                     }
                 }
         }
        }//while
         
         // display result
         System.out.println("\nThe Successful Qualified : " + name);
         System.out.println("\nSUCCESSFUL APPLICANT:");
         System.out.println(success.toString());

         // restore all data from temporary queue to original queue
        while (!greserve.isEmpty()){
             qapplicant.enqueue(greserve.dequeue());
        }
    }
}
