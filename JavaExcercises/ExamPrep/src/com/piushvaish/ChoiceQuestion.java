package com.piushvaish;

import java.util.ArrayList;

/**
 * Created by piush on 30/04/2016.
 */
public class ChoiceQuestion extends Question {

    private ArrayList<String> choices;

    public ChoiceQuestion() {
        this.choices = new ArrayList<String>();

    }

    public void addChoice(String choice,boolean correct){
        this.choices.add(choice);

        if(correct){
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }

    }

    @Override
    public void display() {
        // display the question text
        super.display();
        //display the anwser choices
        for(int i = 0; i < choices.size();i++){
            int choiceNumber = 1 + i;
            System.out.println(choiceNumber + " : " + choices.get(i));
        }
    }
}
