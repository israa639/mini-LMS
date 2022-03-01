package model;


import java.util.ArrayList;

public class quiz_question{
     private String question;
     public ArrayList<String> choices;
     private String answer;
     private static int quiz_id;
    
        public String getQuestion() {
            return question;
        }

        public void setQuestion(String questions) {
            this.question = questions;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public int getQuiz_id() {
            return quiz_id;
        }

        public void setQuiz_id(int quiz_id) {
            this.quiz_id = quiz_id;
        }
        public quiz_question(){}
        
     public quiz_question(String questions,String []choices,String answer){
         this.question=questions;
         this.choices=new ArrayList<String>();
         for(int i=0;i<choices.length;i++){
             this.choices.add(choices[i]);}
         this.answer=answer;
         quiz_id++;
     }}