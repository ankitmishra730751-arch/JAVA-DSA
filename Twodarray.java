import java.util.Scanner;
public class Twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // step 1 take row 
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
           
        //take column
        System.out.println("Enter number of columns");
        int cols = sc.nextInt();

        // stem 2  create 2d array
        int[][] arr = new int[rows][cols];

        //step 3 insert array
        System.out.println("2D Array element are: ");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Display element
        System.out.println("2D element are:");
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }



    }
    
}
