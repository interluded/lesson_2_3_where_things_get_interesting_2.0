import java.util.Scanner;
public class Learning {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("how old is you");
        int age = scan.nextInt();

        if (age < 4)
        {
            System.out.println("You are a toddler");
            System.out.println("Enjoy your youth");        }
        else if (age < 13) {
            System.out.println("you are a child");
        }
        else if (age < 20)
        {
            System.out.println("you are a teenager");
        }
        else if (age < 60)
        {
            System.out.println("you are an adult");
        }
        else
            System.out.println("You are a senior");
        System.out.println("Age is only a state of mind");

    }
}