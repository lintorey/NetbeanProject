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
public class GoKart {
    
    private String name, typeOfCar,strokeEngine;
    private int option, numOfLaps;
    private boolean safetySet;
    
    //default constructor
    public GoKart(){
        name = " ";
        typeOfCar = " ";
        strokeEngine = " ";
        option = 0;
        numOfLaps = 0;
        safetySet = true;
    }
    
    //normal constructor
    public GoKart(String name,String typeOfCar, String strokeEngine, int option, int numOfLaps, boolean safetySet){
        this.name = name;
        this.numOfLaps = numOfLaps;
        this.option = option;
        this.strokeEngine = strokeEngine;
        this.typeOfCar = typeOfCar;
        this.safetySet = safetySet;
    }
    
    //setter
    public void GoKart(String nm,String type, String se, int op, int lap, boolean set){
        name = nm;
        numOfLaps = lap;
        option = op;
        strokeEngine = se;
        typeOfCar = type;
        safetySet = set;
    }
    
    //getter
    public String getName(){
        return name;
    }
    public String getTypeOfCar(){
        return typeOfCar;
    }
    public String getStrokeEngine(){
        return strokeEngine;
    }
    public int getOption(){
        return option;
    }
    public int getNumOfLaps(){
        return numOfLaps;
    }
    public boolean getSafetySet(){
        return safetySet;
    }
    
    //print
    public String toString(){
        return "\n Name : " + name + "\n Type Of Car : " + typeOfCar + "\n Option : " + option + "\n Num Of Laps : " + numOfLaps + "\n Safety Set : " + safetySet;
    }
}
