import java.util.Scanner;
public class Divisble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = sc.nextInt();
        if(n % 5 == 0 && n % 3 == 0)
            System.out.println("Divisble by 5 and 3");
        else if (n % 5 == 0)
        System.out.println("Divsible by 5");
    else if (n % 3 == 0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not Divisble by 3 or 5");





    }
    
}
