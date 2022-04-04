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
public class BubbleSort1 {
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
        
        //insertion sort
        int i, j, key = 0;
        int[] arr = {44,42,35,33,31,27,26,19,14,10};
        
            for (i = 1; i < arr.length; i++){
                j = i;
                for(int s:arr){
                     System.out.print(s+" ");
                }
                System.out.print("\n");
                while (j > 0 && arr [j - 1] > arr [ j ])
             {
                 key = arr [ j];
                 arr[j] = arr [ j - 1];
                 arr [ j - 1] = key;
                 j--;
                 
                 
                }
            }
            for(int s:arr){
                System.out.print(s+" ");
        }
    
        //int i, j, key = 0;
        //int[] arr = {44,42,35,33,31,27,26,19,14,10};
        
            for (i = 1; i < arr.length; i++){
                j = i;
                for(int s:arr){
                     System.out.print(s+" ");
                }
                System.out.print("\n");
                while (j > 0 && arr [j - 1] > arr [ j ])
             {
                 key = arr [ j];
                 arr[j] = arr [ j - 1];
                 arr [ j - 1] = key;
                 j--;
                 
                 
                }
            }
            for(int s:arr){
                System.out.print(s+" ");
        }
    
                 
   
        }  
}  


