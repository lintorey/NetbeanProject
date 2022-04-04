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
public class VehicleApp {
    public static void main(String[] args){
    
        //Queue <String> queue = new LinkedList <String>(); //declare queue
        Queue queueVehicle = new Queue() {}; // original queue
        Queue tempQueue = new Queue(); // temporary queue

         // to input 5 students into the queue
         for (int i=0; i<2; i++){ //access element
             String nm = JOptionPane.showInputDialog("Enter name :");
             String tp = JOptionPane.showInputDialog("Enter Type :");
             String reg = JOptionPane.showInputDialog("Enter Reg No :");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price :"));

             Vehicle vec = new Vehicle(nm, tp, reg, rm);
             queueVehicle.enqueue(vec); //insert data //enqueue (enQ) – adds new element to the end of queue.
         }

         // to display all the students in the queue
             Object data;
             Vehicle V;

             while (!queueVehicle.isEmpty()){
                 ////dequeue (deQ) – removes element from front of queue and returns the data from the removed node.
                 data = queueVehicle.dequeue();//delete first 
                 V = (Vehicle) data;//casting
                 System.out.println(V.toString());//display
                 tempQueue.enqueue(V);//insert data into temporary
             }

             while (!tempQueue.isEmpty()){
                 queueVehicle.enqueue(tempQueue.dequeue());
             }
             
             //QUES i)
             //Find and display how many used cars were registered in the year 2017
             //**Queue tempQueue = new Queue(); // temporary queue
             int countCar = 0;
         
         while (!queueVehicle.isEmpty()){ //access element using while
             data = queueVehicle.dequeue(); // delete from original queue
             V = (Vehicle) data;
             if(V.getVehicleRegistrationDate().substring(5,9).equals("2017")){
                 countCar++;
                 tempQueue.enqueue(data);
             } 
             
             System.out.println("Total Used Car That Register On 201T : "+countCar);
             
         }//while
         
         // display result
         System.out.println("Total Used Car That Register On 2016 : "+countCar);
             
             //QUES ii)
             //Move all Exora cars which priced less than RM170,000.00 into queueExora while the other Exora cars remain in the original queue.
             // to demonstrate some possible operations on data in the queue

             Queue queueExora = new Queue(); // temporary queue
             while (!queueVehicle.isEmpty()){ //access element using while
                 data = queueVehicle.dequeue(); // delete from original queue
                 V = (Vehicle) data;
                 if(V.getVehicleType().equalsIgnoreCase("EXORA")){
                     if(V.getVehiclePrice() < 170000){
                         queueExora.enqueue(V);
                     }
                 }
                 else{
                         tempQueue.enqueue(V); // store to temporary queue

                 }       
            }//while
             
    }//main
}//queueu
