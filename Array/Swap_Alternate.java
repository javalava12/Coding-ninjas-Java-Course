package Array;

import java.util.Scanner;

public class Swap_Alternate {
    public static int[] takeInput(){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] input= new int[size];
        for(int i=0; i<size; i++){
            input[i]= sc.nextInt();
        }
        return input;
    }
    public static void print(int input[]){
        for(int i=0; i<input.length; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void swapArray(int input[]){
        for(int i=0; i< input.length-1; i=i+2){
            int temp= input[i];
            input[i]= input[i+1];
            input[i+1]=temp;
        }
    }

    public static void main(String[] args) {
        int [] arr= takeInput();
        swapArray(arr);
        print(arr);
    }
}
