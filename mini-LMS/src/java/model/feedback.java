package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author source
 */
public class feedback {
   private  int ID;
   private String Course_code;
   private String content;

   public feedback()
   {
   }
    public feedback( String Course_code, String content) {
        this.Course_code = Course_code;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCourse_code() {
        return Course_code;
    }

    public void setCourse_code(String Course_code) {
        this.Course_code = Course_code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
      
   
}