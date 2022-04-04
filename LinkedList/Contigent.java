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
public class Contigent {
    String state;
    int numGold, numSilver, numBronze;
    
    public Contigent(){
        state = " ";
        numGold = 0;
        numSilver = 0;
        numBronze = 0;
    }
    
    public Contigent(String state, int numGold, int numSilver, int numBronze){
        this.state = state;
        this.numGold = numGold;
        this.numSilver = numSilver;
        this.numBronze = numBronze;
    }
    
    public void setContigent (String st, int gold, int silver, int bronze){
        state = st;
        numGold = gold  ;
        numSilver = silver; 
        numBronze = bronze;
    }
    
    public String getState(){
        return state;
    }
    public int getNumGold(){
        return numGold;
    }
    public int getNumSilver(){
        return numSilver;
    }
    public int getNumBronze(){
        return numBronze;
    }
    
    public String toString(){
        return "\n State : " + state + " Number Of Gold : " + numGold + " Number Of Silver : " + numSilver + " Number Of Bronze : " + numBronze;
    }

    int getnumGold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
