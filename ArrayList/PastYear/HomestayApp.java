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
public class HomestayApp {
    public static void main(String[] args) {
        ArrayList homestayList1 = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<2; i++){
            System.out.print("Enter Name : ");
            String nm = sc.next();
            System.out.print("Enter No Room : ");
            int no = sc.nextInt();
            System.out.print("Enter Distance From Uitm : ");
            double km = sc.nextDouble();
            System.out.print("Enter Rate : RM ");
            double rm = sc.nextDouble();
            
            //object
            Homestay home = new Homestay(nm,no,km,rm);
            homestayList1.add(i,home);
            
            //replace data
            //a) answer
            Homestay hm = new Homestay("fyna hotel",68, 7.98, 120.90);
            homestayList1.set(22,hm);
        }
        
        //Display Homestay >= 5km
        //Find Homestay more than 5km in HomestayList2
        Homestay homestayList2 = new Homestay();//declare new array
        for(int m = 0; m < homestayList1.size(); m++){
            Homestay n = (Homestay) homestayList1.get(m);
            if(n.getDistance_from_uitm() > 5){
                homestayList2.getDistance_from_uitm();
                homestayList1.add(n);
            }

        System.out.println("Record not found !");
        
        }

    }
}
