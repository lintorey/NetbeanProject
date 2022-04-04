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
public class WarApp {
    public static void main(String[] args){
        
         BSTWar tree = new BSTWar ();

         // to input 5 appliances into the list
         for (int i=0; i<2; i++){
             String nm = JOptionPane.showInputDialog("Enter War Name");
             String cm = JOptionPane.showInputDialog("Enter Commander");
             int ye = Integer.parseInt(JOptionPane.showInputDialog("Enter Commander"));
             int no =Integer.parseInt(JOptionPane.showInputDialog("Enter Commander"));

             War wa = new War(nm,cm,ye,no);
             tree.insertNode(wa); //insert data
         }
         
         System.out.println("All Appliances : ");
         tree.display();
        // System.out.println("\nnumber of wars commanded by Khalid AlWalid : " + tree.countWarByKhalidAlWalid());
         tree.toString();
        
         } // end main 
}
