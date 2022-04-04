/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author user
 */
public class StudentEvent {
    private String eventName;
    private String organizer;
    private String venue;
    private double budget;
    private boolean status;
    
    //default constructor
    public StudentEvent(){
        eventName = " ";
        organizer = " ";
        venue = " ";
        budget = 0;
        status = true;
    }
    
    //normal constructor
    public StudentEvent(String eventName, String organizer, String venue, double budget, boolean status){
        this.eventName = eventName;
        this.organizer = organizer;
        this.venue = venue;
        this.budget = budget;
        this.status = status;
    }
    
    //setter
    public void StudentEvent(String nm, String or, String ve, double rm, boolean st){
        this.eventName = nm;
        this.organizer = or;
        this.venue = ve;
        this.budget = rm;
        this.status = st;
    }
    
    //getter
    public String getEventName(){
        return eventName;
    }
    public String getOrganizer(){
        return organizer;
    }
    public String getVenue(){
        return venue;
    }
    public double getBudget(){
        return budget;
    }
    public boolean getStatus(){
        return status;
    }
    
    //print
    public String toString(){
        return "\n Event Name : " + eventName + "\n Organizer : " + organizer + "\n Venue : " + venue + "\n Budget : RM " + budget + "\n Status : " + status;
    }
}
