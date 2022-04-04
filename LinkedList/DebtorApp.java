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
public class DebtorApp {
    public static void main(String [] args) {
        LinkedList debtorList = new LinkedList();
        
        for (int i=0; i<2; i++){ 
             String nm = JOptionPane.showInputDialog("Enter Name : ");
             double sa = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary : "));
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Amount : "));
             String cat = JOptionPane.showInputDialog("Enter Category : ");
             
             Debtor deb = new Debtor(nm, sa, rm, cat);
             debtorList.insertAtBack(deb); 

             // to display all conti in the linked list
             System.out.println("LIST OF DEBTOR : ");
             Debtor D = null;
             Object data = debtorList.getFirst();
             
             while (data != null){ 
                 D = (Debtor) data;
                 System.out.println(D.toString());
                 data = debtorList.getNext();
             } // while
             
             //calc&display
             int count = 0;
             while (data != null){ 
                 D = (Debtor) data;
                 System.out.println(D.toString());
                 data = debtorList.getNext();
                 
                 if (D.getCategory() == "1"){
                     count++;
                     
                 } //if
             System.out.println("Total Amount Loan : RM " + count);

             } // while
             
             //display detail
             if (D.getSalary() > 20000){
                    System.out.println("\nDebator Details : " + D.toString());
                     
             } //if
             
             //display name & amount
             double amountpaid = 0;
             while (data != null){
                 amountpaid = (D.getAmount() * 0.15) + D.getAmount();
                 System.out.println("\nName : " + D.getName());
                 System.out.println("\nAmount To Be Paid : " + amountpaid);
             }
  
        }//for
    }
}
