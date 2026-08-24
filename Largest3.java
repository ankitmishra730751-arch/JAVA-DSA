
import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();

        if(a>=b)
            System.out.println(a);
            else
                System.out.println(c);
        if(b>=c)
            System.out.println(b);
        else 
            System.out.println(c);


    }
}
    
