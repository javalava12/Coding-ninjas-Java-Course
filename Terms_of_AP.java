package Lec6_Assignment_on_loops;

import java.util.Scanner;

public class Terms_of_AP {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        for(int i=1; i<=n; i++){
            while(count<=n){
                int fm= 3*i+2;
                if(fm%4!=0){
                    System.out.print(fm + " ");
                    count++;
                }
                i++;
            }
        }
    }
}
