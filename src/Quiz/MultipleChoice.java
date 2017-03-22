package Quiz;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kevin on 3/20/2017.
 */
public class MultipleChoice extends Question {

    private String answer;

    // constructor
    public MultipleChoice(String aAnswer, String aQuestion, ArrayList<String> aChoices) {
        super(aQuestion, aChoices);
        answer = aAnswer;
    }


    // getters and setters
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    // instance methods
    public boolean checkAnswer(String userAnswer) {
        if (getAnswer().equals(userAnswer)) {
            return true;
        } else return false;

    }


}

