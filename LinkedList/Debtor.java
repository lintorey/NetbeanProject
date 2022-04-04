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
public class Debtor {
    private String name;
    private double salary;
    private double amount;
    private String category;
    
    public Debtor(){
        name = " ";
        salary = 0.0;
        amount = 0.0;
        category = " ";
    }
    
    public Debtor(String name,double salary,double amount,String category){
        this.name = name;
        this.salary = salary;
        this.amount = amount;
        this.category = category;
        
    }
    
    public void setDebtor(String nm,double sa,double rm,String cat){
        name = nm;
        salary = sa;
        amount = rm;
        category = cat;
        
    }
    
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }
    
    public String toString(){
        return "\n Name : " + name + "\n Salary : RM " + salary + "\n Amount : RM " + amount + "\n Category : " + category;
    }
}
