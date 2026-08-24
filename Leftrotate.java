public class Leftrotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;

        for(int r=0; r < k; r++){
            int first = arr[0];
            for(int i =0;i< arr.length-1;i++)
                arr[i] = arr[i+1];
            arr[arr.length - 1] = first;

        }
        for(int x :arr)
            System.out.println(x + " ");

    }
    
}
