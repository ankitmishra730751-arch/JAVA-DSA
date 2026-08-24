public class Missing {
public static void main(String[] args) {
    int[] arr = {1,2,4,5};
    int n = arr.length+1;
    long sum = (long)n*(n+1)/2;
    long arraySum = 0;
    for(int ele : arr){
        arraySum += ele;
    }
        System.out.println((int)(sum - arraySum));

}
    
}
