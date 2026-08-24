class Recursion {
    
    // recursive method
    static void printNumber(int n) {
        if (n > 5) {        // base condition
            return;
        }
        System.out.println(n);
        printNumber(n + 1); // recursive call
    }

    public static void main(String[] args) {
        printNumber(1);    // function call
    }
}
