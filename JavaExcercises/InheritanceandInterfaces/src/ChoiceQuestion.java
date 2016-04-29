import java.util.ArrayList;

/**
 * Created by piush on 27/02/2016.
 */
public class ChoiceQuestion extends Question{
    private ArrayList<String> choices;

    public ChoiceQuestion(){
        choices = new ArrayList<String>();
    }
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if (correct){
            String choiceString = " " + choices.size();
            setAnswer(choiceString);
        }

    }
    public void display(){
        super.display();

        for(int i = 0;i < choices.size();i++){
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }

    }
}
