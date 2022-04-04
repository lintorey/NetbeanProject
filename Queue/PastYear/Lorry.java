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
public class Lorry {
    String RegNo;
    String dateReg;
    String owner;
    String stateReg;
    
    public Lorry(){
        RegNo = " ";
        dateReg = " ";
        owner = " ";
        stateReg = " ";
    }
    
    public Lorry(String RegNo,String dateReg,String owner,String stateReg){
        this.RegNo = RegNo;
        this.dateReg = dateReg;
        this.owner = owner;
        this.stateReg = stateReg;
    }
    
    public void Lorry (String no,String date,String nm,String st){
        this.RegNo = no;
        this.dateReg = date;
        this.owner = nm;
        this.stateReg = st;
    }
    
    public String getRegNo(){
        return RegNo;
    }
    public String getDateReg(){
        return dateReg;
    }
    public String getOwner(){
        return owner;
    }
    public String getStateReg(){
        return stateReg;
    }
    
    public String toString(){
        return "\nReg No: "+RegNo + "\nDate Reg: "+dateReg + "\nOwner: "+owner + "\nState Reg: "+stateReg;
    }
}
