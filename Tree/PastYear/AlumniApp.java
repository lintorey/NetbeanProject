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
public class AlumniApp {
    public static void main(String[] args){
        
         BSTAlumni tree = new BSTAlumni ();

         // to input 5 alumni into the list
         for (int i=0; i<5; i++){
             String nm = JOptionPane.showInputDialog("Enter Alumni Name");
             String occ = JOptionPane.showInputDialog("Enter Occupation");
             int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year Grad"));
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount Donation"));

             Alumni alm = new Alumni(nm, occ, year, rm);
             tree.insertNode(alm); //insert data
         }
         
         System.out.println("All students : ");
         tree.display();
         //System.out.println("\nNumber of student from part 4 :"+ tree.countStudPart4());
         //System.out.println ("\nNumber of student who got dean list : " + tree.countStudC3());
         } // end main 
}
