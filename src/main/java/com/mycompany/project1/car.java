/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author m
 */
public class car {
    private String color;
    private String model;
    private int speed;
    
    public car(String model,String color,int speed)
    {
        this.color=color;
        this.model=model;
        this.speed=speed;
        
    }
    
    public void  setspeed(int speed)
    {
        this.speed=speed;
    }
      public int getspeed()
    {
         return speed;
        
    }
    
    public void setcolor(String color)
    {
        this.color=color;
        
    }
      public String getcolor(String color)
    {
        return color;
        
    }
    
      public void setmodel(String model)
    {
        this.model=model;
        
    }
     
        public String setmodel()
    {
        return model;
        
    }
    
}
