/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

import java.time.LocalDateTime;

/**
 *
 * @author m
 */
public class Payment {
      int payment_id;
    Order order;
    LocalDateTime date;
    double amount;
    String payment_method;
    
    public Payment(int payment_id,Order order,LocalDateTime date, double amount,String payment_method )
    {
        this.payment_id=payment_id;
        this.order=order;
        this.date=date;
        this.amount=amount;
        this.payment_method=payment_method;
        
        
    }
    
      public void set_payment_id(int payment_id)
    {
        this.payment_id=payment_id;
    }
     public int get_payment_id()
    {
        return payment_id;
    }
       public void set_order(Order order)
    {
        this.order=order;
    }
     public Order get_order()
    {
        return order;
    }
       public void set_date(LocalDateTime date)
    {
        this.date=date;
    }
     public LocalDateTime get_date()
    {
        return date;
    }
       public void set_amount(double amount)
    {
        this.amount=amount;
    }
     public double get_amount()
    {
        return amount;
    }
       public void set_payment_method(String payment_method)
    {
        this.payment_method=payment_method;
    }
     public String get_payment_method()
    {
        return payment_method;
    }
    
}
