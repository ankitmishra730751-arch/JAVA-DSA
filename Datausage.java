import java.util.Scanner;
public class Datausage {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Enter data used for 7 days (in GB):");

        for(int i = 1; i<=7; i++){
            int data = sc.nextInt();
            total = total + data;
        }
        if(total > 70){
            System.out.println("Warning weekly data limit exceeded!");
        }
        else{
            System.out.println("Data usage within lmit.");
        }
        sc.close();

        
    }
    
}
