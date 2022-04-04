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
public class MembershipApp {
    public static void main(String[] args){
        
         BSTMembership tree = new BSTMembership ();

         // to input 5 students into the list
         for (int i=0; i<5; i++){
             String id = JOptionPane.showInputDialog("Member ID");
             String nm = JOptionPane.showInputDialog("Enter Name");
             int old = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
             int kg = Integer.parseInt(JOptionPane.showInputDialog("Enter Weight"));
             int cm = Integer.parseInt(JOptionPane.showInputDialog("Enter Height"));
             String type = JOptionPane.showInputDialog("Enter Membership Type");

             Membership mem = new Membership(id, nm, old, kg, cm, type);
             tree.insertNode(mem); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();
         
         } // end main 
}
