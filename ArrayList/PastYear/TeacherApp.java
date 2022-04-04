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
public class TeacherApp {
    public static void main(String[] args) {
        ArrayList myTeachers = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<2; i++){
            System.out.print("Enter Teacher Name : ");
            String name = sc.next();
            System.out.print("Enter School Name : ");
            String sname = sc.next();
            System.out.print("Enter Gender [F]-Female & [M]-Male : ");
            char gen = sc.next().charAt(0);
            System.out.print("Enter Age : ");
            int old = sc.nextInt();
            
            //object
            Teacher tc = new Teacher(name,sname,gen,old);
            myTeachers.add(i,tc);
           
        }
        
        int maxAge = 0;
        String name = " ";
        for(int m = 0; m < myTeachers.size(); m++){
            Teacher teacher = (Teacher) myTeachers.get(m);
            if (teacher.getGender() == 'M' || teacher.getGender() == 'm'){
                if(teacher.getSchoolName().equalsIgnoreCase("SK Sri Indera")){
                    
                }
            }
            
        }
        
        System.out.print("Enter Teacher name that you want to search : ");
        String find = sc.next();

        for(int m = 0; m < myTeachers.size(); m++){
            Object obj = myTeachers.get(m);
            Teacher tc = (Teacher)obj;
            boolean flag = true;
            if(tc.getTeacherName().equals(find) && flag == true){
                    System.out.println(tc.toString());
            }
            else if(flag = false){
                    System.out.println("Record not found !");
            }
        }
        
        System.out.print("Teacher In 55th Record Is :");
        System.out.print(myTeachers.indexOf(55));
        
        
    }
}

