public class Arrayinsertelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int pos = 2;
        int val = 10;

        int[] newArr = new int [arr.length+ 1];
         
        for(int i =0; i< pos; i++){
            newArr[i] = arr[i];

            newArr[pos] = val;

            for(i = pos; i< arr.length; i++)
                newArr[i+1] = arr[i];

            for(int x : newArr)
                System.out.println(x + " ");

            }

            }
        }
