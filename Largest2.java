
import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter b number ");
        int b = sc.nextInt();

        if(a>b)
            System.out.println(a + " A is greater");
        else 
            System.out.println(b + " B is greater");


    }
    
}
