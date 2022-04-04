/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BSTApp {
    public static void main(String[] args){
        
         BSTree tree = new BSTree ();

         // to input 5 students into the list
         for (int i=0; i<5; i++){
             String sIdStd = JOptionPane.showInputDialog("Enter student id");
             String nameStd = JOptionPane.showInputDialog("Enter name");
             String sPart = JOptionPane.showInputDialog("Enter part");
             String sCgpa = JOptionPane.showInputDialog("Enter cgpa");
             int iIdStd = Integer.parseInt(sIdStd);
             int iPart = Integer.parseInt(sPart);
             double dCgpa = Double.parseDouble(sCgpa);
             Student stud = new Student(iIdStd, nameStd, iPart, dCgpa);
             tree.insertNode(stud); //insert data
         }
         
         System.out.println("All students : ");
         tree.display();
         System.out.println("\nNumber of student from part 4 :"+ tree.countStudPart4());
         System.out.println ("\nNumber of student who got dean list : " + tree.countStudC3());
         tree.printcat();
         System.out.println ( "\nPre order traversal :" );
         tree.preorderTraversal();
         System.out.println ( "\nIn order traversal :" );
         tree.inorderTraversal();
         System.out.println ( "\nPost order traversal :" );
         tree.postorderTraversal();
         System.out.println ( "\nDecending order :" );
         tree.descending();
         } // end main 
}
