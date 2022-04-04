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
public class Tablet {
    //data members
	private String serialNum;
	private String manufacturer;
	private String os;
	private double price;
	
	//default constructor
	public Tablet()
	{
		serialNum = " ";
		manufacturer = " ";
		os = " ";
		price = 0.00;
	}
	
	//normal constructor
	public Tablet(String sn, String mf, String o, double p)
	{
		serialNum = sn;
		manufacturer = mf;
		os = o;
		price = p;
	}
	
	//setter method
	public void setSerialNum(String sn){ 
            serialNum = sn; 
        }
	public void setManufacturer(String mf){ 
            manufacturer = mf; 
        }
	public void setOS(String o){ 
            os = o; 
        }
	public void setPrice(double p){ 
            price = p; 
        }
	
	//getter method
	public String getSerialNum(){ 
            return serialNum; 
        }
	public String getManufacturer(){ 
            return manufacturer; 
        }
	public String getOS(){ 
            return os; 
        }
	public double getPrice(){ 
            return price; 
        }
	
	//to String method
	public String toString()
	{
            return "Serial Number : " + serialNum + "\nManufacturer : " + manufacturer + "\n Os : " + os + " \nPrice : RM " + price;
	}
}
