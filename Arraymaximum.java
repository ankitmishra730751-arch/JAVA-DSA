public class Arraymaximum {
    public static void main(String[] args) {
        int[]  arr = {5,9,2,7};
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
        if(arr [i] > max)
       max = arr[i];

    }
        System.out.println("Maximum =" + max);
    
}
}

