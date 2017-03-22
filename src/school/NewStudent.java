package school;

import java.util.Scanner;


/**
 * Created by Kevin on 3/12/2017.
 */
public class NewStudent {
    public static void main(String[] args) {

        Student test1 = new Student("Kevin", 662385082, 45, 3.6);
        Student test2 = new Student("Jane", 223848382);
        Student test3 = new Student("Abraham", 123456789, 88, 4.0);




        System.out.println(test1);
        System.out.println(test2);

        test2.addGrade(3,4.0);
        test2.addGrade(4, 3.0);

        System.out.println(test2);

        System.out.println(test1.getGradeLevel());
        System.out.println(test2.getGradeLevel());
        System.out.println(test3.getGradeLevel());

        test3.addGrade(3,4.0);
        System.out.println(test3);
        System.out.println(test3.getGradeLevel());

//        Student testStudent = new Student();
//        Scanner in;
//
//        in = new Scanner(System.in);
//
//        // get input about the student and set it via setter methods
//        System.out.println("What is the student's name?");
//        testStudent.setName(in.next());
//        System.out.println("What is the student's ID?");
//        testStudent.setStudentId(in.nextInt());
//        System.out.println("What is the number of credits for this student?");
//        testStudent.setNumberOfCredits(in.nextInt());
//        // cannot set gpa since it is set as private access
//
//
//        // print info via getter methods
//        System.out.println("Here is information about the student\n");
//        System.out.println("Name: " + testStudent.getName());
//        System.out.println("Student ID #: " + testStudent.getStudentId());
//        System.out.println("Number of Credits: " + testStudent.getNumberOfCredits());

    }
}
