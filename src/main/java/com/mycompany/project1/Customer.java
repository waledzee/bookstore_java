/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author m
 */
public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String address;
    private double account_balance;
    
    public Customer(int id,String name,String phone,String email,String address,double account_balance)
    {
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
        this.account_balance=account_balance;
    }
    
    public void set_id(int id)
    {
        this.id=id;
    }
    public int get_id()
    {
        return id;
    }
      public void set_name(String name)
    {
        this.name=name;
    }
      public String get_name()
    {
        return name;
    }
     public void set_phone(String phone)
    {
        this.phone=phone;
    }
     public String get_phone()
    {
        return phone;
    }
     
       public void set_address(String address)
    {
        this.address=address;
    }
       public String get_address()
    {
        return address;
    }
         public void set_email(String email)
    {
        this.email=email;
    }
         public String get_email()
    {
        return email;
    }
        public void set_account_balance(double account_balance)
    {
        this.account_balance=account_balance;
    }
        public double get_account_balance()
    {
        return account_balance;
    }
}
