package for_loop;

import java.util.Scanner;

public class boolean_prime {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int d=2;
        boolean divided =false;
        while(n>d) {
            if (n % d == 0) {
                divided = true;
                break;
            }
            d++;
        }
        if(divided){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
