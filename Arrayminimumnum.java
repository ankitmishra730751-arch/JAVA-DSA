public class Arrayminimumnum {
    public static void main(String[] args) {
        int[] arr = {3,4,5,67,78};
        int min = arr[0];
        for(int i =0; i< arr.length;i++){
            if(arr[i] < 0) min = arr[i];
            }
            System.out.println(min);
        }
    }
