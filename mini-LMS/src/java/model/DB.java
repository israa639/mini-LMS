/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author source
 */
public class DB {
    
    private final String user="root";
    private final String pass="";
    private final String address="jdbc:mysql://localhost:3306/oop_coursera?zeroDateTimeBehavior=convertToNull";
    
    
    
    public Connection getConnection() throws SQLException
    {
         try 
         {
            Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException ex)
         {
             Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
         }
             return DriverManager.getConnection(address, user, pass);
    }
    
    
    public boolean select(String tableName,String[]values,String[]parameters) throws SQLException //return true or false
    {
        Connection conn = getConnection();
    
        String stat="select * from "+tableName+" WHERE ";
        for(int i=0;i<values.length-1;i++)
        {
            stat+=parameters[i]+" = \'"+values[i]+"\' "; 
            stat +=" AND ";
        }
        stat+=parameters[values.length-1]+" = \'"+values[values.length-1] +"\' ";
        
           PreparedStatement ps;
            ResultSet rs;
            boolean exist = true;

         try
         {
            ps = getConnection().prepareStatement(stat);  
            rs = ps.executeQuery();
                     
            if(rs.next())
            {
                exist = true;
            }
            else
            {
                exist = false;
            }
                 
                 
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }
         
         return exist;
    }    
    public ResultSet selectRS(String tableName) throws SQLException //return table
    {
        Connection conn = getConnection();
    
        String stat="select * from "+tableName;
            
           PreparedStatement ps;
            ResultSet rs = null;

         try
         {
            ps = getConnection().prepareStatement(stat);  
            rs = ps.executeQuery();                 
                 
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }
         
         return rs;
    }
    public int selectN(String tableName) throws SQLException //return number of rows
    {
        Connection conn = getConnection();
    
        String stat="select count(*) from "+tableName;

           PreparedStatement ps;
           ResultSet rs = null;
           int count = 0;
         try
         {
            ps = getConnection().prepareStatement(stat);  
            rs = ps.executeQuery();
            rs.next();
            count = rs.getInt(1);
                 
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }
         
         return count;
    }    
    public String selectString(String tableName,String idColName, String id, String returnCol) throws SQLException //return data in form of string
    {
    Connection conn = getConnection();
    
        String stat="select * from "+tableName+" WHERE ";
        stat+=idColName+" = \'"+id +"\' ";
        
           PreparedStatement ps;
           ResultSet rs = null;
           String result = "";
         try
         {
            ps = getConnection().prepareStatement(stat);  
            rs = ps.executeQuery();  
            if(rs.next())
            {
                result = rs.getString(returnCol);
            }
                 
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }
         
         return result;  
    }
    public int selectInt(String tableName,String idColName, String id, String returnCol) throws SQLException //return data in form of integer
    {
    Connection conn = getConnection();
    
        String stat="select * from "+tableName+" WHERE ";
        stat+=idColName+" = \'"+id +"\' ";
        
           PreparedStatement ps;
           ResultSet rs = null;
           int result = 0;
         try
         {
            ps = getConnection().prepareStatement(stat);  
            rs = ps.executeQuery();  
            if(rs.next())
            {
                result = rs.getInt(returnCol);
            }
                 
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }
         
         return result;  
    }
    
    
    public boolean insert(String tableName,String[] values)
    {
     String insertStatement="Insert Into "+tableName+" Values(";
     for(int i=0;i<values.length;i++)
     {
         insertStatement+="?,";
     }
     insertStatement=insertStatement.substring(0,insertStatement.length()-1)+")";//substring truncate the string (0,6) from index zero to the sixth caracters
       try {

           PreparedStatement ps=getConnection().prepareStatement(insertStatement);
           for(int i=1;i<=values.length;i++)
               ps.setString(i, values[i-1]);
              
           ps.executeUpdate();
           getConnection().close();
           return true;
       } catch (SQLException ex) {
                     
                     ex.getMessage();return false;
       }
     
 }
    public boolean insert(String tableName,String[] values,String[] parameters)
    {
     String insertStatement="Insert Into "+tableName+"(";
     for(int i=0;i<values.length-1;i++)
        {
            insertStatement +=parameters[i] + ", ";
        }
        insertStatement += parameters[values.length-1]+" )";
        
        insertStatement+="values(";
      for(int i=0;i<values.length-1;i++)
        {
            insertStatement+="?,";    
        }   
           insertStatement += "? )";
    try {
        PreparedStatement ps=this.getConnection().prepareStatement(insertStatement);
        for(int i=1;i<=values.length;i++)
               ps.setString(i, values[i-1]);
              
           ps.executeUpdate();
           getConnection().close();
           return true;
       } catch (SQLException ex) {
                     
                   System.out.println(ex.getMessage());
                     return false;
       }
 }
    public boolean insertFK(String tableName,String[] values,String[] parameters,String[] fKeyTable, String[] fKeyCol,String[] fKeySelectCol, String[] fKeySelectVal)//insert with foreign key
    {
        String insertStatement="Insert Into "+tableName+" ( ";
        for(int i=0;i<values.length;i++)
        {
            insertStatement +=parameters[i] + ", ";
        }
         for(int i=0;i<fKeyCol.length-1;i++)
        {
        insertStatement += fKeyCol[i]+", ";
        }
        insertStatement += fKeyCol[fKeyCol.length-1]+" )";
         
        insertStatement+=" values (";
        for(int i=0;i<values.length;i++)
        {
            insertStatement+=" \'"+values[i] + "\' ,";    
        }
        for(int i=0;i<fKeyCol.length-1;i++)
        {
           String selectStatement = "(select "+fKeyCol[i]+" from "+fKeyTable[i]+" where "+fKeySelectCol[i]+" = \'"+fKeySelectVal[i]+"\' )";
           insertStatement += selectStatement+" ,";
        }  
           String selectStatement = "(select "+fKeyCol[fKeyCol.length-1]+" from "+fKeyTable[fKeyCol.length-1]+" where "+fKeySelectCol[fKeyCol.length-1]+" = \'"+fKeySelectVal[fKeyCol.length-1]+"\' )";
           insertStatement += selectStatement+" )";
                
        try {
        PreparedStatement ps=this.getConnection().prepareStatement(insertStatement);        
           ps.executeUpdate();
           getConnection().close();
           return true;
       } catch (SQLException ex) {
                     
                    System.out.println(ex.getMessage());
                     return false;
       }       
    }
    
    
    public void update(String tableName,String[]values,String[]columns,String pkCol, String pkVal) throws SQLException
    {
         Connection conn = getConnection();
         String stat = "update "+tableName+" set ";
         for(int i=0;i<values.length-1;i++)
         {
             stat+= columns[i]+" = \'"+values[i]+"\' , ";
         }
         stat+= columns[values.length-1]+" = \'"+values[values.length-1]+"\' ";          
         stat+= " where "+pkCol+" = \'"+pkVal+"\'";
         
          PreparedStatement ps;
         try
         {
            ps = getConnection().prepareStatement(stat);
            ps.executeUpdate();
                        getConnection().close();
            }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }        
    }
    public boolean update1(String tableName,String[]values,String[]columns,String pkCol, String pkVal) throws SQLException
    {
        boolean check=false;
         Connection conn = getConnection();
         String stat = "update "+tableName+" set ";
         for(int i=0;i<values.length-1;i++)
         {
             stat+= columns[i]+" = \'"+values[i]+"\' , ";
         }
         stat+= columns[values.length-1]+" = \'"+values[values.length-1]+"\' ";          
         stat+= " where "+pkCol+" = \'"+pkVal+"\'";
         
          PreparedStatement ps;
         try
         {
            ps = getConnection().prepareStatement(stat);
            ps.executeUpdate();
                        getConnection().close();
                        check=true;
            }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }        
         return check;
    }
    public void updateFK(String tableName,String[]values,String[]columns,String pkCol, String pkVal,String[] fKeyTable, String[] fKeyCol,String[] fKeySelectCol, String[] fKeySelectVal) throws SQLException //update with foreign key
    {
         Connection conn = getConnection();
         String updateStatement = "update "+tableName+" set ";
         for(int i=0;i<values.length;i++)
         {
             updateStatement+= columns[i]+" = \'"+values[i]+"\' , ";
         }
         for(int i=0;i<fKeyCol.length-1;i++)
        {
           String selectStatement = "(select "+fKeyCol[i]+" from "+fKeyTable[i]+" where "+fKeySelectCol[i]+" = \'"+fKeySelectVal[i]+"\' )";
           updateStatement += fKeyCol[i] +" = "+selectStatement+" ,";
        }  
         String selectStatement = "(select "+fKeyCol[fKeyCol.length-1]+" from "+fKeyTable[fKeyCol.length-1]+" where "+fKeySelectCol[fKeyCol.length-1]+" = \'"+fKeySelectVal[fKeyCol.length-1]+"\' )";
         updateStatement += fKeyCol[fKeyCol.length-1] +" = "+selectStatement;
         updateStatement+= " where "+pkCol+" = \'"+pkVal+"\'";
   
          PreparedStatement ps;
         try
         {
            ps = getConnection().prepareStatement(updateStatement);
            ps.executeUpdate();
            getConnection().close();
            }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }        
    }
      
      
    public void delete(String tableName,String[]values,String[]columns) throws SQLException    
    {
       Connection conn = getConnection();
         String deleteStatement="delete * from "+tableName+" WHERE ";
        for(int i=0;i<values.length-1;i++)
        {
            deleteStatement+=values[i]+" = \'"+columns[i]+"\' "; 
            deleteStatement +=" AND ";
        }
        deleteStatement+=values[values.length-1]+" = \'"+columns[values.length-1] +"\' ";
        
           PreparedStatement ps;

         try
         {
            ps = getConnection().prepareStatement(deleteStatement);
            ps.executeUpdate();
            getConnection().close();             
         }
         catch (SQLException ex)
         {
            System.out.print(ex.getMessage());
         }              
    }       
}
