package Array;

import java.util.Scanner;

public class largest_integer_in_array {
    public static int[] takeInput(){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int[] input = new int[size];
        for(int i=0; i<size; i++){
            input[i]= sc.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        int size= input.length;
        for (int j : input) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static int largestInArray(int input[]){
        int max= Integer.MIN_VALUE;
        for(int k=0; k<input.length; k++){
            if(input[k]> max){
                max= input[k];
            }
        }
        return max;
    } public static  void incrementArray(int input[]){
        input= new int[5];
        for (int i=0; i<input.length; i++){
            input[i]++;
        }
    }
    public static void increment(int n){
        ++n;
    }
    public static void change(int input[]){
        input = new int[5];
        input[0] = 15;
    }

    public static void main(String[] args) {
//        int [] arr= {1,2,3,4,5};
//        incrementArray(arr);
//        print(arr);
//        int a= 10;
//        increment(a);
//        System.out.println(a);
        int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);


//        int[] arr = takeInput();
//        System.out.println(arr);
//        print(arr);
//        int largest= largestInArray(arr);
//        System.out.println("Largest" + " " + largest);
    }
}
