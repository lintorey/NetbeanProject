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
public class SUKSIS {
    String name;
    char gender;
    double weight,height;
    
    //default constructor
    public SUKSIS(){
        name = " ";
        gender = ' ';
        weight = 0;
        height = 0;
    }
    
    //normal constructor
    public SUKSIS(String name, char gender, double weight, double height){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    
    //setter
    public void SUKSIS(String nm, char gen, double kg, double cm){
        name = nm;
        gender = gen;
        weight = kg;
        height = cm;
    }
    
    //getter
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    
    //printer
    public String toString(){
        return "\n Name : " + name + "\n Gender [F] @ [M] : " + gender + "\n Weight : " + weight + "\n Height : " + height;
    }

    boolean getQualified() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
