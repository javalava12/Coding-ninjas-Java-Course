package Strings;

import java.util.Scanner;

public class rowwise_sum {
    public static int[][] rowwiseSum(){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][]= rowwiseSum();
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
             sum+= arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
