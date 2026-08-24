
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();
        // System.out.println("Enter b number");
        // int b = sc.nextInt();

        if(a % 5 == 0  && a % 11 == 0)
            System.out.println("Divisible by both 5 and 11");
        // else 
        //     System.out.println("Not Divisble by both 5 and 11");
        else if(a % 11 == 0)
            System.out.println("Divisible by 11");
        // else
        //     System.out.println("Not Divisible by 11");
        else if(a % 5 == 0)
            System.out.println("Divisible by 5");
        else 
            System.out.println("Not divisble by 5");
    }
    
}
