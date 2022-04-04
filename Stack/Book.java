/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author user
 */
public class Book {
    private String  serialNum;
    private String tittle;
    private double price;
    private String author;
    private String publisher;

    //normal
    public Book(String s, String t,double pr, String a, String p)
    {
        serialNum =s;
        tittle =t;
        price =pr;
        author=a;
        publisher =p;
    }

    //getter
    public String getSerialNum() {
        return serialNum;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTittle() {
        return tittle;
    }

    public String toString() {
        return "Book{" +
                "serialNum='" + serialNum + '\'' +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

}
