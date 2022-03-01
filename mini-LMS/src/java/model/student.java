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
public class student extends user {
    
   static private int academic_year;
   static private int section;
   static private String department;

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = academic_year;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public student()
    {
        
    }
    
    public student(String email,String password)
    { 
       super(email,password);     
    }
      
    public student(String name,String email,String password,String gender)
    {
        this(email,password);
        this.setName(name);
        this.setGender(gender);
        
    }
  
    public void writeQuestion(question q) throws SQLException
    {
       String[] values={q.getQuestion_subject(),q.getQuestion_content(),q.getDate(),"false"};
       String[] parameters = {"question_subject","question_content","question_date","is_answered"};
       String[] fktable = {"course","student"};
       String[] fkcol = {"course_code","student_id"};
       String[] fksel = {"course_name","student_email"};
       String[] fksval = {db.selectString("course", "course_code", q.getCourse_code(), "course_Name"),db.selectString("student", "student_id", Integer.toString(q.getStudent_id()), "student_email")};
       
       boolean inserted = db.insertFK("question", values, parameters, fktable,fkcol , fksel, fksval);
    }

    public void write_feedback(feedback f) throws SQLException
    {
       
       String[] values={f.getContent()};
       String[] parameters={"feedback_content"};
       String[] fktable = {"course"};
       String[] fkcol = {"course_code"};
       String[] fksel = {"course_name"};
       String[] fksval = {db.selectString("course", "course_code", f.getCourse_code(), "course_Name")};
       
      boolean inserted = db.insertFK("feedback", values, parameters, fktable,fkcol , fksel, fksval);
    }
    
    public void join_course(course c,int s_id) throws SQLException
    {
       String[] values={};
       String[] parameters={};
       String[] fktable = {"course","student"};
       String[] fkcol = {"course_code","student_id"};
       String[] fksel = {"course_name","student_email"};
       String[] fksval = {db.selectString("course", "course_code", c.getCourseCode() , "course_Name"),db.selectString("student", "student_id", Integer.toString(s_id), "student_email")};
       
      boolean inserted = db.insertFK("student_course", values, parameters, fktable,fkcol , fksel, fksval);
        
    }
    
    @Override
   public boolean editprofile(String tablename, String[] values, String pkCol) throws SQLException
 {
      String coulmns[]={"student_name","student_email","student_password"};
     return db.update1("student", values, coulmns, pkCol,String.valueOf(this.getId()));     
     
 }

}
