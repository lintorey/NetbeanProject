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
public class binarySearch1 {
    public static void main(String[] args){
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
    }
}
