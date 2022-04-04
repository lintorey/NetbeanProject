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
public class Clinic {
    private String ID;
    private String sicknessType;// flu, fever, allergies, diarrhea, etc
    private int criticalType; //1- Non Critical, 2- Semi Critical,//3- Critical
    
    public Clinic(){
        ID = " ";
        sicknessType = " ";
        criticalType = 0;
    }
    
    public Clinic(String ID, String sicknessType, int criticalType){
        this.ID = ID;
        this.sicknessType = sicknessType;
        this.criticalType = criticalType;
    }
     public void Clinic(String id, String sick, int type){
        ID = id;
        sicknessType = sick;
        criticalType = type;
     }
    public String getID(){
        return ID;
    }
    public String getSicknessType(){
        return sicknessType;
    }
    public int getCriticalType(){
        return criticalType;
    }
    
    public String toString(){
        return "\nID: " + ID + "\nSickness Type: " + sicknessType + "\nCritical type : " + criticalType;
    }

}
