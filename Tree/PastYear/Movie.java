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
public class Movie {
    private int ID;
    private String movieTitle;
    private String director;
    private String genre;
    private double totalCollection;
    
    public Movie(){
        ID = 0;
        movieTitle = " ";
        director = " ";
        genre = " ";
        totalCollection = 0.0;
    }
    
    public Movie(int ID,String movieTitle,String director,String genre,double totalCollection){
        this.ID = ID;
        this.movieTitle = movieTitle;
        this.director = director;
        this.genre = genre;
        this.totalCollection = totalCollection;
        
    }
    
    public void setMovie(int id,String mt,String di,String ge,double rm){
        ID = id;
        movieTitle = mt;
        director = di;
        genre = ge;
        totalCollection = rm;
        
    }
    
    public int getID(){
        return ID;
    }
    public String getMovieTitle(){
        return movieTitle;
    }
    public String getDirector(){
        return director;
    }
    public String getGenre(){
        return genre;
    }
    public double getTotalCollection(){
        return totalCollection;
    }
    
    public String toString(){
        return "\nID : " + ID + "\nMovie Title : " + movieTitle + "\nDirector : " + director + "\nGenre : " + genre + "\nTotal Collection : " + totalCollection;
    }
}
