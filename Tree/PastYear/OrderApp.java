/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class OrderApp {
    public static void main(String[] args){
        
         BSTOrder tree = new BSTOrder ();

         // to input 5 students into the list
         for (int i=0; i<5; i++){
             String nm = JOptionPane.showInputDialog("Enter Name");
             String code = JOptionPane.showInputDialog("Enter Product Code");
             int ord = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity Order"));
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price Unit"));
             

             Order orde = new Order(nm, code, ord, rm);
             tree.insertNode(orde); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();
         
         } // end main 
}
