/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class testQ {
    public static void main(String [] args){
        Queue Q = new Queue();
        Object front;
        
        Q.enqueue("green");
        Q.enqueue("blue");
        Q.dequeue();
        Q.enqueue("red");
        front = Q.getFront();
        Q.dequeue();
    }
}
