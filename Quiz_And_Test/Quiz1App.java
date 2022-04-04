/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class Quiz1App {
    public static void main(String[] args) { 
        MyArrayList strArr = new MyArrayList (); 
        strArr.add(new MyString ("honest")); 
        strArr.add (new MyString ("humble")); 
        strArr.add(new MyString ("kind")); 
        strArr.add (3, new MyString ("humble")); 
        strArr.add(new MyString ("cheerful")); 
        strArr.add(new MyString ("polite")); 

        System.out.println("Value of outputi: " + strArr.get (4)); 
        System.out.println("Value in the strArr now: " + strArr.toString()); 

        MyString strTemp = strArr.get(0); 
        strArr.set(0, strArr.get(1)); 
        strArr.set(1, strTemp); 
        strTemp = strArr.get(0); 
        strArr.set(0, strArr.get(strArr.size()-1)); 
        strArr.set(strArr.size () -1, strTemp); 

        System.out.println("Value in the strArr now: " + strArr.toString() ); 
        String key = strArr.remove(3).getStr(); 
        boolean found = false; 
        int low = 0, high = strArr.size()-1; 
        while (high >= low) { 
            int mid = (low + high) / 2; 
            String str = strArr.get(mid).getStr(); 
            if (key.compareTo (str) <0) 
            high = mid - 1; 
            else if (key.equalsIgnoreCase (str)) {
                found = true;
                break;
            } else low = mid + 1; 
        }
        if (found == true) 
            System.out.println (key + " is found"); 
        else 
            System.out.println (key + " is not found"); 
            System.out.println("Value in the strArr now: " + strArr); 
    } // end of main() 
}


