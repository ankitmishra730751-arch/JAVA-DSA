
class TableThread extends Thread {
    int num;

    TableThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("\nOdd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


public class MultiTask {
    public static void main(String[] args) {
        int number = 5; 

        TableThread t1 = new TableThread(number);
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}
    
