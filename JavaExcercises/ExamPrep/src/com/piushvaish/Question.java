package com.piushvaish;

/**
 * Created by piush on 30/04/2016.
 */
//page 419
public class Question {
    private String text;
    private String answer;

    public Question() {
        this.text = "";
        this.answer = "";
    }

    public void setText(String text){
        this.text = text;

    }
    public void setAnswer(String correctResponse){
        this.answer = correctResponse;

    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println("The Question is : " + this.text);
    }


}
