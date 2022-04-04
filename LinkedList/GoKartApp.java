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
public class GoKartApp {
    public static void main(String [] args) {

     LinkedList theList = new LinkedList();
         // to input 5 participant into the list
         for (int i=0; i<2; i++){ 
             String nm = JOptionPane.showInputDialog("Enter Name : ");
             String type = JOptionPane.showInputDialog("Enter Type Of Car [couple or single] : ");//couple or single seat
             String se = JOptionPane.showInputDialog("Enter Stroke Engine [150cc or 200cc] : ");//150cc @ 200cc
             int op = Integer.parseInt(JOptionPane.showInputDialog("Enter Option \n[1]-Quick Experience \n[2]-Adventure Race  : "));
             int lap = Integer.parseInt(JOptionPane.showInputDialog("Enter Num Of Laps : "));
             boolean set = Boolean.parseBoolean(JOptionPane.showInputDialog("Need Safety Set ? [true] or [false] : "));

             GoKart stud = new GoKart(nm,type,se,op,lap,set);
             theList.insertAtFront(stud); // OR theList.insertAtBack(stud); }

             // to display all participant in the linked list
             System.out.println("\n LIST OF PARTICIPANT: ");
             GoKart G = null;
             Object data = theList.getFirst();

             while (data != null){ 
                 G = (GoKart) data;
                 System.out.println(G.toString());
                 data = theList.getNext();
                 

                //calc & display total charge receive from cust. 1 cust charge rm30-each lap & extra rm20-safetyset
                double totalCharge = 0;
                double price = 0;
                int laps = 0;
                if(G.getNumOfLaps() > 1){
                    int rm = Integer.parseInt(JOptionPane.showInputDialog("Enter Price : RM "));
                    
                    price = 30 * laps;
                    totalCharge = price + 30;
                    System.out.println("Total Charge : RM  " + totalCharge);
                    
                    //boolean safetySet = true;
                    if(G.getSafetySet() == true){
                    
                        totalCharge = price + 30 + 20;
                        System.out.println("Total Charge : RM  " + totalCharge);    
                        System.out.println(G.toString());
                    }//if
                }    

             } // while
    
            //copy all cust who choose race adventure option to another linkedlist(raceAdventureList)
            LinkedList raceAdventureList = new LinkedList();
           raceAdventureList = (LinkedList) raceAdventureList.getNext();
            if (G.getOption()== 2){
               raceAdventureList.insertAtBack(G);

            }

         }//for
    }//main
}//class
