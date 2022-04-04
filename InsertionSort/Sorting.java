/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Scanner;

/**
 *
 * @author fadhlinqistina
 */


public class Sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] num = new int[15];
        
        //Ask user to insert 15 integer numbers
        System.out.print("Please Enter 15 Integer Number");
        System.out.println("\nInteger Number:");
        
        int temp=0;
        
        //int item = 0;
        
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        
        //Displaying elements of original array    
        System.out.println("List Integer Number: ");    
        for (int i = 0; i < num.length; i++) {     
            System.out.print(num[i] + " ");      
        }
        
        //Sort the number in descending order using either insertion / bubble sort   
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
         
        //Use binary search algorithm, find the number ask by the user
        //loop to store each no
        
        int left = 0;
        int right = num.length -1;
        int mid = 0;
        int find;
        
        System.out.print("\nEnter The Search Value : ");
        find = sc.nextInt();
         
        
        while(left < right){
            mid =  (left + right)/2;
            //formula cari mid
            
            if(num[mid] == find){
                System.out.println("Location for "+find+" is "+mid);
                System.exit(0);
                
            }
            else if(find<num[mid]){
                right = mid -1 ;

            }
            else {
                left = mid + 1;
                
                System.out.println(find+ " doesn't exist in integer number listed !");
                System.exit(0);
            }
        
        }

    }//main
}//class
