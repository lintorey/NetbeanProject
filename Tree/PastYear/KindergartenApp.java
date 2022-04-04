/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class KindergartenApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         BSTKindergarten tree = new BSTKindergarten ();

         // to input 20 student into the list
         for (int i=0; i<5; i++){
             
             String nm = JOptionPane.showInputDialog("Enter Name");
             char gen = JOptionPane.showInputDialog("Enter Gender").charAt(0);
             int old = Integer.parseInt(JOptionPane.showInputDialog("Enter Age"));
             String name = JOptionPane.showInputDialog("Enter Class Name");
             String teach = JOptionPane.showInputDialog("Enter Teacher");

             Kindergarten kids = new Kindergarten(nm, gen, old, name, teach);
             tree.insertNode(kids); //insert data
         }
         
         System.out.println("All Items : ");
         tree.display();
         tree.countGender('M');
         String cname = sc.nextLine();
         tree.displayChildren(cname);

         } // end main 
}
