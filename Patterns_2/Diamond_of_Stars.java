package Patterns_2;

import java.util.Scanner;

public class Diamond_of_Stars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        // INNER OR ABOVE LOOP
        while(i<=n){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=i*2-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        //OUTER LOOP
        i=n-1;
        while(i>0){
            int space=1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j=1;
            while(j<=i*2-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
