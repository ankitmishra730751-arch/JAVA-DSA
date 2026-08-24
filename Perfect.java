
import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n)
            System.out.println("Perfect number");
        else
            System.out.println("Not Perfect number");
    }
    
}
