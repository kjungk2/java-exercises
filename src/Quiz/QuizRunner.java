package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kevin on 3/20/2017.
 */
public class QuizRunner {

    public static void main(String[] args) {
        String userAnswer;
        Scanner in;
        in = new Scanner(System.in);

        // add some choices
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Trek-Segafredo");
        choices.add("Bora Hansgrohe");
        choices.add("BMC");
        choices.add("SKY");


        ArrayList<String> choices2 = new ArrayList<>();
        choices2.add("Kwiatkowski");
        choices2.add("Cavendish");
        choices2.add("Sagan");
        choices2.add("Alaphilippe");
        choices2.add("GVA");
        ArrayList<String> answer2 = new ArrayList<>();
        answer2.add("0");
        answer2.add("2");
        answer2.add("3");

        MultipleChoice myQuestion1 = new MultipleChoice("1", "What team does Peter Sagan ride for?", choices);
        CheckBox myQuestion2 = new CheckBox(answer2, "Choose the top 3 finishers in Milan-SanRemo 2017:", choices2);

        myQuestion1.displayQuestion();
        myQuestion1.displayChoices();
        userAnswer = in.next();
        System.out.println(myQuestion1.checkAnswer(userAnswer));

        myQuestion2.displayQuestion();
        myQuestion2.displayChoices();

    }
}
