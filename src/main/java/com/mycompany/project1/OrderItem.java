/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author m
 */
public class OrderItem {
    
Book b;
int quantity;
double price;
 
 public OrderItem(Book b, int quantity,double price)
 {
      
        this.b=b;
        this.quantity=quantity;
        this.price=price;
 }
 
   public void set_book(Book b)
    {
        this.b=b;
    }
    
    public Book get_book()
    {
        return b;
    }
      public void set_quantity(int quantity)
    {
        this.quantity=quantity;
    }
    
    public int get_quantity()
    {
        return quantity;
    }
       public void set_price(double price)
    {
        this.price=price;
    }
    
    public double get_price()
    {
        return price;
    }
    
    
}
