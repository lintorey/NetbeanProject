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
public class Homestay {
    private String name;
    private int no_rooms;
    private double distance_from_uitm;
    private double rate;
    
    //default constructor
    public Homestay(){
            name = "   ";
            no_rooms = 0;
            distance_from_uitm = 0;
            rate = 0.0;
    }

    //normal constructor
    public Homestay(String nm, int no, double km, double rm){
            name = nm;
            no_rooms = no;
            distance_from_uitm = km;
            rate = rm;
    }

    //setter method
    public void setName(String nm){ 
        name = nm; 
    }
    public void setNo_rooms(int no){ 
        no_rooms = no; 
    }
    public void setDistance_from_uitm(int km){ 
        distance_from_uitm = km; 
    }
    public void setRatePerDay(double rm){ 
        rate = rm; 
    }

    //getter method
    public String getName(){ 
        return name; 
    }
    public int getNo_rooms(){ 
        return no_rooms; 
    }
    public double getDistance_from_uitm(){ 
        return distance_from_uitm; 
    }
    public double getRate(){ 
        return rate; 
    }


    //to String method
    public String toString()
    {
            return "Name : "+name+" No. Room : "+no_rooms+" Distance From Uitm:  "+distance_from_uitm+" Rate : RM "+rate;
    }

}
