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
public class ResearcherApp {
    public static void main(String[] args){
        
         BSTResearcher tree = new BSTResearcher ();

         // to input 5 students into the list
         for (int i=0; i<5; i++){
             
             String nm = JOptionPane.showInputDialog("Enter Name");
             String ins = JOptionPane.showInputDialog("Enter Institution");
             int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
             String fi = JOptionPane.showInputDialog("Enter Field");
             String st = JOptionPane.showInputDialog("Enter Status"); 

             Researcher search = new Researcher(nm, ins, id, fi, st);
             tree.insertNode(search); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();

         } // end main 
}
