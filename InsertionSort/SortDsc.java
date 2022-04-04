/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SortDsc {
    public static void main(String[] args){    
        int[] num = new int[15];
        Scanner sc=new Scanner(System.in);
  
        
        //Ask user to insert 15 integer numbers
        System.out.print("Enter 15 Integer Number");
        System.out.println("\nInteger Number :");

        
        int temp=0;
        
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        
        //Displaying elements of original array    
        System.out.println("List Integer Number: ");    
        for (int i = 0; i < num.length; i++) {     
            System.out.print(num[i] + " ");      
        }
        
        //Sort the array in descending order    
        for (int i = 0; i < num.length; i++) {     
            for (int j = 1+i; j < num.length; j++) {     
               if(num[i] < num[j]) {    
                   temp = num[i];    
                   num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Number was sorted in descending order: ");    
        for (int i = 0; i < num.length; i++) {     
            System.out.print(num[i] + " ");    
        }    
    }    
}

/* original code 
public static void main(String[] args){
    //Initialize array     
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in descending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }
*/