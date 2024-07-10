package com.mycompany.project1;


import com.mycompany.project1.Customer;
import com.mycompany.project1.OrderItem;
import java.time.LocalDateTime;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author m
 */
public class Order {
    int orderid;
    LocalDateTime order_date;
    Customer c;
    double total_amount;
    ArrayList<OrderItem> items;
    
   public Order(int orderid,LocalDateTime order_date,Customer c,double total_amount,ArrayList<OrderItem> items)
   {
       this.orderid=orderid;
       this.c=c;
       this.order_date=order_date;
       this.items=items;
       this.total_amount=total_amount;
   }
    
     public void set_orderid(int orderid)
    {
        this.orderid=orderid;
    }
    
    public int get_orderid()
    {
        return orderid;
    }
      public void set_order_date(LocalDateTime order_date)
    {
        this.order_date=order_date;
    }
    
    public LocalDateTime get_order_date()
    {
        return order_date;
    }
      public void set_c(Customer c)
    {
        this.c=c;
    }
    
    public Customer get_customer()
    {
        return c;
    }
      public void set_total_amount(double total_amount)
    {
        this.total_amount=total_amount;
    }
    
    public double get_total_amount()
    {
        return total_amount;
    }
      public void set_items(ArrayList<OrderItem> items)
    {
        this.items=items;
    }
   

    
}
