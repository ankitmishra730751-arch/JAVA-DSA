public class Arrayunion {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int [] b = {4,5,6};

        for(int x : a )
            System.out.println(x +" ");

            for(int i = 0; i<b.length; i++){
                boolean found = false;
                for(int j = 0; j<a.length; j++){
                    if(b[i] == a[j]){
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.print(b[i] + " ");
                    
                }
            }

        }
    
