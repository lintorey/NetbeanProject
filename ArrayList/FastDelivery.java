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
public class FastDelivery {
    
    String custName;
    String icNo;
    String date;
    char type;
    String address;
    double weight;
    
    //default constructor
    public FastDelivery(){
        custName = " ";
        icNo = " ";
        date = " ";
        type = ' ';
        address = " ";
        weight = 0;
    }
    
    //normal constructor
    public FastDelivery(String custName,String icNo,String date,char type,String address,double weight){
        this.custName = custName;
        this.icNo = icNo;
        this.date = date;
        this.type = type;
        this.address = address;
        this.weight = weight;
        
    }
    
    //mutator
    public void FastDelivery(String nm,String ic,String dt,char tp,String add,double kg){
        custName = nm;
        icNo = ic;
        date = dt;
        type = tp;
        address = add;
        weight = kg;
        
    }
    
    //accessor
    public String getCustName(){
        return custName;
    }
    public String getIcNo(){
        return icNo;
    }
    public String getDate(){
        return date;
    }
    public char getType(){
        return type;
    }
    public String getAddress(){
        return address;
    }
    public double getWeight(){
        return weight;
    }
    
    //print
    public String toString(){
        return " \n Cust Name : " + custName + "\n IC No. : " + icNo + "\n Date : " + date + "\n Type : " + type + "\n Address : " + address + "\nWeight : " + weight; 
    }
   
}
