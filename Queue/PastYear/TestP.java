/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

/**
 *
 * @author user
 */
public class TestP {
    public static void main(String [] args){
        Queue list1 = new Queue();
        Queue list2 = new Queue();
        Queue list3 = new Queue();
        
        for(int i=5; i<16; i++){
            if(i%5!= 0){
                list1.enqueue(i*6);
            }
            else             
                list2.enqueue(i);
        }
        
        Queue list4 = new Queue();
        int x;
        while (!list1.isEmpty()){
            x =(Integer)list1.dequeue();
            if(x%8 ==0){
                list3.enqueue(x);
            }
            else
                list4.enqueue(x);
        }
        
        //##########
        while(!list1.isEmpty()){
            list1.enqueue(list4.dequeue());
        }
    }
}
