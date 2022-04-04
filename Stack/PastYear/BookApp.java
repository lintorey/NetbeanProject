/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.PastYear;

import javax.swing.JOptionPane;

/**
 *
 * @author lintorey
 */


//JAN2018 PART B Q6
public class BookApp {
    public static void main (String[] args){
        //declare stack
         Stack bookStack = new Stack(); // original stack
         Stack tempStack = new Stack(); // temporary stack
         
         Stack kidStack = new Stack(); // stack for kid
         Stack adultStack = new Stack(); // stack for adult
         
         for (int i=0; i < 3; i++){  // to input 2 Book into the list
             String no = JOptionPane.showInputDialog("Enter Seriel Num");
             String ti = JOptionPane.showInputDialog("Enter Title");
             double rm = Double.parseDouble(JOptionPane.showInputDialog("Enter Price"));
             String au = JOptionPane.showInputDialog("Enter Author");
             String pub = JOptionPane.showInputDialog("Enter Publisher");

             Book boo = new Book(no, ti, rm, au, pub);
             bookStack.push(boo); 
         } //insert data 
         
         // to display all the students in the stack
         Object data;
         Book B;

         while (!bookStack.isEmpty()){
             data = bookStack.pop(); //delete first
             B = (Book) data; //casting
             System.out.println(B.toString()); //display
             tempStack.push(B); // put into temporary stack
         }

         // restore; transfer all data from temporary stack to original stack
         while (!tempStack.isEmpty()){
             bookStack.push(tempStack.pop());
         }
         
         while (!bookStack.isEmpty()){
             data = bookStack.pop(); // pop from origional stack
             B = (Book) data;
             
             if(B.getSerielNum().substring(0,1).equalsIgnoreCase("A")){
                kidStack.push(B);
             }
             
            if(B.getSerielNum().substring(0,1).equalsIgnoreCase("B")){
                adultStack.push(B);
            }
            
            else
                tempStack.push(B);
        }//while
         
         // display result
         System.out.println("\nBOOK VERSION");
         
         System.out.println("\nList Of Book In Kids Version : " + kidStack.peek());
         System.out.println("\nList Of Book In Adult Version : " + adultStack.peek());

        while (!tempStack.isEmpty()){
            bookStack.push(tempStack.pop());
        }
       
    }//main
}//class
