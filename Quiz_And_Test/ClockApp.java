/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

import Arraylist.PastYear.Homestay;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ClockApp {
    public static void main(String[] args) {
        ArrayList clockAL = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<15; i++){
            System.out.print("Brand : ");
            String b = sc.next();
            System.out.print("Enter Shape : ");
            String s = sc.next();
            System.out.print("Enter Price : ");
            double rm = sc.nextDouble();
            System.out.print("Enter Design ");
            String d = sc.next();
            System.out.print("Enter type ");
            char t = sc.next().charAt(0);
            
            //object
            Clock time = new Clock(b,s,rm,d,t);
            clockAL.add(i,time);
            
            //question A
            int countR = 0;
            for(int h = 0; h<clockAL.size(); h++){
                Clock ti = (Clock)clockAL.get(h);
                if (ti.getShape().equalsIgnoreCase("ROUND")){
                    if(ti.getType() == 'D' || ti.getType() == 'd'){
                        countR++;
                        
                    }
                }
            }
            System.out.println("Total number of digital round shape clock :  "+countR);
            
            //question B
            ArrayList antiqueAL = new ArrayList(); 
            ArrayList modernAL = new ArrayList(); 
            
            for(int m = 0; m<clockAL.size(); m++){
                Clock c = (Clock)clockAL.get(m);
                if(c.getDesign().equalsIgnoreCase("ANTIQUE")){
                    antiqueAL.add(c);
                }
                if(c.getDesign().equalsIgnoreCase("MODERN")){
                    modernAL.add(c);
                }
                
            }
            
            //question C
            int count = 0;
            for(int f = 0; f<clockAL.size(); f++){
                Clock cl = (Clock)clockAL.get(f);
                if(cl.getDesign().equalsIgnoreCase("MODERN")){
                    modernAL.add(cl);
                    if(cl.getType() == 'A' || cl.getType() == 'a'){
                        if(cl.getPrice() > 150){
                            count++;
                        }
                    }
                }
            }
            
            System.out.println("Total Price Of Analog Clock : RM  "+count);
        }
    }//main
}
