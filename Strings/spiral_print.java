package Strings;

import java.util.Scanner;

public class spiral_print {
    public static int[][] takeInput(){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][]input= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j= 0; j< c; j++){
                input[i][j]= sc.nextInt();
            }
        }
        return input;
    }
    public static void spiralPrint(int input[][]){
        int rs = 0;
        int re = input.length-1;
        int cs = 0;
        int ce = input[0].length-1;
        int i, j, c =1;
        if((re +1)==1){
            for(j = cs; j<=ce; j++){
                System.out.print(input[rs][j]+ " ");
            }
        }
        else if((ce +1)==1){
            for (i= rs; i<=re; i++){
                System.out.print(input[i][cs] + " ");
            }
        }
        else {
            while(c<=(input.length*input[0].length)){
                for(j=cs; j<= ce; j++){
                    System.out.print(input[rs][j] + " ");
                    c++;
                }
                rs++;
                for(i = rs; i<= re; i++){
                    System.out.print(input[i][ce] + " ");
                    c++;
                }
                ce--;
                for(j= ce; j>=cs; j--){
                    System.out.print(input[re][j] + " ");
                    c++;
                }
                re--;
                for(i = re;i >= rs;i--) {
                    System.out.print(input[i][cs] + " ");
                    c++;
                }
                cs++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr =takeInput();
        spiralPrint(arr);
    }
}
