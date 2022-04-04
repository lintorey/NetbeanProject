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
public class ItemApp {
    public static void main(String[] args){
        
         BSTItem tree = new BSTItem ();

         // to input 5 items into the list
         for (int i=0; i<5; i++){
             int no = Integer.parseInt(JOptionPane.showInputDialog("Enter Serial Number"));
             String it = JOptionPane.showInputDialog("Enter Item Name");
             String di = JOptionPane.showInputDialog("Enter Distribution Name");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price Unit"));
             int qu = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity"));

             Item items = new Item(no, it, di, rm, qu);
             tree.insertNode(items); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();
         //System.out.println ("\nTotal Price All Item : " + tree.calcTotalPrice(dN));
         //System.out.println("\nSearch Item :"+ tree.searchItem(iN));
         } // end main 
}
