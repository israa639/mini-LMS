/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author source
 */
public abstract class user implements userInterface  {
    
  static private int id;
  static private String name;
  static private String email;
  static private String password;
  static private String gender;
  static public String uType ;
  DB db;
   

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public user()
    {
       db=new  DB(); 
    }  
    public user(String email,String password)
    { 
        this();
        setEmail(email);
        setPassword(password);   
        
    }  public user(String name, String password, int id, String email, String gender) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.email = email;
        this.gender = gender;
    }
    
    public boolean login(String tableName, String[]values , String[]parameters) throws SQLException
    {
        return db.select(tableName, values, parameters);               
    }
    
    public boolean signup(String tableName, String[]values, String[]parameters) throws SQLException
    {     
        return db.insert(tableName, values, parameters);
    }
    
   abstract public boolean editprofile(String tablename, String[] values, String pkCol) throws SQLException;
}
