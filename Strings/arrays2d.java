package Strings;

import java.util.Scanner;

public class arrays2d {
    public static void main(String[] args) {
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
        for(int i=0; i<r;i++){
            for(int j = 0; j<c; j++){
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

    }
}
