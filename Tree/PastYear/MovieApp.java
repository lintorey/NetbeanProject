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
public class MovieApp {
    public static void main(String[] args){
        
         BSTMovie tree = new  BSTMovie ();

         // to input 5 students into the list
         for (int i=0; i<5; i++){
             
             int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
             String mt = JOptionPane.showInputDialog("Enter Movie Title");
             String di = JOptionPane.showInputDialog("Enter Director");
             String ge = JOptionPane.showInputDialog("Enter Genre");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Total Collection")); 

             Movie mov = new Movie(id, mt, di, ge, rm);
             tree.insertNode(mov); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();

         } // end main 
}
