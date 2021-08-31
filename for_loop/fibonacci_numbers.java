package for_loop;

import java.util.Scanner;

public class fibonacci_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i1= 0, i2=1;
        for(int i=1; i<=n; i++){
            int i3= i1+i2;
            i1=i2;
            i2=i3;
        }
        System.out.println(i1 );
    }
}
