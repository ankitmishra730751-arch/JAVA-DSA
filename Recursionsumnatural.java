// import java.util.Scanner;
public class Recursionsumnatural {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else
            return n + sum(n-1);
    }
    public static void main(String args[]){
            // Scanner sc = new Scanner(System.in);//code en sb ke bina bhi chl skta haipr user se input lene ke ye check kiya tha
            // System.out.println("Enter a number");// dono se code chl skta hai
            // int n = sc.nextInt();
        System.out.println(sum(5));
    }
    
}
