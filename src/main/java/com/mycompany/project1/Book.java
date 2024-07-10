/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author m
 */
public class Book {

    public String title;
    private String author;
    private String ISBN;
    private int price;
    private int quantity;

   

    // Constructor with arguments
    public Book(String title, String author, String ISBN, int price, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantity = quantity;
    }


    
    public void set_title(String title)
    {
        this.title=title;
    }
    
    public String getTitle()
    {
        return title;
    }
     public void set_author(String author)
    {
        this.author=author;
    }
     public String get_author()
    {
        return author;
    }
      public void set_ISBN(String ISBN)
    {
        this.ISBN=ISBN;
    }
      public String get_ISBN()
    {
        return ISBN;
    }
       public void set_price(int price)
    {
        this.price=price;
    }
       public int get_price()
    {
        return price;
    }
        public void set_quantity(int quantity)
    {
        this.quantity=quantity;
    }
        public int get_quantity()
    {
        return quantity;
    }

   
}
