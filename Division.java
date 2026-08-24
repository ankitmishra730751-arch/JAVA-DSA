public class Division {
    public static void main(String[] args){
        try {
            if(args.length < 2){
                throw new ArrayIndexOutOfBoundsException("P lease provide two numbers");
            }
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            if(numerator == 0 && denominator == 0){
                throw new ArrayIndexOutOfBoundsException("Both are Zero");
            }
            else if (numerator == 0){
                throw new Exception( "Numerator is Zero");
            }
            else {
                int result = numerator/denominator;
                System.out.println("Result =" + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error:" + e.getMessage());

        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        } finally {
            System.out.println("Program fnished");
        }
    }
    
}
