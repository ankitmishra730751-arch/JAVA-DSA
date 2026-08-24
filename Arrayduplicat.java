public class Arrayduplicat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2};
        int dup = 0;

        for(int i = 1; i<arr.length;i++){
            for(int j = i+1; j<=arr.length; j++){
                if(arr[i] == arr[j]){
                    dup++;
                    break;


                }

            }
        }
        System.out.println("Duplicat count =" + dup);
    }
    
}
