import java.util.Scanner;
public class PassFail2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade ");
        double grade = scan.nextDouble();

        if (grade < 50) {
            System.out.println("you failed");
        } else if (grade < 100) {
            System.out.println("you passed");
        } else {
            System.out.println("you lied (invalid)");
        }


    }

}
