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
public class Comp {
    
    public static void main (String[] args){
        
        int a;
        String b;
        int c;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Code : ");
        int code = sc.nextInt();
        System.out.println("Enter Brand : ");
        String brand = sc.next();
        System.out.println("Enter Price : ");
        int price = sc.nextInt();
        
        Computers comp = new Computers(code,brand,price);
        System.out.println(comp.getCode());
        System.out.println(comp.getBr());
        System.out.println(comp.getPr());
    }
}

