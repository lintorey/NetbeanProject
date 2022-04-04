/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FastDeliveryApp {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Array customerDetail[] = new Array[3];//50 object
        
        int type = 1;
        
        for(int i=0; i<customerDetail.length; i++){
                
            System.out.println("Customer No :  "+ type);
            type++;
            
            System.out.print("Enter Customer Name : ");
            String nm = sc.next();
            System.out.print("Enter IC Number : ");
            String ic = sc.next();
            System.out.print("Enter Date : ");
            String dt = sc.next();
            System.out.print("Enter Type [F]-Fragile, [U]-Urgent, [N]-Not Applicable : ");
            char tp = sc.next().charAt(0);
            System.out.print("Enter Address : ");
            String add = sc.next();
            System.out.print("Enter Weight : ");
            double kg = sc.nextDouble();
            
            FastDelivery t = new FastDelivery(nm,ic,dt,tp,add,kg);
            //customerDetail.add(i, t);
        
        }
        
           for (int m = 0; m < customerDetail.length; m++){
               
               FastDelivery f = (FastDelivery)customerDetail.get(m);
                if (f.getType() == 'F'){
                        if (f.getWeight() >= 30){
                            System.out.print(Arrays.toString(customerDetail));
                        }
                }
            }

            double total = 0.0;
            int weight = 0;
            int count = 0;

            for(int m=0; m<customerDetail.length; m++) {              
                    total = getWeight() * 7.00;
                    count++;
                    System.out.print("Customer Details : " + count);
                    System.out.print(customerDetail.toString());

            }
        
    }
}
