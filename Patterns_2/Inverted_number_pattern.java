package Patterns_2;

import java.util.Scanner;

public class Inverted_number_pattern {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(n-i+1);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
