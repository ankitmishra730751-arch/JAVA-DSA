import java .util.Scanner;
public class ElectricityBill {
    int unit;
    double finalBill;

    ElectricityBill(){
        unit = 0;
        finalBill = 0;
        System.out.println("DEfault Constructor Execute");


    }
    ElectricityBill(int u){
        unit = u;

    }
    void getUnit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Units consumed:");
        unit = sc.nextInt();
    }
    void calculateBill(){
        if(unit <= 100){
            finalBill = unit * 3;

        }
        else if (unit <= 200){
            finalBill = unit * 4;
         }
         else{
            finalBill = unit * 5;
         } 

         finalBill = finalBill + 300;
        }
        void showBill(){
            System.out.println("Total Electrical Bill:" + finalBill);
        }
        public static void main(String[] args) {
            ElectricityBill obj = new ElectricityBill();

            obj.getUnit();
            obj.calculateBill();
            obj.showBill();


        }
    }
    
