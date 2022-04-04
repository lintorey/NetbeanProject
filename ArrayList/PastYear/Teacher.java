/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist.PastYear;

/**
 *
 * @author user
 */
public class Teacher {
    private String teacherName;
    private String schoolName;
    private char gender;
    private int age;
    
    //normal constructor
    public Teacher(String name, String sname,char gen, int old){
        teacherName = name;
        schoolName = sname;
        gender = gen;
        age = old;
    }
    
    //accessors
    public String getTeacherName(){ 
        return teacherName; 
    }
    public String getSchoolName(){ 
        return schoolName; 
    }
    public int getGender(){ 
        return gender; 
    }
    public int getAge(){ 
        return age; 
    }
    
    //printer
	public String toString(){
            return "\n Teacher Name : " + teacherName + "\n School Name : " + schoolName + "\n Gender : " + gender + "\n Age : " + age;
        }
}
