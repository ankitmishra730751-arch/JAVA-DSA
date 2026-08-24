public class Movezero {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5};
        int index = 0;

        for(int x : arr)
            if(x != 0)
                arr[index++] = x;

        while(index < arr.length)
            arr[index++] = 0;
        for(int x : arr)
            System.out.print(x+" ");

        }
    }
