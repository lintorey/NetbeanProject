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
public class Computers {
    
    private int code;
    private String brand;
    private double price;


    public Computers(){
        
    }
    
    public Computers(int c,String b, double p){
        code = c;
        brand = b;
        price = p;
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


