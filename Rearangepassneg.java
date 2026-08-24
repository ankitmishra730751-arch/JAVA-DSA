public class Rearangepassneg {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,4};

        for(int x : arr)
            if(x >= 0) System.out.print(x + " ");

        for(int x : arr)
            if(x<0) System.out.println(x + " ");
    }
    
}
