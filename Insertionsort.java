public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,4,8};
        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        System.out.println("Pass " + i + " ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
}
