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
public class Erase {
    public static void main (String[] args){
        ArrayList names = new ArrayList();
        names.add("Ted");
        names.add("Fred");
        names.add("Jed");
        names.add("Ned");
        System.out.println(names);
        System.out.println(names.size());//how many element in arrayList
        names.remove(2);// delete index no 2
        System.out.println(names);
    }
}
