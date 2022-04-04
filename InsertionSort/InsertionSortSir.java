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
public class InsertionSortSir {
    public InsertionSortSir() {
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data={44,42,35,33,31,27,26,19,14,10};
        for (int k=0;k<data.length;k++){
        		System.out.print(data[k]+" ");
        	}
        System.out.println();
        
        //insertion sort
        int i, j, key;
		for (i=1;i<data.length;i++){
			j = i;
			while (j>0 && data[j-1]>data[j]){
				key = data[j];
				data[j] = data [j-1];
				data[j-1] = key;
				j--;
			}
			for (int k=0;k<data.length;k++){
        		System.out.print(data[k]+" ");
        	}
        	System.out.println();
		}
		// Binary search
		Scanner sc = new Scanner(System.in);
		System.out.print("Number to search : ");
		int c = sc.nextInt();
		boolean found=false;
		int low=0;
		int high=data.length-1;
		int mid = (high-low)/2;
		while ((low<high)&&!found){
			//System.out.println(data[mid]+" "+c+" "+mid);
			if (data[mid]<c){
				low=mid+1;
				mid=low+(high-low)/2;
			}else if (data[mid]>c){
				high=mid;
				mid=low+(high-low)/2;
			}else{
				System.out.println("Found at location : " +mid);
				found=true;
			}
		}
		if(found)System.out.println(c+ " is in the array");
		else System.out.println(c+ " is NOT in the array");
		
		//bubble sort in descending order
		boolean swapped = false;
		do{
			swapped = false;
			for (i=0;i<=data.length-2;i++){
				if (data[i]<data[i+1]){
					int temp = data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
					swapped=true;
				}
				for (int k=0;k<data.length;k++){
        			System.out.print(data[k]+" ");        				
				}
				System.out.println();
			}
		}while(swapped);
        for (int k=0;k<data.length;k++){
        		System.out.print(data[k]+" ");
        	}
        System.out.println();		
    }
}

