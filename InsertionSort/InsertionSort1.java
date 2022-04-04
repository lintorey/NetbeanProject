/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertionSort;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class InsertionSort1 {

    public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println("Before Sorting: ");
        printArray(A);
        // sort the array
        insertionSort1(A);
        System.out.println("\nAfter Sorting: ");
        printArray(A);
    }

    /**
     * This method will sort the integer array using insertion sort algorithm
     */
    private static void insertionSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }

    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }

    public static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }
}

