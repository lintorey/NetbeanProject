/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;
 //PASTYEAR - SEP2014 PART B Q3
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class NokiaApp {
    public static void main(String [] args){
        //Queue <String> queue = new LinkedList <String>(); //declare queue
        Queue branchQ = new Queue() {}; // original queueing>(); //declare queue     
        Queue tempQueue = new Queue(); // temporary queue
        
        
        Queue northQ = new Queue() {}; // new queue
        Queue southQ = new Queue() {}; // new queue
        Queue centerQ = new Queue() {}; // new queue

         // to input 5 kedai nokia into the queue
         for (int i=0; i<2; i++){ //access element
             String n = JOptionPane.showInputDialog("Enter Manager Name :");
             int dept = Integer.parseInt(JOptionPane.showInputDialog("Enter No Of Department :"));
             String loc = JOptionPane.showInputDialog("Enter Location :");
             int num = Integer.parseInt(JOptionPane.showInputDialog("Enter No Of Worker :"));

             NokiaBranches nokia = new NokiaBranches(n, dept, loc, num);
             branchQ.enqueue(nokia); //insert data //enqueue (enQ) – adds new element to the end of queue.
         }
         
         // to display all the students in the queue
         Object data;
         NokiaBranches N;

         while (!branchQ.isEmpty()){
             ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
             data = branchQ.dequeue();//delete first 
             N = (NokiaBranches) data;//casting
             System.out.println(N.toString());//display
             tempQueue.enqueue(N);//insert data into temporary
         }

         while (!tempQueue.isEmpty()){
             branchQ.enqueue(tempQueue.dequeue());
         }
         
         String name = " ";
         //NokiaBranches manager = null;
         
         while (!branchQ.isEmpty()){ //access element using while
             data = branchQ.dequeue(); // delete from original queue
             N = (NokiaBranches) data;
             
             
             if(N.getLocation().equals("PERLIS") || N.getLocation().equals("KEDAH") || N.getLocation().equals("PENANG")){
                 northQ.enqueue(N);
             }
             if(N.getLocation().equals("JOHOR") || N.getLocation().equals("MELAKA") || N.getLocation().equals("NEGERI SEMBILAN")){
                 southQ.enqueue(N);
             }
             if(N.getLocation().equals("KUALA LUMPUR") || N.getLocation().equals("SELANGOR")){
                 centerQ.enqueue(N);
             }
             
             
             if(N.getLocation().equals("JOHOR")){
                 if(N.getNo_Of_Worker() < 20){
                     name = N.getManagerName();
                     //manager = N;
                     //System.out.print("Manager Name : " + name);
                     tempQueue.enqueue(data); // store to temporary queue
                 }
             }
             
         }//while
         
         // display result
         System.out.print("\nManager Name Based In JOHOR : "+name);
         //System.out.println(manager.toString());
         
         // restore all data from temporary queue to original queue
            while (!tempQueue.isEmpty()){
                 branchQ.enqueue(tempQueue.dequeue());
            }
    }
}
