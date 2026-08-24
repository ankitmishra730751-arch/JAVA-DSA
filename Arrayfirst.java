import java.util.Scanner;
public class Arrayfirst {
    public static void main (String args[]){
        int[] arr = {5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(); 
        for (int i=0;i<4;i++){
            if (arr[i]==N){
                System.out.print("True");
            }
        }


    }
}
