/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree.PastYear;

/**
 *
 * @author user
 */
public class Employee {
    private String ID;
    private String name;
    private String status;
    private String position;
    private double salary;
     
     public Employee(){
        ID = " ";
        name = " ";
        status = " ";
        position = " ";
        salary = 0;
     }

     public Employee(String ID, String name, String status, String position,double salary){
         this.ID = ID;
         this.name = name;
         this.status = status;
         this.position = position;
         this.salary = salary;
     }

     public void setEmployee(String id, String nm, String st, String pos,double rm){
        ID = id;
        name = nm;
        status = st;
        position = pos;
        salary = rm;
     }

     public String getID(){ 
         return ID; 
     }

     public String getName(){ 
         return name; 
     }
     
     public String getStatus(){ 
         return status; 
     }
     
     public String getPosition(){ 
         return position;
     }
     
     public double getSalary(){ 
         return salary;
     }


     public String toString(){ 
         return("\nID : " + ID + "\nName : " + name + "\nStatus : " + status + "\nPosition :  " + position + "\nSalary : RM  " + salary);
     }
}
