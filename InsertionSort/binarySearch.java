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
public class binarySearch {
    
    
    public static void main(String args[]){
        //contoh soalan = cari location utk number 42
        
        Scanner sc=new Scanner(System.in);
        int target = 42;
        
        int arr[] ={10,14,19,26,27,31,33,35,42,44};
        //nilai dlm array
        
        int left = 0;
        int right = arr.length -1;
        //pointer kiri and kanan, kanan tolak 1 sbb array start dari 0
        
        int mid = 0;
        
        while(left<right){
            mid =  (left + right)/2;
            //formula cari mid
            
            if(arr[mid] == target){
                System.out.println("Location for "+target+" is "+mid);
                System.exit(0);
            }
            else if(target<arr[mid]){
                right = mid -1 ;
            }
            else{
                left = mid + 1;
            }   
        }
    }
}

