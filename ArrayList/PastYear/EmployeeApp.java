/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist.PastYear;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class EmployeeApp {
    public static void main(String[] args) {
    //Question Number 1
        ArrayList listEmployee = new ArrayList(); //default value 10
        Scanner scan = new Scanner(System.in);

        //Question Number 2
        for(int i = 0; i<2; i++)
        {
                System.out.print("Enter Employee Name : ");
                String en = scan.next();
                System.out.print("Enter number of day work : ");
                int dw = scan.nextInt();
                System.out.print("Enter rate per day : RM  ");
                double rpd = scan.nextDouble();

                Employee emp = new Employee(en,dw,rpd);
                listEmployee.add(i, emp);
        }
  
        //Question Number 3
        System.out.print("Enter Employee name that you want to search : ");
        String find = scan.next();

        for(int m = 0; m < listEmployee.size(); m++){
            Object obj = listEmployee.get(m);
            Employee em = (Employee)obj;
            boolean flag = true;
            if(em.getEmpName().equals(find) && flag == true){
                    System.out.println(em.toString());
            }
            else if(flag = false){
                    System.out.println("Record not found !");
            }
        }
        
        ArrayList highPayList = new ArrayList();
        for(int l = 0; l < listEmployee.size(); l++){
            Employee e = (Employee) listEmployee.get(l);
            if (e.getRatePerDay() > 5000){
                highPayList.add(l);
            }
        }
    }
}
