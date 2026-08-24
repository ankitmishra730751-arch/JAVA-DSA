public class Bubbleshort {
    public static void main(String[] args) {
        int[] arr = {12,19,5,60,30,70};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println("Pass " + (i+1) + (" "));
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
    
}
