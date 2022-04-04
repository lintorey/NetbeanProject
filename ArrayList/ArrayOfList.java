/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ArrayOfList {
    public static void main (String[] args){
        ArrayList<String> L1 = new ArrayList<>();
        L1.add("1");
        L1.add("2");
        
        ArrayList<String> L2 = new ArrayList<>();
        L2.add("3");
        L2.add("4");
        L2.add("5");
        
        ArrayList<String>[] arrayOfList = new ArrayList[2];
        arrayOfList[0] = L1;
        arrayOfList[1] = L2;
        
        for (int i=0; i<arrayOfList.length; i++){
            ArrayList<String> L = arrayOfList[i];
            System.out.println(L);
        }
    }
}
