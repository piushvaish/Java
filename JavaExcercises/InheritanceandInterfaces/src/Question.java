/**
 * Created by piush on 27/02/2016.
 */
public class Question {
    private String text;
    private String answer;

    public Question(){
        text ="";
        answer = "";
    }
    public void setText(String questionText){
        text = questionText;
    }
    //generally you don't return anything from a setter anyway, by convention
    public void setAnswer(String correctResponse){
        answer = correctResponse;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }

}
