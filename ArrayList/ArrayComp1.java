/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayComp1 {
    public static void main (String[] args){

        int type = 1;
        ArrayComp[] com = new ArrayComp[3];
        
        for(int i=0; i<com.length; i++){
        	
                Scanner sc = new Scanner (System.in);
                
                System.out.println("Computer :  "+ type);
                type++;
                
                System.out.print("Enter Code : " );
                int code = sc.nextInt();
                System.out.print("Enter Brand : ");
                String brand = sc.next();
                System.out.print("Enter Price : RM ");
                int price = sc.nextInt();
                System.out.println("=========================================");
        }
    }
}

