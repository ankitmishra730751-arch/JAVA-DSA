  import java.util.Scanner;
  public class Armstrone{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  

      int num = sc.nextInt();
      int sum = 0, temp = num;

      while (temp != 0){
        int r = temp % 10;
        sum += r * r * r;
        temp /= 10;
      }

      if (num==sum)
        System.out.println("Armstrone");
      else
        System.err.println("Not Armstrone");
    }

  }
