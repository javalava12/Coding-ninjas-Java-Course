package Strings;

import java.util.Scanner;

public class largest_row_column {
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
    public static int rowSum(int input[][], int row){
        int rSum=0;
        for(int j=0; j<input[row].length; j++){
            rSum+= input[row][j];

        }
        return rSum;
    }
    public static int columnSum(int input[][], int col){
        int cSum=0;
        for(int i=0; i<input.length; i++){
            cSum+= input[i][col];
        }
        return cSum;
    }
    public static void findLargest(int input[][]){
        int maxSum=rowSum(input,0);
        String dim= "row";
        int index=0;
        for(int i=1; i<input.length;i++)
            if(maxSum<rowSum(input,i)){
                maxSum= rowSum(input, i);
                dim= "";
                dim+= "row";
                index= i;
            }
        for(int j=0; j<input[0].length; j++)
            if (maxSum< columnSum(input,j)){
                maxSum=columnSum(input, j);
                dim="";
                dim+="column";
                index= j;
            }
        System.out.println(dim + " " + index + " " + maxSum);
    }

    public static void main(String[] args) {
        int [][] arr= takeInput();        findLargest(arr);

    }
}
