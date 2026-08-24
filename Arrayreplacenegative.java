public class Arrayreplacenegative {
    public static void main(String[] args) {
        int[] arr ={-2,-3,5,6};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0);
            arr[i] = 0;

        }
        for(int x : arr){
            System.out.print(x + " ");

        }
    }
    
}
