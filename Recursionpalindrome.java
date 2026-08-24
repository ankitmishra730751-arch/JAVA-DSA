import java.util.Scanner;
public class Recursionpalindrome {
    static int reverse = 0;
    static int reverseNumber(int n){
        if(n==0){
            return reverse;

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            return reverseNumber(n/10);
        }
        
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            int result = reverseNumber(0);

            if(result== n)
                System.out.println("Palindrome number"); 
            else
                System.out.println("Not palindrone number");


        
    }
    
}
