/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SUKSISAPP {
    public static void main(String [] args) {

     LinkedList studentList = new LinkedList();
         // to input 5 students into the list
         for (int i=0; i<2; i++){ 
             String nm = JOptionPane.showInputDialog("Enter Name : ");
             char gen = JOptionPane.showInputDialog("Enter Gender [F]emale Or [M]ale : ").charAt(0);
             double kg = Double.parseDouble(JOptionPane.showInputDialog("Enter Weight : "));
             double cm = Double.parseDouble(JOptionPane.showInputDialog("Enter Height : "));
             SUKSIS suk = new SUKSIS(nm,gen,kg,cm);
             studentList.insertAtFront(suk); // OR theList.insertAtBack(stud); }
             
         }
             // to display all suksis in the linked list
             System.out.println("LIST OF SUKSIS:");
             SUKSIS S = null;
             Object data = studentList.getFirst();
             
             int countFemale = 0;
             while (data != null){ 
                 S = (SUKSIS) data;
                 System.out.println(S.toString());
                 data = studentList.getNext();
                 
                 //display no female not qualified join
                 
                 if (S.getQualified() == false){
                     countFemale++;
                 } //if
             System.out.println("Number Of Female Student : " + countFemale);

             } // while
             
            //remove qualified student from studentList and move to a new LinkedList(juniorSquad)
            LinkedList juniorSquad = new LinkedList();
            data = studentList.removeFromFront();
             while (data != null){ 
                S = (SUKSIS) data;
                if (S.getQualified() == false){
                    juniorSquad.insertAtFront(data);
                }
             }
    }//main
}//class
