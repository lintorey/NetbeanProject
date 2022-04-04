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
public class LecturerApp {
    public static void main(String [] args) {

     LinkedList lecturerLL = new LinkedList();
     for (int i=0; i<20; i++){ 
             String name = JOptionPane.showInputDialog("Enter Lecturer Name : ");
             String fac = JOptionPane.showInputDialog("Enter Faculty Name : ");
             String no = JOptionPane.showInputDialog("Enter Phone Number : ");

             Lecturer lect = new Lecturer(name, fac, no);
             lecturerLL.insertAtFront(lect); // OR theList.insertAtBack(lect); }

             // to display all lect in the linked list
             System.out.println("LIST OF LECTURER : ");
             Lecturer L = null;
             Object data = lecturerLL.getFirst();

             while (data != null){ 
                 L = (Lecturer) data;
                 System.out.println(L.toString());
                 data = lecturerLL.getNext();
             } // while
             
             //find and list name & phone num from fac science comp
             
             Lecturer newLect = new Lecturer();
             data = lecturerLL.getFirst();
             while (data != null){ 
                 //double cg = 0.0;
                 L = (Lecturer) data;
                 
                 if ("Science Comp".equals(L.getFacultyName()) || "CS".equals(L.getFacultyName())){ 
                     newLect = L;
                     name = newLect.getLecturerName();
                     no = newLect.getPhoneNumber();
                     data = lecturerLL.getNext();
                 }
                 
            }// while
             
             // to delete a lect
             data = lecturerLL.removeFromFront(); // OR data = theList.removeFromBack();
             if (data != null){ 
                 L = (Lecturer) data; 
                 System.out.println("DATA DELETED");
                 System.out.println(L.toString()); 
             }
             else{
                 System.out.println("CANNOT DELETE - LIST EMPTY");
            }
                 
        }//for
     
    }// main
}//lecturerapp
