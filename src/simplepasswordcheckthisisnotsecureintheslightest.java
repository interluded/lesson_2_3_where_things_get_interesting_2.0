import java.util.Scanner;
public class simplepasswordcheckthisisnotsecureintheslightest {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        String password = "secure_password";

        System.out.println("enter the password");


        String user_password = scan.nextLine();

        if (user_password.equals(password)) {
        System.out.println("good job you got it right, the secrets of the world are now upon you, and the secret is: ");

        }
            else {
            System.out.println("you got it wrong");

        }

    }
}
