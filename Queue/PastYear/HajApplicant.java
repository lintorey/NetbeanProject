/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue.PastYear;

/**
 *
 * @author lintorey
 */
public class HajApplicant {
    private String name;
    private double money;
    private int age;
    private boolean firstHaj;
    
    //default constructor
    public HajApplicant(){
        name = " ";
        money = 0.0;
        age = 0;
        firstHaj = true;
    }
    
    //normal costructor
    public HajApplicant( String name, double money, int age, boolean firstHaj ) {
        this.name = name;
        this.money = money;
        this.age = age;
        this.firstHaj = firstHaj;
    }
    
    //setter
    public void HajApplicant( String nm, double rm, int old, boolean st){
        name = nm;
        money = rm;
        age = old;
        firstHaj = st;
    }
    
    //getter
    public String getName(){
        return name;
    }
    public double getMoney(){
        return money;
    }
    public int getAge(){
        return age;
    }
    public boolean getFirstHaj(){
        return firstHaj;
    }
    
    //printer
    public String toString(){
        return "\nName : "+name + "\nMoney : RM "+money + "\nAge : "+age + "\nFirst Haj ? : "+firstHaj;
    }
}
