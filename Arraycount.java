public class Arraycount {
    public static void main(String[] args) {
        int [] arr = {2,3,4,-5};
        int pos =0, neg = 0;

        for(int i =1; i<arr.length; i++){
            if(arr[i] > 0)
                pos++;
            if(arr[i] < 0)
                neg++;


        }
        System.out.println("Positive =" + pos);
        System.out.println("Negative =" + neg);

    }
    
}
