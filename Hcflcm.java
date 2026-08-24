import java.util.Scanner;
public class Hcflcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y = b;

        while (x != y){
            if(x > y)
                x = x - y;
            else 
                y = y - x;
        }
        int hcf = x;
        int lcm = (a * b) /hcf;

        System.out.println("HCF =" +hcf);
        System.err.println("LCM =" +lcm);

    }
    
}
