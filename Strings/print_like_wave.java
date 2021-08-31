package Strings;

import java.util.Scanner;

public class print_like_wave {
    public static int[][]takeInput(){
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int input[][]= new int[r][c];
        for(int i=0; i<r; i++){
            for(int  j=0; j<c; j++){
                input[i][j]= sc.nextInt();
            }
        }
        return input;
    }
    public static void wavePrint(int input[][]){
        for(int i=0; i< input[0].length; i++){
            if(i % 2==0){
                for (int j=0; j<=input.length -1; j++){
                    System.out.print(input[j][i] + " ");
                }
            }
            else if (i%2!=0){
                for (int j= input.length -1; j>=0; j--){
                    System.out.print(input[j][i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][]arr= takeInput();
        wavePrint(arr);
    }

}
