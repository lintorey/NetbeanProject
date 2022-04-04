/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author user
 */
public class Stack extends LinkedList{ 
    public Stack() { 
 
    } // constructor 
    
    public void push (Object elem){ 
        insertAtFront(elem); 
    } 
    public Object pop ( ) { 
        return removeFromFront(); 
    } 
    public Object peek() { 
        return getFirst(); 
    } 
} // end Stack