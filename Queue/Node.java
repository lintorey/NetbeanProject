/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author user
 */
public class Node {
    Object data;
    Node next;

    Node(Object obj) {
    	data=obj;
        next=null;
    }
}
