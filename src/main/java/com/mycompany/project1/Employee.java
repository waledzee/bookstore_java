/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author m
 */
public class Employee {
    int id;
    String name;
    String username;
    String position;
    String password;
   
    public Employee(int id,String name,String username, String password ,String position)
    {
        this.id=id;
        this.name=name;
        this.username=username;
        this.password=password;
        this.position=position;
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
     public void set_username(String username)
    {
        this.username=username;
    }
    
    public String ge_username()
    {
        return username;
    }
     public void set_password(String password)
    {
        this.password=password;
    }
    
    public String get_password()
    {
        return password;
    }
     public void set_position(String position)
    {
        this.position=position;
    }
    
    public String get_position()
    {
        return position;
    }
}
