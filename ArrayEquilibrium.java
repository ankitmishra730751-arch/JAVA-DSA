public class ArrayEquilibrium {
    public static void main(String[] args) {
        int [] arr = {1,3,5,2,2};
        int total = 0, left = 0;

        for(int x : arr) total += x;

        for(int i = 0; i < arr.length; i++){
            total -= arr[i];
            if(left == total){
                System.out.println("index =" +i);
                return;
            }
            left += arr[i];

        }
    }
    
}
