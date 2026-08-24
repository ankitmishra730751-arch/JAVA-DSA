public class Arraysubsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,};
        int sum = 12;

        for(int i = 0; i<arr.length; i++){
            int curr = 0;
            for(int j = i; j< arr.length;j++)
                curr += arr[j];
            if(curr == sum){
                System.out.println("Form" + i + "to" + j);
                return;
            }
        }


    }
    
}
