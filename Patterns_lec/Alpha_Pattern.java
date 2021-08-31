package Patterns_lec;

import java.util.Scanner;

public class Alpha_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char startingChar= (char)('A' + i-1);
            while(j<=i){
                System.out.print(startingChar);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
