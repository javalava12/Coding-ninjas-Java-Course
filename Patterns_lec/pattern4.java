package Patterns_lec;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int val=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                val++;
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
