/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author user
 */
public class Car {
    String RegNumber;
    String Manufacturer;
    double price;
    int yearPurchase;
    
    public Car(){
        RegNumber = " ";
        Manufacturer = " ";
        price = 0;
        yearPurchase = 0;
    }
    
    public Car(String RegNumber,String Manufacturer,double price,int yearPurchase){
        this.RegNumber = RegNumber;
        this.Manufacturer = Manufacturer;
        this.price = price;
        this.yearPurchase = yearPurchase;
        
    }
    
    public void setCar(String no,String mn,double rm,int year){
        RegNumber = no;
        Manufacturer = mn;
        price = rm;
        yearPurchase = year;
        
    }
    
    public String getRegNumber(){
        return RegNumber;
    }
    public String getManufacturer(){
        return Manufacturer;
    }
    public double getPrice(){
        return this.price;
    }
    public int getYearPurchase(){
        return yearPurchase;
    }
    
    public String toString(){
        return "\n Reg Number : " + RegNumber + " Manaufacturer : " + Manufacturer + " Price : RM " + price + " Year Purchase : " + yearPurchase;
    }
}
