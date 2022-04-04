/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class Clock {

     private String brand;
     private String shape; //round, square
     private double price;
     private String design; //antique, modern
     private char type; //D: digital, A: analog
     
     public Clock(String brand, String shape, double price, String design, char type){
        this.brand = brand;
        this.shape = shape;
        this.price = price;
        this.design = design;
        this.type = type;
    }

     //normal constructor
     public void setClock(String b, String s, double rm, String d, char t){
        brand = b;
        shape = s;
        price = rm;
        design = d;
        type = t;
    }
     
     //Accessor methods:
     public String getBrand(){
         return brand;
     }
     public String getShape(){
         return shape;
     }
     public double getPrice(){
         return price;
     }
     public String getDesign(){
         return design;
     }
     public char getType(){
         return type;
     }
     
     //printer method: toString()
     public String toString(){
         return "\nbrand = " + brand + "shape = " + shape + "price = " + price + "design = " + design + "type = " + type;
     }
}
