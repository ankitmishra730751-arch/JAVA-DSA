import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP:");
        double cp = sc.nextDouble();
        System.out.print("Enter SP:");
        double sp = sc.nextDouble();

        if(sp > cp){
            double profit = sp - cp;
                System.out.println("Profit = " + profit);
                System.out.println("Profit% =" + (profit /cp * 100));
        }
        else if(cp > sp){
            double loss = cp - sp;
            System.out.println("Loss =" + loss);
            System.out.println("Loss%" + (loss / cp * 100));
        }
        else{
            System.out.println("No profit no loss");
        }
        sc.close();





    }
    
}
