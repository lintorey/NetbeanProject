/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

import Queue.*;

/**
 *
 * @author user
 */
public class Queue extends LinkedList{

    public Queue() { // constructor
        
    }

    public void enqueue( Object elem){
        
        insertAtBack (elem); }

    public Object dequeue ( ){
        return removeFromFront(); 
    }

    public Object getFront(){
        return getFirst(); 
    }

    public Object getEnd(){
        
        Object O = removeFromBack();
        insertAtBack(O);
        return O;
    }

} // end Queue