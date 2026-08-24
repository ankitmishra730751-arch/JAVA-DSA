
import java.util.Scanner;

public class Leepyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = sc.nextInt();


        if(a % 4 == 0)
            System.out.println("leap year");
        else 
            System.out.println("Not a leep year");
    }
    
}
