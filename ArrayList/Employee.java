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
public class Employee {

    static int getSalary;
    
    String name;
    int empId;
    int hireYear;
    int hourWork;
    double rate;
    double salary;
    
    //default constructor
    public Employee(){
        name = " ";
        empId = 0;
        hireYear = 0;
        hourWork = 0;
        rate = 0;
        salary = 0;
    }
    
    //normal constructor
    public Employee(String name, int empId, int hireYear, int hourWork, double rate, double salary){
        this.name = name;
        this.empId = empId;
        this.hireYear = hireYear;
        this.hourWork = hourWork;
        this.rate = rate;
        this.salary = salary;
        
    }
    
    //mutator
    public void Employee(String nm, int id, int year, int hour, double rm, double sal){
        name = nm;
        empId = id;
        hireYear = year;
        hourWork = hour;
        rate = rm;
        this.salary = sal;
        
    }
    
    //accessor
    public String getName(){
        return name;
    }
    public int getEmpId(){
        return empId;
    }
    public int getHireYear(){
        return hireYear;
    }
    public int getHourWork(){
        return hourWork;
    }
    public double getRate(){
        return rate;
    }
    public double getSalary(){
        return salary;
    }
    
    //print
    public String toString(){
        return " \n Name : " + name + "\n Employee ID : " + empId + "\n Hire Year : " + hireYear + "\n Hour Work : " + hourWork + "\n Rate : RM  " + rate; 
    }
    
    //calSalary
    public void calSalary(int salary,int hourWork, int rate){
        salary = (int) (hourWork * rate);
        System.out.println(salary);

    }
   
}
