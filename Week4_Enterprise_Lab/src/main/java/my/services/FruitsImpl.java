/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import com.models.Fruits;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;

/**
 *
 * @author khushpreetkaurgulati
 */
@WebService(endpointInterface="my.interfaces.IFruits")
public class FruitsImpl {
     public List<Fruits> getAllFruits()
     {
         List<Fruits> fruits = new ArrayList();
            try {
         Connection conn = initiateDBConnection();
         ResultSet rs = null;
         String query = "Select * from  Enterprise_Lab1.fruits";     
         Statement stmt;
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
         while(rs.next())
         {
             fruits.add(new Fruits(rs.getString("id"),rs.getString("name"),rs.getDouble("price")));
         }
         rs.close();
         conn.close(); 
         } catch (SQLException ex) {
             Logger.getLogger(FruitsImpl.class.getName()).log(Level.SEVERE, null, ex);
         }    
      return fruits;  
     }
     
    
 
     
     public List<Fruits> getAllFruitsByChar(String c)
     {      
         List<Fruits> fruits = new ArrayList();
            try {
         Connection conn = initiateDBConnection();
         ResultSet rs = null;   
        
         String query = "Select * from  Enterprise_Lab1.fruits WHERE name LIKE " + "'" +c+ "%'";    
         Statement stmt;
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
         while(rs.next())
         {
             fruits.add(new Fruits(rs.getString("id"),rs.getString("name"),rs.getDouble("price")));
         }
         rs.close();
         conn.close(); 
         } catch (SQLException ex) {
             Logger.getLogger(FruitsImpl.class.getName()).log(Level.SEVERE, null, ex);
         }    
      return fruits;  
     }
     
      public Boolean Login(String username, String password)
     {
         Boolean isValidUser = false;
     
          try {
         Connection conn = initiateDBConnection();
         String query = "Select * from  Enterprise_Lab1.login WHERE username = ? and password = ? ";    
     PreparedStatement ps = conn.prepareStatement(query);
     ps.setString(1, username);
     ps.setString(2,password);
     
     ResultSet rs = ps.executeQuery();
     
     while(rs.next())
     {
         isValidUser = true;
     }
     ps.close();
     conn.close();
         
     }
       catch (SQLException ex) {
             Logger.getLogger(FruitsImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
          return isValidUser;
          }
       
     
//jdbc:mysql://localhost:3306/Enterprise_Lab1?zeroDateTimeBehavior=CONVERT_TO_NULL
  private Connection initiateDBConnection()   
  {
      Connection conn = null;
        try {
      String db_URL, db_Username, db_Password;
      
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(FruitsImpl.class.getName()).log(Level.SEVERE, null, ex);
          }
      db_URL = "jdbc:mysql://localhost:3306/Enterprise_Lab1?allowPublicKeyRetrieval=true&useSSL=false";
      db_Username = "root";
      db_Password = "Khush@1999";
             conn = DriverManager.getConnection(db_URL,db_Username,db_Password);
         } catch (SQLException ex) {
             Logger.getLogger(FruitsImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
      return conn;
  }
     
}
    
 