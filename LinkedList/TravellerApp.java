 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TravellerApp {
    public static void main(String [] args) {

     LinkedList travellerList = new LinkedList();
         // to input 30 traveller into the list
         for (int i=0; i<30; i++){ 
            String nm = JOptionPane.showInputDialog("Enter Traveller Name : ");
            int code = Integer.parseInt(JOptionPane.showInputDialog("Enter Package Code: "));
            String em = JOptionPane.showInputDialog("Enter Email : ");
            int no = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Participant : "));
            double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Package Price : "));

            Traveller travel = new Traveller(nm,code,em,no,rm);
            travellerList.insertAtFront(travel); // OR theList.insertAtBack(stud); }
            
        }//for    
            // to display all traveller in the linked list
            System.out.println("LIST OF TRAVELLER:");
            Traveller T = null;
            Object data = travellerList.getFirst();
         
         
         double newPrice = 0.0;
         //Traveller T = (Traveller) travellerList.getFirst();
         while(T != null){ //stopping case
             if(T.getNumOfParticipants()>20){
                 newPrice = T.getPackagePrice()*0.95;
                 newPrice = T.getPackagePrice();
                 System.out.println(T.toString());
             }
             
             T = (Traveller)travellerList.getNext(); //utk masuk data seterusnya
             
             int total = 0;
             Traveller st = (Traveller) travellerList.getFirst();
             
             while(st != null){
                 if(st.getPackageCode() == 1){
                     
                     st = (Traveller)travellerList.getNext();
                     total = total + st.getNumOfParticipants();
                     
                 }
             }
             
             System.out.println("Total number of participant for VIP is : " + total);
         }
    }//main
}//travellerapp
