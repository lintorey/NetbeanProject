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
public class CarApp {
    public static void main(String [] args) {
        
        LinkedList carList = new LinkedList();
        
        // insert 30 car
        for (int i=0; i<30; i++){ 
             String no = JOptionPane.showInputDialog("Enter Registeration Number : ");
             String nm = JOptionPane.showInputDialog("Enter Manufacture : ");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price : "));
             int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year Purchase : "));

             Car cars = new Car(no,nm,rm,year);
             carList.insertAtFront(cars); // OR theList.insertAtBack(lect); }

             // to display all car in the linked list
             System.out.println("LIST OF CAR : ");
             Car C = null;
             Object data = carList.getFirst();
             
             while (data != null){ 
                 C = (Car) data;
                 System.out.println(C.toString());
                 data = carList.getNext();
             } // while
             
             //calc & display total price Proton
             int totalprice = 0;
             Car newProton = new Car();
             data = carList.getFirst();
             while (data != null){ 
                 C = (Car) data;
                 if("Proton".equals(C.getManufacturer())){
                     data = carList.getNext();
                     
                     System.out.println("Total Price Proton : RM  " + data);
                 } 
             }
             
             //car been purchase 2020 give 15% discount, calc new price each car & update old price to new
             double newPrice = 0;
             double price = 0;
             double price2 = 0;
             int yearPurchase = 0;
             
             if(yearPurchase == 2020){
                double dis = 0.15;
                price2 = price * dis;
                newPrice = price2 - dis;
                
                System.out.println("New Price After Discount : RM " + newPrice);
             }
        }
        
        
    }

     
     
}
