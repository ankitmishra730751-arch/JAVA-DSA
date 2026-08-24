import java.util.Scanner;
public class Stringstudent {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
         
        String name = sc.nextLine();

         StringBuilder sb = new StringBuilder(name);

        System.out.println(sb.length());
        System.out.println(name.toUpperCase());

        String temp = " ";
        for(int i = name.length() - 1; i >= 0; i-- ){
        }
        System.out.println(temp);
        if(name.equalsIgnoreCase(temp))
            System.out.println("True");
        else
             System.out.println("False");
            System.out.println("Final String:" + name);




    }
    
}
