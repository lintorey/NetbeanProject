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
public class Comp2 {
     public static void main(String[] args) {
        
        int n = 3;
        
        Scanner sc=new Scanner(System.in);
        float k[] = new float[n];
        int a[] = new int[n];
        String b[] = new String[n];
        double c[] = new double[n];
        
        int value = 1;
        for(int x=0; x < k.length; ++x){
            
            System.out.println("\nPlease enter details for computer "+value);
            
            System.out.print("Code  :");
            a[x]=sc.nextInt();
            sc.nextLine();
            System.out.print("Brand : ");
            b[x]=sc.nextLine();
            System.out.print("Price : ");
            c[x]=sc.nextDouble();
            
            value++;
        }
        Comp1 com = new Comp1(a,b,c);
   	}
}


