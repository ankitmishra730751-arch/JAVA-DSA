public class Arrayasendingsorted {
    public static void main(String[] args) {
        
        int[] arr = {9,2,8,3,4,5,6,7};

        for(int i = 0; i < arr.length; i++){
           for(int j=0; j < arr.length; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        }  
        for(int x : arr)
            System.out.print(x+" ");


    }
    
}
