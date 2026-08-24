import java.util.Scanner;
public class Stackswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int top = -1;
        int size = 5;
        int[] stack = new int[size];

        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peak");
        System.out.println("4. Enter your choice :");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                if(top == size - 1){
                    System.out.println("Stack overflow");
                }else{
                    System.out.print("Enter element to push: ");
                    int item = sc.nextInt();
                    top++;
                    stack[top] = item;
                    System.out.println(item +"pushed into stack");
                }
                break;

                case 2:
                    if(top == -1){
                        System.out.println("Stack underflow");
                    }else{
                        System.out.println("Popped element :" + stack[top]);
                        top--;
                    }
                    break;

                    case 3:
                        if(top == -1){
                            System.out.println("Stack is empty");
                        }else{
                            System.out.println("Top element is:" + stack[top]);
                        }
                        break;

                        default:
                            System.out.println("Invalid choice");

                    }
                    sc.close();
                }

        }
