/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

import Queue.PastYear.Queue;

/**
 *
 * @author user
 */
public class QueueTest1{
     public static void main(String[] args){

         Queue q2 = new Queue();
         int limit = 5;
         for(int i = 0; i < limit; i++) {
         q2.enqueue((limit - i)*(limit - i));
         }

         while(!q2.isEmpty()){
         System.out.print(q2.dequeue()+" "); // 1.
         }
     }
}
