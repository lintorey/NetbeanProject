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
public class InsertionPosition {
    public static void main(String[] args){
        int number = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose Number (10,14,19,26,27,31,33,35,42,44) : ");
        number = sc.nextInt();

        int[] arr1 = {44,42,35,33,31,27,26,19,14,10};    
        int low = 0;
        int high = arr1.length - 1;
        
        if (low <= high){
           int mid =  (low + high)/2;
            
            if(arr1[mid] == number){

                System.out.println("Location for " + number + " is : " + mid);
                System.exit(0);
            }
            
            else if(number<=arr1[mid]){
                high = mid - 1;
            }
            
            else{
                low = mid + 1;
            }  
        }
    }
}


