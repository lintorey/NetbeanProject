/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_And_Test;

/**
 *
 * @author user
 */
public class CovidVictim {
    private String covidName;
    private String caseId;
    private int age;
    private String clusterName;
    private String positiveDate; 
    
    public CovidVictim(){
        
        covidName = " ";
        caseId ="";
        age=0;
        clusterName = "";
        positiveDate = "";
    }
    
    public CovidVictim(String covidName,String caseId,int age,String clusterName,String positiveDate){
        this.covidName = covidName;
        this.caseId = caseId;
        this.age=age;
        this.clusterName = clusterName;
        this.positiveDate = positiveDate;
    }
     public void setCovidVictim(String nm,String id,int old,String cnm,String date){
        covidName = nm;
        caseId = id;
        age=old;
        clusterName = cnm;
        positiveDate = date;
     }
    public String getCovidName(){
        return covidName;
    }
    public String getCaseId(){
        return caseId;
    }
    public int getAge(){
        return age;
    }
    public String getClusterName(){
        return clusterName;
    }
    public String getPositiveDate(){
        return positiveDate;
    }
    
    public String toString(){
        return "\nCovid Name: "+covidName + "\nCase ID: "+caseId + "\nAge : "+age + "\nCluster Name : " + clusterName + "\nPositive Date : " + positiveDate;
    }
}
