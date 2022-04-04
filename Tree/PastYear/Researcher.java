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
public class Researcher {
    private String name;
    private String institution;
    private int id;
    private String field;
    private String status;
     
     public Researcher(){
         name = " ";
         institution = " ";
         id = 0;
         field = " ";
         status = " ";
     }

     public Researcher(String name, String institution, int id, String field, String status){
         this.name = name;
         this.institution = institution;
         this.id = id;
         this.field = field;
         this.status = status;
     }

     public void setResearcher(String nm, String ins, int no, String fi, String st){
         name = nm;
         institution = ins;
         id = no;
         field = fi;
         status = st;
     }

     public String getName(){ 
         return name; 
     }

     public String getIstitution(){ 
         return institution; 
     }
     
     public int getId(){ 
         return id; 
     }
     
     public String getField(){ 
         return field; 
     }
     
     public String getStatus(){ 
         return status;
     }

     public String toString(){ 
         return("\nName : " + name + "\nInstitution : " + institution + "\nID : " + id + "\nCField :  " + field + "\nStatus : " + status);
     }
}
