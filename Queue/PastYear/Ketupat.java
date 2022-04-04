/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

/**
 *
 * @author user
 */
public class Ketupat {
    private String type;
    private double price;
    private double weight;
    
    public Ketupat(){
        type = " ";
        price = 0.0;
        weight = 0.0;
    }
    
    public Ketupat( String type, double price, double weight){
        this.type = type;
        this.price = price;
        this.weight = weight;
        
    }
    
    public void setKetupat( String tp, double rm, double kg){
        type = tp;
        price = rm;
        weight = kg;
        
    }
    
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    
    public String toString(){
        return "\nType : " + type + "\nPrice : RM " + price + "\nWeight: " + weight;
    }
}
