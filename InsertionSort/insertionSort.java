/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class insertionSort {  
        public static void insertionSort(int array[]) {  
            Scanner sc=new Scanner(System.in);
            int n = array.length;  
            for (int j = 1; j < n; j++) {  
                int key = array[j];  
                int i = j-1;  
                while ( (i > -1) && ( array [i] > key ) ) {  
                    array [i+1] = array [i];  
                    i--;  
                }  
                array[i+1] = key;  
            }  
    int number = 0;
        int arr[] ={10,14,19,26,27,31,33,35,42,44};
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        
        if (low < high){
            mid =  (low + high)/2;
            
            if(arr[mid] == number){
                System.out.print("Choose Number (10,14,19,26,27,31,33,35,42,44) : ");
                number = sc.nextInt();
                System.out.println("Location for " + number + " is : " + mid);
                System.exit(0);
            }
            else if(number<arr[mid]){
                high = mid -1 ;
            }
            else{
                low = mid + 1;
            }   
        }
    }
           
        public static void main(String a[]){  
            Scanner sc=new Scanner(System.in);
            /*int i; 
            int j; 
            int key = 0;
            
            int[] arr1 = {44,42,35,33,31,27,26,19,14,10};    
            for (i=1; i<arr1.length; i++){
                j = i;
                for(int s:arr1){
                     System.out.print(s+" ");
                }
                System.out.print("\n");
                while (j > 0 && arr1 [j - 1] > arr1 [ j ])
             {
                 key = arr1 [ j];
                 arr1[j] = arr1 [ j - 1];
                 arr1 [ j - 1] = key;
                 j--;
                 
                }
            }
            for(int s:arr1){
                System.out.print(s+" ");
            }  */
            
        int number = 0;
        int arr[] ={10,14,19,26,27,31,33,35,42,44};
        int mid = 0;
        /*int left = 0;
        int right = arr.length - 1;
        */
        
        //if (left < right){
           //mid =  (left+right)/2;
            
            if(arr[mid] == number){
                //System.out.print("Choose Number (10,14,19,26,27,31,33,35,42,44) : ");
                //number = sc.nextInt();
                System.out.println("Location for " + number + " is : " + mid);
                System.exit(0);
            }
            /*else if(number<arr[mid]){
                right = mid -1 ;
            }
            else{
                left = mid + 1;
            }  */ 
        }
    }

