import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int i = sc.nextInt();

        if(i >= 90 ){
            System.out.println("Grade A");
        }
        else if(i >= 75)
            System.out.println("Grade B");
        else if(i >= 50)
            System.out.println("Grade C");
        else 
            System.out.println("Fail");


    }
    
}
