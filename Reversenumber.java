import java.util.Scanner;
public class Reversenumber {
    public static void main(String args[]){
        int number, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
         number = sc.nextInt();

        while(number !=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number /10;
        }
        System.out.println("Reverse number:" +reverse);
    }
    
}
