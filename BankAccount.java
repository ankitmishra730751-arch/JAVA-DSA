public class BankAccount {
    int accno;
    String name;
    double balance;
    
    BankAccount() {
        accno = 0;
        name = "NA";
        balance = 0.0;
    }

    BankAccount(int a, String n){
        accno = a;
        name = n;
        balance = 0.0;

    }

    BankAccount(int a, String n, double b){
        accno = a;
        name = n;
        balance = b;

    }
    void show(){
        System.out.println(accno + " " + name + "" + balance);
    }
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(1001,"Ankit");
        BankAccount b3 = new BankAccount(1003,"Rohit",5000);

        b1.show();
        b2.show();
        b3.show();
    }
    }
