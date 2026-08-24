import java.util.Scanner;
public class Cinematicket {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, age, totalcost = 0;
        System.out.println("Enter number of people:");
        n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            System.out.print("Enter age of person" + i + ": ");
            age = sc.nextInt();

            if(age < 12){
                totalcost = totalcost + 100;

            }
            else if (age <= 60){
                totalcost = totalcost + 200;
            }
            else{
                totalcost = totalcost + 120;
            }
        }
        System.out.println("Total Ticket cost =" + totalcost);
    }
    
}
