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
public class insertion {
    
    public static void main(String[] args){
        
        int i, j, key = 0;
        int[] array = {44,42,35,33,31,27,26,19,14,10};
        
            for (i=1; i<array.length; i++){
                j = i;
                for(int s:array){
                     System.out.print(s+" ");
                }
                System.out.print("\n");
                while (j > 0 && array [j - 1] > array [ j ])
             {
                 key = array [ j];
                 array[j] = array [ j - 1];
                 array [ j - 1] = key;
                 j--;
                 
                 
                }
            }
            for(int s:array){
                System.out.print(s+" ");
        }
    }
}
