/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author user
 */
public class Comp1 {
    	private int code;
	private String brand;
	private double price;

    public Comp1() {
    }
    
    public Comp1(int[] c, String[] b, double[] y){
    	
        float k[] = new float[3];
        int comp = 1 ;
    	for(int j=0; j < k.length; ++j){
            
            System.out.println("\nInformation for computer "+comp);
            
            System.out.println("Code: " + c[j]);
            System.out.println("Brand: " + b[j]);
            System.out.println("Price: " + y[j]);
            
            comp++;
        }
    }
    public int getCode(){
    	return code;
    }
    public String getBr(){
    	return brand;
    }
    public double getPr(){
    	return price;
    }
}

