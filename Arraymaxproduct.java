public class Arraymaxproduct {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > max1){
                max2 = max1;
                max1 = x;
            }else if(x > max2){
                max2 = x;
            }
        }
        System.out.println("Product =" + (max1 * max2));
    }
    
}
