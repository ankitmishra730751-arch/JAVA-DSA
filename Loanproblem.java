public class Loanproblem {
    public static void main(String args[]){

        int day = 0;
        long borrowed = 0;
        long paid = 0;
        long amountPerDay = 15000;
        long currentPay = 1;

        while(paid < borrowed){
            day++;

            borrowed = amountPerDay * day;
            paid = paid + currentPay;

            currentPay = currentPay * 3;

        }
        System.out.println("On day" + day + "total repayment becomes >= total borrowed");
    } 
    
}
