/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList.PastYear;

import ArrayList.PastYear.Doctor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.Scanner;
/**
 *
 * @author ACER
 */

public class DoctorMain {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
       //a)	Declare and create an ArrayList named doctorList
        ArrayList doctorList = new ArrayList();
        
        //b)	Insert 10 records of doctors into doctorList
        for (int i=1; i<=10; i++)
        { 
            String dn = JOptionPane.showInputDialog("Enter Doctor Name : " );
            char ds = JOptionPane.showInputDialog("Enter docSpecialty " ).charAt(0);
            int year = Integer.parseInt (JOptionPane.showInputDialog("Enter Doctor Year Service : " ));
            
            Doctor doc = new Doctor (dn, ds, year);
            doctorList.add(doc);
        }
        //c)	Display all elements in doctorList.
        System.out.println (doctorList);
        
        for (int i=0; i<doctorList.size(); i++)
        {
            Doctor D = (Doctor) doctorList.get(i);
            System.out.println(D.toString());
        }
        
        String dn = " ";
        char ds = ' ';
        
        //Display all element in doctorList
        for (int i=0; i<doctorList.size(); i++)
        {
            Doctor D = (Doctor) doctorList.get(i);
            System.out.println(D.toString());
            //if(D.getdocSpecialty() =='C' || D.getdocSpecialty() =='c'){    
        }
        
        //Find and delete the record of doctors from who are the specialists in neurology with less than 5 years of services.
        System.out.println("Enter Doctor Neurology Name that you want search ? : ");
        String findoc = scan.next();
        
        for (int m=0; m<doctorList.size(); m++){
            Doctor doc = (Doctor)doctorList.get(m);
            if(doc.getdocSpecialty() == 'N' || doc.getdocSpecialty() == 'n'){
                if(doc.getdocYearService() < 5){
                    doctorList.remove(m);
                }
            }
        }
        
        //Find and display 
        System.out.println("Enter Doctor Name that you want search ? : ");
        String find = scan.next();
        
        for (int k=0; k<doctorList.size(); k++){
            Object obj = doctorList.get(k);
            Doctor dr = (Doctor)obj;
            boolean flag = true;
            if(dr.getdocName().equals(find) && flag == true){
                System.out.println(dr.toString());
            }
            else if (flag = false){
                    System.out.println("Record Not Found");
                    }
        }
        
        //Count and display how many doctors’ specialty in cardiology
        int count = 0;
        for (int l=0; l<doctorList.size(); l++){
            Doctor d = (Doctor)doctorList.get(l);
            if(d.getdocSpecialty() == 'C' || d.getdocSpecialty() == 'c'){
                count++;
            }
            System.out.println("Total Doctor Speciality In Cardiology : " + count);
        }
        
        //Display the details of doctor that has served the longest
        int maxServed = 0;
        for (int s=0; s<doctorList.size(); s++){
            Doctor d = (Doctor)doctorList.get(s);
            if(d.getdocYearService() > 5){
                System.out.println(d.toString());
            }
        }
        
        
        int[] num = new int[10];
        //Ask user to insert 10service
        System.out.print("\nlease Service Year");
        System.out.println("\nService Year:");
        int temp=0;
        //int item = 0;
        for(int i=0; i<num.length; i++){
        num[i] = scan.nextInt();
        }
        //Displaying elements of original array
        System.out.println("\nList Service Year: ");
        for (int i = 0; i < num.length; i++) {
        System.out.print(num[i] + " ");
        }
        //Sort the number in descending order using either insertion / bubble sort
        for (int i = 0; i < num.length; i++) {
        for (int j = 1+i; j < num.length; j++) {
        if(num[i] > num[j]) {
        temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        
        
        }
       }
      }
        System.out.println();
         //Displaying elements of array after sorting
        System.out.println("\nNumber was sorted in ascending order: ");
        for (int i = 0; i < num.length; i++) {
        System.out.print(num[i] + " ");
        }
        
    }    
}
