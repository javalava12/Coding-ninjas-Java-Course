package Patterns_lec;

import java.util.Scanner;

public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=4){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
