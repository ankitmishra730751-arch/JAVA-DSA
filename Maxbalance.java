

public class Maxbalance {
    public static void main(String[] args) {
         int[] transactions = {1000, -200, 300, -500, 700, -100};
        


        int currentBalance = 0;
        int maxBalance = 0;

        for(int t : transactions){
            currentBalance += t;

            if(currentBalance > maxBalance){
                maxBalance = currentBalance;
            }
        }
        System.out.println("Maximum Balance reached:" + maxBalance);
    }
    
}
