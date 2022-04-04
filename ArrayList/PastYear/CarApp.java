/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist.PastYear;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
//oct2016 q2
public class CarApp {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList carList = new ArrayList();
        int type = 1;
        // insert 30 car
        for (int i=0; i<2; i++){ 
            System.out.println("No Of Car :  "+ type);
            type++;
            
            System.out.print("Enter Registeration Number : ");
            String reg = scan.next();
            System.out.print("Enter Owner Name : ");
            String name = scan.next();
            System.out.print ("Enter Manufacturer : ");
            String Manu = scan.next();
            System.out.print ("Enter Price : ");
            double rm = scan.nextDouble();
            System.out.println("=========================================");

             Car c = new Car(reg,name,Manu,rm);
             carList.add(i,c); 

        }//for
        
        //find and remove Honda car
        System.out.print("Enter car name that you want to search : ");
        String find = scan.next();
        
        for(int k = 0;k<carList.size(); k++){
            Car u = (Car)carList.get(k);
            if(u.getManufactureName().equals("HONDA")){
                carList.remove(k);
            }
        }//for
        
        //find & display information based on registerNo
        System.out.print("Enter Register Number that you want to search : ");
        String findReg = scan.next();
        
        for(int m = 0; m < carList.size(); m++){
            Object obj = carList.get(m);
            Car em = (Car)obj;
            boolean flag = true;
            if(em.getRegistrationNo().equals(find) && flag == true){
                    System.out.println(em.toString());
            }
            else if(flag = false){
                    System.out.println("Record not found !");
            }
        }  
    }//main

}//carApp