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
public class Vehicle {
    private String vehicleName; //Exora, MyVii, X50
    private String vehicleType ; //MPV, Sedan, SUV
    private String vehicleRegistrationDate ; //ddmmyyyy
    private double vehiclePrice ; 
    
    public Vehicle(){
        vehicleName = " ";
        vehicleType = " ";
        vehicleRegistrationDate = " ";
        vehiclePrice = 0.0;
        
    }
    
    public Vehicle(String vehicleName, String vehicleType, String vehicleRegistrationDate, double vehiclePrice){
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.vehicleRegistrationDate = vehicleRegistrationDate;
        this.vehiclePrice = vehiclePrice;
    }
     public void setVehicle(String nm, String tp, String reg, double rm){
        vehicleName = nm;
        vehicleType = tp;
        vehicleRegistrationDate = reg;
        vehiclePrice = rm;
     }
    public String getVehicleName(){
        return vehicleName;
    }
    public String getVehicleType(){
        return vehicleType;
    }
     public String getVehicleRegistrationDate(){
        return vehicleRegistrationDate;
    }
    public double getVehiclePrice(){
        return vehiclePrice;
    }
    
    public String toString(){
        return "\n";
    }
}
