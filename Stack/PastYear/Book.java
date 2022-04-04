/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.PastYear;

/**
 *
 * @author lintorey
 */
public class Book {
    private String serielNum;
    private String title;
    private double price;
    private String author;
    private String publisher;
    
    //default constructor
    public Book(){
        serielNum = " ";
        title = " ";
        price = 0.0;
        author = " ";
        publisher = " ";
    }
    
    //normal constructor
    public Book(String serielNum, String title, double price, String author, String publisher){
        this.serielNum = serielNum;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
    }
            
    //setter
    public void Book(String no, String ti, double rm, String au, String pub){
        serielNum = no;
        title = ti;
        price = rm;
        author = au;
        publisher = pub;
    }
    
    //getter
    public String getSerielNum(){
        return serielNum;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    
    //printer
    public String toString(){
        return "\nSeriel Num: " + serielNum + "\nTitle: " + title + "\nPrice:RM " + price + "\nAuthor: " + author + "\nPublisher: " + publisher;
    }
}
