/*
 * Sean O'Brien
 * CSC 206, Intermediate Programming
 * in class example/intro to boolean output
 */
package additionquiz;

        //  import library
import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        //  Declare Variables, using time to capture a few random numbers
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user with question
        System.out.print("What is " + number1 + " + "
                + number2 + "? ");
        //  Retrieve user's answer
        int answer = input.nextInt();
        //  Print user answer and grade
        //  Uses boolean true/false
        System.out.println(number1 + " + " + number2 + " = " + answer
                + " is " + (number1 + number2 == answer));
    }
}
