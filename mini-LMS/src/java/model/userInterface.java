/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author source
 */
public interface userInterface {
    
    public boolean login(String tableName, String[]values , String[]parameters)throws SQLException;
    public boolean signup(String tableName, String[]values, String[]parameters)throws SQLException;
    abstract public boolean editprofile(String tablename, String[] values, String pkCol) throws SQLException;
    
}
