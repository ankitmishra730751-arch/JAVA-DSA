public class Searcharray {
    public static void main(String[] args) {
        int [] arr = {3,4,7,16,45,18};
        int target = 15;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
                if(flag)
                System.out.println("Target exit in Array ");
            else
                System.out.println("Target not exit in Array");
        }
        }
            
