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
public class EmployeeApp {
    public static void main(String[] args){
         BSTEmployee tree = new BSTEmployee ();

         // to input 5 employee into the list
         for (int i=0; i<5; i++){
             String id = JOptionPane.showInputDialog("Enter ID");
             String nm = JOptionPane.showInputDialog("Enter Name");
             String st = JOptionPane.showInputDialog("Enter Status");
             String pos = JOptionPane.showInputDialog("Enter Position");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary : RM"));

             Employee emp = new Employee(id, nm, st, pos, rm);
             tree.insertNode(emp); //insert data
         }
         
         System.out.println("All Employee : ");
         tree.display();
         System.out.println("\nMaritial Status : " + tree.toString());
         System.out.println ("\nAverage Salary Of All Employee : " + tree.toString());
         } // end main 
}
