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
public class StudentEventApp {
    public static void main(String [] args) {

     LinkedList theList = new LinkedList();
         // to input 5 students into the list
         for (int i=0; i<2; i++){ 
             String nm = JOptionPane.showInputDialog("Enter Event Name : ");
             String or = JOptionPane.showInputDialog("Enter Organizer : ");
             String ve = JOptionPane.showInputDialog("Enter Venue : ");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Budget : RM "));
             boolean st = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter Status : "));
             
             //write method insertBack to insert data at end LinkedList
            /* public void insertAtBack(SUKSIS insertItem) adha answer
                {
                Node newNode = new Node(insertItem);

                if (isEmpty())
                {	first = newNode;
                last = newNode;
                }
                else
                {
                last.next = newNode;
                last = newNode;
                }
                }*/
             StudentEvent stud = new StudentEvent(nm,or,ve,rm,st);
             theList.insertAtBack(stud); // OR theList.insertAtBack(stud); }

             // to display all students event in the linked list
             System.out.println("LIST OF STUDENT EVENT:");
             StudentEvent S = null;
             Object data = theList.getFirst();

             while (data != null){ 
                 S = (StudentEvent) data;
                 System.out.println(S.toString());
                 data = theList.getNext();
             } // while
             
    
    
            //Write method deleteBack() which delete & retur data at end of LinkedList
            data = theList.removeFromBack(); // OR data = theList.removeFromBack();
                 if (data != null){ 
                     S = (StudentEvent) data; 
                     System.out.println("DATA DELETED");
                     System.out.println(S.toString()); 
                 }
                     else
                     System.out.println("CANNOT DELETE - LIST EMPTY");
                
         }//for
    }//main
}//class
