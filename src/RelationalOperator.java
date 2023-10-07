import java.util.Scanner;
public class RelationalOperator {
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    double temp = scan.nextDouble();

    if (temp >= 30){
        System.out.println("its hot");
    }
        else if (temp >= 25) {
            System.out.println("Its pretty warm");
    }
        else if (temp <= 20)
            System.out.println("its chilly out there");

    }

}
