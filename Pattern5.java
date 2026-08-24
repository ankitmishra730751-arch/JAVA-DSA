public class Pattern5 {
    public static void main(String[]args){
        int num = 1;

        for(int i=1; i<=4; i++){    //for row
            for(int j=1; j<=i; j++){    // for columns
                System.out.print(num+ " ");
                num++;
        }
        System.out.println();

    }
}
    
}
