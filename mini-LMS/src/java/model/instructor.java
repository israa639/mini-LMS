/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author source
 */
public class instructor extends user {
    
    static private String position;
 public instructor(String name, String password, int id, String email, String gender)
    {
        super(name, password, id, email, gender);
        this.position="";
        
    }
    public String getPosition() {
        return position;
    }
 
    public void setPosition(String position) {
        this.position = position;
    }
    public instructor()
    {
        
    }         
    public instructor(String email,String password)
    { 
       super(email,password); 
        
    }   
    public instructor(String name,String email,String password,String gender)
    {
        this(email,password);
        this.setName(name);
        this.setGender(gender);
        
    }
    public void create_quiz(quiz q) throws SQLException
    {
        
       String[] values= {q.getQuiz_title(),Integer.toString(q.getQuiz_grade())};
       String[] parameters= {"quiz_title","quiz_grade"};
       String[] fktable = {"course","instructor"};
       String[] fkcol = {"course_code","instructor_id"};
       String[] fksel = {"course_name","instructor_email"};
       String[] fksval = {db.selectString("course", "course_code", q.getCourse_code(), "course_Name"),db.selectString("instructor", "instructor_id",Integer.toString(q.getInstructor_id()), "instructor_email")};
       
      boolean inserted = db.insertFK("quiz", values, parameters, fktable,fkcol , fksel, fksval); 
    }    
    public void post_announcement(announcement a) throws SQLException
    { 
       String[] values= {a.getAnnouncement_title(),a.getAnnouncement_content(),a.announcement_date};
       String[] parameters= {"announcement_title","announcement_content","announcement_date"};
       String[] fktable = {"course","instructor"};
       String[] fkcol = {"course_code","instructor_id"};
       String[] fksel = {"course_name","instructor_email"};
       String[] fksval = {db.selectString("course", "course_code", a.getCourse_code(), "course_name"),db.selectString("instructor", "instructor_id",Integer.toString(a.getInstructor_id()), "instructor_email")};
       
      boolean inserted = db.insertFK("announcement", values, parameters, fktable,fkcol , fksel, fksval); 
    }     
    public void answer_question(question q) throws SQLException
    {
       String[] values= {q.getAnswer(),"true"};
       String[] columns ={"answer","is_answered"};
       String[] fktable = {"instructor"};
       String[] fkcol = {"instructor_id"};
       String[] fksel = {"instructor_email"};
       String[] fksval = {db.selectString("instructor", "instructor_id",Integer.toString(q.getInstructor_id()), "instructor_email")};
       
      
      db.updateFK("question", values, columns, "question_id", Integer.toString(q.getQuestion_id()), fktable, fkcol, fksel, fksval);
    }
   
    private void  insert_course(course c)
    {
       String[] values={c.getCourseCode(),c.getCourseName()};
       String[] parameters={"course_code","course_name"};
       
       boolean inserted = db.insert("course", values, parameters);
    }
    public void create_course(course c,int in_id) throws SQLException
    {
       insert_course(c);
       String[] values={};
       String[] parameters={};
       String[] fktable = {"course","instructor"};
       String[] fkcol = {"course_code","instructor_id"};
       String[] fksel = {"course_name","instructor_email"};
       String[] fksval = {db.selectString("course", "course_code", c.getCourseCode() , "course_Name"),db.selectString("instructor", "instructor_id", Integer.toString(in_id), "instructor_email")};
       
       boolean inserted = db.insertFK("instructor_course", values, parameters, fktable,fkcol , fksel, fksval);
        
    }
public boolean uploadmaterial(material m,InputStream inputStream,byte[] bytes) throws FileNotFoundException, SQLException
 {

       boolean Student_exist=false;
         ResultSet check;
         String message =null;
      if(m.getType().equals("pdf"))
      {
          String insertStatement="INSERT INTO `material`(`material_id`,`material_pdf`,`material_name`)";
   
     insertStatement+="VALUES(?,?,?)";
     

                 
     try {


        
            PreparedStatement ps=db.getConnection().prepareStatement(insertStatement);
              ps.setString(1,String.valueOf(m.getId()) );
               //ps.setBlob(2,is);
             //  ps.setBinaryStream(2, (InputStream)is, (int)(pdf.length()));
             if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBytes(2, bytes);
                
           //  ps.setBlob(2, inputStream);
            }
             
 
               ps.setString(3,m.getName());
//               ps.setString(4, this.getId());
//               ps.setString(5,String.valueOf(0));
//         
//                 
              int x= ps.executeUpdate();
                  if(x>0)
                  {
                Student_exist=true;
                  }
                   db.getConnection().close();
         } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
      }}
return Student_exist;
           
           
}
    @Override
    public boolean editprofile(String tablename, String[] values, String pkCol) throws SQLException {
          String coulmns[]={"instructor_name","instructor_email","instructor_password"};
     return db.update1("instructor", values, coulmns, pkCol,String.valueOf(this.getId()));
    }

}
