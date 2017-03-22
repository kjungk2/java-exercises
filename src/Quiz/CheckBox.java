package Quiz;

import java.util.ArrayList;

/**
 * Created by Kevin on 3/21/2017.
 */
public class CheckBox extends Question {

    private ArrayList<String> answer = new ArrayList<>();

    // constructor
    public CheckBox(ArrayList aAnswer, String aQuestion, ArrayList<String> aChoices) {
        super(aQuestion, aChoices);
        answer = aAnswer;
    }


    // getters and setters
    public ArrayList<String> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }


    // instance methods
//    public boolean checkAnswer(String userAnswer) {
//
//        //will need to iterate thru userAnswer's list of answers and compare to actual answer list
//    }
}
