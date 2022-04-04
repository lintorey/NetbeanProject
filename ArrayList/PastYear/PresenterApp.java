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
//march2016 q2
public class PresenterApp {
    public static void main(String[] args){
        ArrayList presenterList = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<2; i++){
            System.out.print("Enter Name : ");
            String nm = sc.next();
            System.out.print("Enter Affiliation : ");
            String aff = sc.next();
            System.out.print("Enter Paper ID : ");
            String id = sc.next();
            System.out.print("Enter Payment Status ");
            boolean pay = sc.nextBoolean();
            System.out.println("========================");
            
            //object
            Presenter pre = new Presenter(nm,aff, id, pay);
            presenterList.add(i,pre);
        }
        
        //copy to new arraylist
        //display both data display
         ArrayList confirmedList = new ArrayList();
         ArrayList pendingList = new ArrayList();
         int countC = 0;
         int countP = 0;
         
        for(int l = 0; l < presenterList.size(); l++){
            Presenter p = (Presenter) presenterList.get(l);
            if (p.getPaymentStatus() == true){
                confirmedList.add(l);
                countC++;
                System.out.print("\nNumber Of Presenter That Confirmed : " + countC);
            }
            else if (p.getPaymentStatus() == false){
                pendingList.add(l);
                countP++;
                System.out.print("\nNumber Of Presenter That Pending: " + countP);
            }
        }
        
        //count & display no & name presenter uitm
        int count = 0;
         for(int m = 0; m < presenterList.size(); m++){
            Presenter p = (Presenter) presenterList.get(m);
            if(p.getAffilation().equalsIgnoreCase("UiTM")){
                count++;
                System.out.print("\nNumber Of Presenter From UiTM : " + count);
                System.out.print("\nName Of Presenter From UiTM : " + p.getName());
            }
         }
            
    }
}
