import java.util.Scanner;
public class simplepasswordcheckthisisnotsecureintheslightest {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        String password = "password";

        System.out.println("enter the password");

        String user_password = scan.nextLine();

        if (user_password.equals(password)) {
            System.out.println("you got the password good job");

        }
            else {
            System.out.println("you got it wrong");

        }

    }
}
