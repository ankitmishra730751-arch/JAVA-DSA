public class Arrayproduct {
    public static void main(String[] args) {
        int[] arr = {5,6,7,3,8,2};
        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product *= arr[i];

        }
        System.out.println(product);
    }
    
}
