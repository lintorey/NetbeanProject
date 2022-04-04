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
public class ContigentApp {
    public static void main(String [] args) {
        LinkedList contiList = new LinkedList();
        
        for (int i=0; i<2; i++){ 
             String st = JOptionPane.showInputDialog("Enter State : ");
             int gold = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Gold : "));
             int silver = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Silver : "));
             int bronze = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Of Bronze : "));
             
             Contigent conti = new Contigent(st,gold,silver,bronze);
             contiList.insertAtBack(conti); 

             // to display all conti in the linked list
             System.out.println("LIST OF CONTIGENT : ");
             Contigent C = null;
             Object data = contiList.getFirst();
             
             while (data != null){ 
                 C = (Contigent) data;
                 System.out.println(C.toString());
                 data = contiList.getNext();
             } // while
             
            Contigent displayWinner = new Contigent(); 
            data = contiList.getFirst();
            while (data != null) { 
                
                int max = 0;
                String state = " ";
                while (C != null){
                    if (C.getnumGold() > max) { 
                        state = C.getState( );
                        max = C.getnumGold( );
                        displayWinner = C;
                    } 
                    C = (Contigent) contiList.getNext();
                    System.out.println ("Winner : " + state);

                    data = contiList.getNext();
                }
                
             } 
              
        }//for
        
    }//main

}//ContiApp
