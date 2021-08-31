package Array;

import java.util.Scanner;

public class Return_Sum_Array {
//    public static int[] takeInput(){
//        Scanner sc= new Scanner(System.in);
//        int size= sc.nextInt();
//        int[] input = new int[size];
//        for(int i=0; i<size; i++){
//            input[i]= sc.nextInt();
//        }
//        return input;
//    }
////    public static int testCases(int input[], int n){
////        Scanner sc= new Scanner(System.in);
////        int t = sc.nextInt();
////
////
////
////    }
//    public static int sumArray(int input[]){
//        int sum=0;
//        for (int i=0; i<input.length; i++){
//            sum+=input[i];
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int [] arr = new int [n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
            t--;
        }
//        int arr[]= takeInput();
//        int sum= sumArray(arr);
//        System.out.println( sum );
    }

}
