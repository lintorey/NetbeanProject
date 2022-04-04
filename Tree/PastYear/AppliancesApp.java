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
public class AppliancesApp {
    public static void main(String[] args){
        
         BSTAppliances tree = new BSTAppliances ();

         // to input 5 appliances into the list
         for (int i=0; i<2; i++){
             String nm = JOptionPane.showInputDialog("Enter Name");
             int wa = Integer.parseInt(JOptionPane.showInputDialog("Enter Watt"));

             Appliances app = new Appliances(nm, wa);
             tree.insertNode(app); //insert data
         }
         
         System.out.println("All Appliances : ");
         tree.display();
         System.out.println("\nNumber of Appliances that have power consumption > 1000 : " + tree.countHiPowerApp());
         tree.toString();
        
         } // end main 
}
