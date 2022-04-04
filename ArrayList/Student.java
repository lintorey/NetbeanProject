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
public class Student {
    private String sname;
    private String sid;
    
    //default constructor
    public Student(){
        sname = " ";
        sid = " ";
    }
    
    //normal constructor
    public Student(String name, String id){
        sname = name;
        sid = id;
    }
    
    //setter method
    public void setsname(String name){ 
        sname = name; 
    }
    public void setsid(String id){ 
        sid = id; 
    }
    
    //getter method
    public String getsname(){ 
        return sname; 
    }
    public String getsid(){ 
        return sid; 
    }
    
    //to String method
    public String toString(){
        return "\n Student ID : " + sid + "\n Student Name : " + sname;
    }

    double getcgpa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getpart() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean getname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
