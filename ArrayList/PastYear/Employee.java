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
public class Employee {
    //data members
		private String empName;
		private int dayWork;
		private double ratePerDay;
		
		//default constructor
		public Employee()
		{
			empName = "   ";
			dayWork = 0;
			ratePerDay = 0.0;
		}
		
		//normal constructor
		public Employee(String en, int dw, double rpd)
		{
			empName = en;
			dayWork = dw;
			ratePerDay = rpd;
		}
		
		//setter method
		public void setEmpName(String en){ 
                    empName = en; 
                }
		public void setDayWork(int dw){ 
                    dayWork = dw; 
                }
		public void setRatePerDay(double rpd){ 
                    ratePerDay = rpd; 
                }
		
		//getter method
		public String getEmpName(){ 
                    return empName; 
                }
		public int getDayWork(){ 
                    return dayWork; 
                }
		public double getRatePerDay(){ 
                    return ratePerDay; 
                }
		
		public double calculatePay(int dw, double rpd)
		{
			double payment = 0;
			payment = dw * rpd;
			return payment;
		}
		
		//to String method
		public String toString()
		{
			return "Employee Name : "+empName+" Working Days "+dayWork+" Rate per Day "+ratePerDay+" Total Amount Pay "+calculatePay(getDayWork(), getRatePerDay());
		}
}
