/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist.PastYear;

import java.util.ArrayList;

/**
 *
 * @author user
 */
//oct2016
public class Test {
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList();
        int data = 2;
         for (int x=0; x<3; x++){
             if (data %2 == 0){
                 list.add(data);
                 data++;
             }
             else{
                 list.add(x, data);
                 System.out.print(data + " ");
             }
         }
    }
}
