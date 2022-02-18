/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import my.interfaces.Fruits;

/**
 *
 * @author khushpreetkaurgulati
 */
public class HelperClass {
    
    
    public static String getHTML(List<Fruits> info, String title)
    {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
     String table = "<h1>" + title + "</h1>";
     
     table += "<table border ='1'> <tr> <th> ID </th> <th> Name </th> <th> Price </th> <th> Name </th> <th> Date </th> </tr>";
     for(Fruits i : info)
     {
         table += "<tr><td>" + i.getId() + "</td>"
                + "<td>" + i.getName() + "</td>"
                 + "<td>" + i.getPrice() + "</td>"
              +  "<td>   Khushpreet Kaur  </td>"
                 + "<td>" + dtf.format(now) + "</td></tr>";
     }
     
      table +=  "</table><a href='/Week4_Enterprise_Lab_Client/form.html'>Search Fruits By Character</a>";
      return table;
      
   
    }
    public static String getHTMLChar(List<Fruits> info, String title)
    {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
     String table = "<h1>" + title + "</h1>";
     
     table += "<table border ='1'> <tr> <th> ID </th> <th> Name </th> <th> Price </th> <th> Name </th> <th> Date </th> </tr>";
     for(Fruits i : info)
     {
         table += "<tr><td>" + i.getId() + "</td>"
                + "<td>" + i.getName() + "</td>"
                 + "<td>" + i.getPrice() + "</td>"
              +  "<td>   Khushpreet Kaur  </td>"
                 + "<td>" + dtf.format(now) + "</td></tr>";
     }
     
      table +=  "</table>";
      return table;
      
 
    }

}
