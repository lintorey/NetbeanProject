/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist.PastYear;

/**
 *
 * @author user
 */
public class Car {
    private String RegistrationNo;
    private String OwnerName;
    private String ManufactureName;
    private double CarPrice;
    
    public Car(){
        RegistrationNo = " ";
        OwnerName = " ";
        ManufactureName = " ";
        CarPrice = 0.0;
    }
    
    public Car(String RegistrationNo,String OwnerName,String ManufactureName,double CarPrice){
        this.RegistrationNo = RegistrationNo;
        this.OwnerName = OwnerName;
        this.ManufactureName = ManufactureName;
        this.CarPrice = CarPrice;
    }
    
    public void Car (String reg,String name,String Manu,double rm){
        RegistrationNo = reg;
        OwnerName = name;
        ManufactureName = Manu;
        CarPrice = rm;
    }
    
    public String getRegistrationNo(){
        return RegistrationNo;
    }
    public String getOwnerName(){
        return OwnerName;
    }
    public String getManufactureName(){
        return ManufactureName;
    }
    public double getCarPrice(){
        return CarPrice;
    }
    
    public String toString(){
        return "\nRegistration No:"+RegistrationNo+"\nOwner Name:"+OwnerName+"\nManufacture Name:" + ManufactureName + "\nCarPrice:RM" +CarPrice;
    }
    
}
