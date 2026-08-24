public class Duplicatenumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};

        for(int i = 0; i< arr.length; i++){
            boolean unique = true;
            for(int j = 0; j< i; j++){
                if(arr[i] == arr[j]){
                    unique = false;
                    break;
                }


            }
            if(unique)
                System.out.println(arr[i] + " ");
        }
    }
    
}
