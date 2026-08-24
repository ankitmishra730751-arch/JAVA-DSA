//WAP to implement a user defined exception MCA exception that will called when divide a value by Zero with a message "Denominator contain zero"
class MCAException extends Exception {
    public MCAException(String message) {
        super(message);
    }
}

public class DivisionExample {

    static void divide(int numerator, int denominator) throws MCAException {
        if (denominator == 0) {
            throw new MCAException("Denominator contain Zero");
        } else {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);  
        } catch (MCAException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
    
