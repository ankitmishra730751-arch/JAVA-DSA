public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr ={1,1,0,0,0,1};
//         Segregate0and1(arr);
//         for(int ele: arr){
//             System.out.print(ele +" ");
//         }
//     }
//     static void Segregate0and1(int[] arr){
//         int i=0,j=arr.length-1;
//         while(i<j){
//             if(arr[i] == 0){
//                 i++;
//             }
//             else if(arr[j] == 1){
//                 j--;
//             }
//             else{
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//     }
    
// }
// }
// 2nd method
int numberofZeros = 0;
int numberofOnes = 0;
for(int ele : arr){
    if(ele == 0) numberofZeros++;
    else numberofOnes++;
}
for(int i=0;i<numberofZeros; i++){
    arr[i] = 0;
}
for(int i = numberofZeros; i<arr.length;i++){
    arr[i] = 1;
}
System.out.print("Sorted Array : ");
for(int i = 0; i<arr.length;i++){
    System.out.print(arr[i]+ " ");
}
    }
}