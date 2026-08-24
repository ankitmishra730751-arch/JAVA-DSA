public class Arraycount2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10,40,50,10,60,70,10};
        int x = 10;
        int count = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == x ){
                count++;
            }
        }
        System.out.println(x + "occurs" + count + "times" );


        
    }
    
}
