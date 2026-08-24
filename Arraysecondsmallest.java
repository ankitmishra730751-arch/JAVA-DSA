public class Arraysecondsmallest {
    public static void main(String[] args) {
        int[] arr = {2,8,1,4};

        int min = Integer.MAX_VALUE;
         int second  = Integer.MAX_VALUE;

         for(int x : arr){
            if(x<min){
                second = min;
                min = x;
            }else if(x < second && x != min){
                second = x;
            }
            System.out.println("Second smallest =" + second);


            }

         }



    }
    
