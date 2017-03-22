package Quiz;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kevin on 3/20/2017.
 */
public abstract class Question {

    private String question; //ex: "What is...?"
    private ArrayList <String> choices = new ArrayList<>(); //ex: ["apple", "banana", "orange", "cherry"]
    //private HashMap<String, String> choices; //ex: {"A.":"Apple","B.":"Banana","C":"Cherry",...}
    //private ArrayList <String> answers = new ArrayList<>(); //could be a list of one answer, or multiple answers


    // constructor
    public Question(String question, ArrayList<String> choices) {
        this.question = question;
        this.choices = choices;
    }


    // getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }


    // instance methods
    public void displayQuestion() {
        System.out.println(getQuestion() + "\n");
    }

    public void displayChoices() {
        int counter = 0;
        for (String choice : choices) {
            System.out.println(counter + " - " + choice);
            counter ++;
        }
        System.out.println("\nEnter a choice between 0 and " + (counter-1));
    }



}

