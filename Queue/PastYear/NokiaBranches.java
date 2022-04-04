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
public class NokiaBranches {
    String managerName;
    int no_of_Dept;
    String location;
    int no_of_worker;
    
    public NokiaBranches(){
        managerName = " ";
        no_of_Dept = 0;
        location = " ";
        no_of_worker = 0;
    }
    
    public NokiaBranches(String managerName, int no_of_Dept, String location, int no_of_worker){
        this.managerName = managerName;
        this.no_of_Dept = no_of_Dept;
        this.location = location;
        this.no_of_worker = no_of_worker;
    }
    
    public void setNokieBraches(String n, int dept, String loc, int num){
        managerName = n;
        no_of_Dept = dept;
        location = loc;
        no_of_worker = num;
    }
    
    public String getManagerName(){
        return managerName;
    }
    public int getNo_Of_Dept(){
        return no_of_Dept;
    }
    public String getLocation(){
        return location;
    }
    public int getNo_Of_Worker(){
        return no_of_worker;
    }
    
    public String toString(){
        return "\nManager Name: " +managerName + "\nNo Of Department: "+no_of_Dept + "\nLocation: "+location + "\nNo Of Worker: "+no_of_worker;
    }
}
