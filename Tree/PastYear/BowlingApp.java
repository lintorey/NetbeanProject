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
public class BowlingApp {
    public static void main(String[] args){
        
         BSTBowling tree = new BSTBowling ();

         // to input 5 bowling into the list
         for (int i=0; i<5; i++){
             String nm = JOptionPane.showInputDialog("Enter Item Name");
             int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
             int sc = Integer.parseInt(JOptionPane.showInputDialog("Enter Score"));
             String st = JOptionPane.showInputDialog("Enter Status");

             Bowling bow = new Bowling(nm, id, sc, st);
             tree.insertNode(bow); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();
         System.out.println ( "\nPost order traversal :" );
         tree.postorderTraversal();
         } // end main 
}
