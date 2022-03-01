/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author source
 */

    public class course
    {
    static private String courseCode;
    static private String courseName;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        course.courseName = courseName;
    }
    
    
    public course()
    {
       
    }
    
       
    public String generateCode()
    {
        String aToZ = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for(int y=0;y<10;y++)
        {
            int index = (int) (rnd.nextFloat() * aToZ.length());
            sb.append(aToZ.charAt(index));            
        }        
        courseCode = sb.toString();
        return courseCode;
    }
    
    
}