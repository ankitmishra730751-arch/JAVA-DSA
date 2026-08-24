
import java.util.Scanner;

public class Aramstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            sum = sum + (digit*digit*digit);
            n = n / 10;
        }
        if(sum == original)
            System.out.println("Armstrong number");
            else 
                System.out.println("Not Armstrong number");
        }




    }
    
