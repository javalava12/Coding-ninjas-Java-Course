package Strings;

import java.util.Scanner;

public class Largest_column_sum {
    public static int[][] takeInput(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        int input[][]= new int[r][c];
        for(int i=0; i<r; i++){
            for(int  j=0; j<c; j++){
                System.out.println("Enter the element at " + i + " row " + j + " column");
                input[i][j]= sc.nextInt();
            }
        }
        return input;
    }
    public static void print(int input[][]){
        int r= input.length;
        int c= input[0].length;

        for(int i=0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int largestSum(int input[][]){
        int largest= Integer.MIN_VALUE;
        int r= input.length;
        int c= input[0].length;
        for(int j=0; j<c; j++){
            int sum=0;
            for(int i=0; i<r; i++){
                sum+=input[i][j];
            }
            if(sum>largest){
                largest=sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[][]=takeInput();
        print(arr);
        System.out.println(largestSum(arr));


    }
}
