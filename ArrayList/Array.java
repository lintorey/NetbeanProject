/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Array {
    
    public static void main(String[] args) {
        ArrayList StudentList = new ArrayList(); 
        Scanner sc = new Scanner(System.in);
        
        //berapa student yang nak disimpan data
        for (int i=0; i<2; i++){
            System.out.print("sid : ");
            String sid=sc.nextLine();
            System.out.print("Name : ");
            String sname=sc.nextLine();  
            
            Student s = new Student(sname,sid);
            StudentList.add(i,s);
        }
        
        System.out.print("Enter Student name that want to search : ");
        String find = sc.next();

        for(int m = 0; m < StudentList.size(); m++){
            Object obj = StudentList.get(m);
            Student em = (Student)obj;
            boolean flag = true;
            if(em.getsname().equals(find) && flag == true){
                    System.out.println(em.toString());
            }
        }
        System.out.println("Record not found !");
    }
}

