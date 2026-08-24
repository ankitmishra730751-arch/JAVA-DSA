public class Selectionshort {
    public static void main(String args[]){
        int[] arr = {7,5,75,9,55,10,45};
        for(int i = 0; i < arr.length - 1; i++){
            // int minIndex = 0;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

                }
            // int temp = arr[i];
            // arr[i] = arr[minIndex];
            // arr[minIndex] = temp;
            System.out.println("Pass " + i + " ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}
}
