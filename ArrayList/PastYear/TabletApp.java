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
public class TabletApp {
    public static void main(String[] args) {
	//Question Number 1
        ArrayList TabletList = new ArrayList(); 
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<20; i++)
        {
                System.out.print("Enter Serial Number : ");
                String sn = scan.next();
                //Acer,Sony,Samsung
                System.out.print("Enter Manufacturer : ");
                String mf = scan.next();
                //Android or Microsoft
                System.out.print("Enter OS : ");
                String o = scan.next();
                System.out.print("Enter price : RM  ");
                double p = scan.nextDouble();

                Tablet t = new Tablet(sn,mf,o,p);
                TabletList.add(i, t);
        }
        //Question number 2
        ArrayList more2K = new ArrayList();
        for(int m = 0; m<TabletList.size();m++)
        {
                Tablet u = (Tablet)TabletList.get(m);
                if(u.getPrice() > 2000){
                    more2K.add(u);
                }
        }
        //Question number 3
        double highest = 0.0;
        Tablet indexObj = null;

        for(int k = 0;k<TabletList.size(); k++){
            Tablet u = (Tablet)TabletList.get(k);
            if(u.getOS().equals("Android")){
                if(u.getPrice() > highest){
                    highest = u.getPrice();
                    indexObj = u;
                }
            }
        }
        System.out.print("The most expensive tablet is :  " + indexObj.toString());

        //Question number 4
        int countAndroid = 0;

        for(int l = 0; l<TabletList.size(); l++){
            Tablet u = (Tablet)TabletList.get(l);
            if(u.getManufacturer().equals("Samsung")){
                if(u.getOS().equals("Android")){
                        countAndroid++;
                }
            }
        }
        
        System.out.println("Total number of Samsung tablet with android Operating System is : " + countAndroid);
        
        
    }
}
