
import java.util.Scanner;

public class Revsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        int original = num;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        int sum = original + reverse;

        System.out.println("Reverse =" + reverse);
        System.out.println("Sum =" + sum);
    }
    
}
