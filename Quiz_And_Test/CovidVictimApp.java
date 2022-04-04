/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CovidVictimApp {
    public static void main(String [] args) {
        
        LinkedList victimLL = new LinkedList();
        
        // insert 30 car
        for (int i=0; i<2; i++){ 
             String nm = JOptionPane.showInputDialog("Enter Name : ");
             String id = JOptionPane.showInputDialog("Enter ID : ");
             int old = Integer.parseInt(JOptionPane.showInputDialog("Enter AGE : "));
             String cnm = JOptionPane.showInputDialog("Enter Cluster Name : ");
             String date = JOptionPane.showInputDialog("Enter Positive Date : ");

             CovidVictim covid = new CovidVictim(nm,id,old,cnm,date);
             victimLL.insertAtFront(covid); // OR theList.insertAtBack(lect); }

             // to display all car in the linked list
             System.out.println("LIST OF CAR : ");
             CovidVictim C = null;
             Object data = victimLL.getFirst();
             
             while (data != null){ 
                 C = (CovidVictim) data;
                 System.out.println(C.toString());
                 data = victimLL.getNext();
             } // while
             
             
            //A QUES 
             //find and display
             while (C != null){
                    if (C.getPositiveDate().substring(3,9).equals("2020")) { 
                         System.out.println (C.toString());
                    } 
                    C = (CovidVictim) victimLL.getNext();
                    data = victimLL.getNext();
            }
             
             //B QUES
             LinkedList riskVictimLL = new LinkedList();
            data = victimLL.removeFromFront();
             while (data != null){ 
                C = (CovidVictim) data;
                if (C.getAge() > 50){
                    riskVictimLL.insertAtBack(C);
                }
                else
                    victimLL.insertAtBack(C);

             }
             
             //C QUES
             int countT = 0;
             int countN = 0;
             int countL = 0;
             //CovidVictim riskVictimLL = new CovidVictim();
             data = riskVictimLL.getFirst();
             while (data != null){ 
                 C = (CovidVictim) data;
                 if (C.getClusterName().equalsIgnoreCase("Teratai")){ 
                     countT++;
                     
                 }
                 else if (C.getClusterName().equalsIgnoreCase("Nibong")){
                     countN++;
                 }
                 else if (C.getClusterName().equalsIgnoreCase("Lestari")){
                     countL++;
                 }
                 System.out.println("TOTAL VICTIMS FOR EACH CLUSTER");
                 System.out.println("CLUSTER : " + C.getClusterName());
                 System.out.println("No Of Victim : " + countT);
                 System.out.println("No Of Victim : " + countN);
                 System.out.println("No Of Victim : " + countL);
                 
             }
        }//for
    }
}

