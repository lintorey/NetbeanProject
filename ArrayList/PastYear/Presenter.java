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
public class Presenter {
    private String name;
    private String affiliation;
    private String paperId;
    private boolean paymentStatus;
    
    public Presenter(){
        name = " ";
        affiliation = " ";
        paperId = " ";
        paymentStatus = true;
    }
    
    public Presenter (String name, String affiliation, String paperId, boolean paymentStatus){
        this.name = name;
        this.affiliation = affiliation;
        this.paperId = paperId;
        this.paymentStatus = paymentStatus;
    }
    
    public void Presenter (String nm, String aff, String id, boolean pay){
        name = nm;
        affiliation = aff;
        paperId = id;
        paymentStatus = pay;
    }
    
    public String getName(){
        return name;
    }
    public String getAffilation(){
        return affiliation;
    }
    public String getPaperId(){
        return paperId;
    }
    public boolean getPaymentStatus(){
        return paymentStatus;
    }
    
    public String toString(){
        return "\n Name:" + name + "\nAffiliation:" + affiliation + "\nPaper Id:" + paperId + "Payment Status:" + paymentStatus;
    }
}
