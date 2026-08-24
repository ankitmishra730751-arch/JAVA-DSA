public class Arrayswapfirstlast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int temp = arr[0];
        arr[0] = arr [arr.length -1] ;
        arr[arr.length - 1]= temp;

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    
}
