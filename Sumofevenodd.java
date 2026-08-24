import java.util.Scanner;
public class Sumofevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), evensum = 0, oddsum = 0;
        while(num != 0) {
            int d = num % 10;
            if(d % 2 == 0) evensum += d;
            else oddsum += d;
            num /= 10;

        }
        System.out.println("Even sum =" + evensum);
        System.out.println("Odd sum =" + oddsum);
    }
    
}
