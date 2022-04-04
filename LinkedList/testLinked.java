/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author user
 */
public class testLinked {
     public static void main(String[] args) {
         LinkedList<Integer> list = new LinkedList();
         
         //add element
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         
         //display element
         System.out.print("LinkedList Element : " + list);
         
         //remove from back
         list.remove(5);
         
         //display element from back
         System.out.print("LinkedList Element : " + list);
         
         //insert from back
         list.addLast(6);
         //list.display();
         list.addLast(7);
         list.addLast(8);
         
         //display element from back
         System.out.print("LinkedList Element : " + list);
         
         //remove from front 2x
         //remove from back 2x
         
        myLinked a = new myLinked();
        a.insertAtFront(2);

        System.out.println(a.getFirst());
        a.insertAtFront(3);
        System.out.println(a.getFirst());
        System.out.println(a.getNext());
        a.insertAtFront(4);
        System.out.println(a.getFirst());
        System.out.println(a.getNext());
        System.out.println(a.getNext());
    }
}
