/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BookApp {
    public static void main(String[] args) {
        Stack bookStack = new Stack();
        Stack kidStack = new Stack();
        Stack adultStack = new Stack();
        Stack tempS = new Stack();

        for(int i=0; i<2; i++)
        {
            String serialNum = JOptionPane.showInputDialog("Enter serial num");
            String title = JOptionPane.showInputDialog("Enter title");
            String price = JOptionPane.showInputDialog("Enter price");
            String author = JOptionPane.showInputDialog("Enter author name");
            String publisher = JOptionPane.showInputDialog("Enter publisher");
            double dPrice = Double.parseDouble(price);

            Book B = new Book(serialNum, title, dPrice, author,publisher);
            bookStack.push(B);
        }

        while (!bookStack.isEmpty())
        {
            Book b = (Book) bookStack.pop(); //masukkan dalam obj
            if(b.getSerialNum().substring(0,1).equalsIgnoreCase("A"))
            {
                kidStack.push(b);
            }
            else  if(b.getSerialNum().substring(0,1).equalsIgnoreCase("B"))
            {
                adultStack.push(b);
            }
            else

            tempS.push(b);
        }
        System.out.println("Kid book : "+kidStack.toString());
        System.out.println("Adult book : "+adultStack.toString());

        while (!tempS.isEmpty())
        {
            bookStack.push(tempS.pop());
        }
    }
}
