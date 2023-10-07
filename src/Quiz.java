import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        System.out.println("What is my name");
        System.out.print(" 1) Marcus \n 2) John \n 3) Not marcus \n 4) Mr. Moorlag \n Enter Your Answer: ");
        int answer_1 = scan.nextInt();
        if (answer_1 == 1){
            System.out.println("You got it right \n");
            score++;
        } else {
            System.out.println("You got it wrong, the answer was marcus \n ");
        }
        System.out.println("Do I have a dog?");
        System.out.println(" 1) No \n 2) Yes");
        System.out.println("Enter your answer: ");
        int answer_2 = scan.nextInt();
        if (answer_2 == 1) {
            System.out.println("You got it right");
            score++;
        } else {
            System.out.println("You got it wrong, the answer was no.");
        }
        System.out.println("\n Am I out of ideas for questions?");
        System.out.println(" 1) Yes \n 2) No");
        int answer_3 = scan.nextInt();
        if (answer_3 == 1) {
            System.out.println("Yeah im completely out");
            score++;
        }
        else {
            System.out.println("Incorrect, im completely out of ideas");
        }
        System.out.println("Your score was " + score);

    }


}


