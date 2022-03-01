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
public class quiz {
    private static int quiz_id;
    private static String quiz_title;
    private static int quiz_grade;
    private static int instructor_id;
    private static String course_code;
    public static int numberOfQ = 1;
    DB db = new DB();
    
    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public String getQuiz_title() {
        return quiz_title;
    }

    public void setQuiz_title(String quiz_title) {
        this.quiz_title = quiz_title;
    }

    public int getQuiz_grade() {
        return quiz_grade;
    }

    public void setQuiz_grade(int quiz_grade) {
        this.quiz_grade = quiz_grade;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    
    public quiz()
    {
        
    }
    
    public quiz(String quiz_title,int quiz_grade,int instructor_id, String course_code)
    {
        this.quiz_title = quiz_title;
        this.quiz_grade = quiz_grade;
        this.instructor_id = instructor_id;
        this.course_code = course_code;
    }
    
   public void insertquestion(quiz_question q_q, int qID) throws SQLException
   {
       String [] values={q_q.getQuestion(), q_q.choices.get(0), q_q.choices.get(1), q_q.choices.get(2), q_q.choices.get(3),q_q.getAnswer()};
       String[] parameters= {"question","choice1","choice2","choice3","choice4","answer"};
       String[] fktable = {"quiz"};
       String[] fkcol = {"quiz_id"};
       String[] fksel = {"quiz_title"};
       String[] fksval = {db.selectString("quiz", "quiz_id", Integer.toString(qID), "quiz_title")};
       
      boolean inserted = db.insertFK("quiz_question", values, parameters, fktable,fkcol , fksel, fksval);
  }
    
}
