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
public class bubbleSort {
    public static void main(String[] args) {  
        //int number = 0;
        /*Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter 5 Number : ");
        number = sc.nextInt();*/
        
         
        int[] arr = {10,14,19,26,27,31,33,35,42,44};  

        for(int i=0; i<10; i++){  

            for (int j=0; j<10 ;j++){  

                if(arr[i] < arr[j]){  
                    int temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;   
                }  
            }  
        }  
            System.out.println("Bubble Sort : ");  
            for(int i=0; i<10; i++)  
            {  
                System.out.println(arr[i]);  
            }  
        }  
}  

