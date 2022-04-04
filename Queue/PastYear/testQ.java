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
public class testQ {
    public static void main(String [] args){
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Queue q3 = new Queue();
        
        for (int n=0; n<10; n++){
            if(n % 2 == 1){
                q1.enqueue(n);
            }
            else
                q2.enqueue(n + 3);
        }//for
        
        //Line AA
        //Line BB. Add code statement here.
        // to display all the students in the queue

        
        System.out.println (q3.toString());
    }//main
}//testApp
