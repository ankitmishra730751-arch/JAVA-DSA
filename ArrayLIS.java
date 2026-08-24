public class ArrayLIS {
    public static void main(String[] args) {
        int[] arr = {1,22,9,33};
        int n = arr.length;
        int[] dp = new int [n];
        int max = 1;

        for(int i = 0; i< n; i++ ) dp[i] = 1;

        for(int i = 0; i<n; i++){
            for(int j= 0; j<i; i++){
                if(arr[i] > arr[j] && dp[i] < dp [j] + 1){
                    dp[i] = dp[j] + 1;
                    max = Math.max(max, dp[i]);


                }

            }
        }
        System.out.println("LTS = " + max);
    }
    
}
