/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

/**
 *
 * @author m
 */
//import com.mycompany.project1.car;
// import com.mycompany.project1.Book;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Project1 {
    public static void main(String[] args) {
        

        System.out.println("Hello World!" );
          car bmw =new car("r3","red",230);
          System.out.println(bmw.getspeed()); 
          
         Book book = new Book("the way", "waled", "12of-33ss", 20, 23);
          System.out.println(book.getTitle());
        
        Customer c1= new Customer(1,"waled","+201110166541","waledzaki@gmail.com","ss",123.43);
         System.out.println("the name of client is: " +c1.get_name());
         
         Employee E1 =new Employee(44,"fathy","dd22","1233","director");
         System.out.println("the name of employee:" + E1.get_name());
         
         OrderItem i1= new OrderItem(book,2,46);
         OrderItem i2= new OrderItem(book,2,46);
         System.out.println(" this order for book " + i1.get_book().getTitle());
         ArrayList<OrderItem>items= new ArrayList<>();
         items.add(i1);
         items.add(i2);
         Order order =new Order(33,LocalDateTime.now(),c1,44.40,items);
         System.out.println(order.get_order_date());
         
         Payment p = new Payment(22, order,LocalDateTime.now(),555.66,"vodafone cash");
         
         System.out.println(p.get_amount());
         
         
    }
}
