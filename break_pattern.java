package for_loop;

import java.util.Scanner;

public class break_pattern {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int i=1;
//        while(i<=n){
//            int j=1;
//            while(j<=n){
//                System.out.print(j + " ");
//                j++;
//                if(j>i){
//                    break;
//                }
//            }
//            System.out.println();
//            i++;
//        }
        int i = 1;
        while(i < 4) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            i++;
        }
    }
}
