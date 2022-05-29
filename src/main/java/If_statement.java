import java.util.Random;
import java.util.Scanner;

public class If_statement {
    public static void main(String[] args) {
        int check = 100;
        int num = 51;

        if (num > check) {
            System.out.println("the number is greater than 100.");
        } else if (num > 50) {
            System.out.println("the number is greater than 50 and smaller or equal to 100.");
        } else {
            System.out.println("the number is smaller than or equal to 50.");
        }
        //switch-case-break
        //used character randomizer to generate a random character to assign a student a grade.
        Random random = new Random();
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        System.out.println("Generated Random Character: " + randomizedCharacter);
        char FinalScore = randomizedCharacter;
        switch (FinalScore) {
            case 'a':
                System.out.println("Your final grade is 'A'. Congratulations!");
                break;
            case 'b':
                System.out.println("Your final grade is 'B'.");
                break;
            case 'c':
                System.out.println("Your final grade is 'C'.");
                break;
            default:
                System.out.println("You NRed.");
        }

        //ternary operator: 삼항 연산자.
        int num1 = 50;

        String result = (num1 > 25) ? "given number is greater than 25." : "give number is smaller or equal to 25.";
        System.out.println(result);

        // if - statement quiz 1: print what kind of grade the given grade is.
        //(100~91 : 'A' , 90~81 : 'B' , 80~71 : 'C' , the others : F)
        //using a scanner, I can input a score that can be then converted to a corresponding letter.
            Scanner sc = new Scanner(System.in);
            int score = sc.nextInt();

            if (91 < score) {
                System.out.println("Your socre is A");
            }
            else if (score > 80 && score < 91) {
                System.out.println("Your score is B");
            }
            else if (score> 70 && score < 81) {
                System.out.println("Your score is C");
            }
            else {
                System.out.println("Your score is F");
            }
        }
    }



