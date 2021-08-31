package Array;
import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < T; i++){
            String S= sc.nextLine();
            char [] charArray = S.toCharArray();

            for(int j=0; j<charArray.length; j++){
                if (j % 2 == 0) {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");
            for(int j=0; j<charArray.length; j++){
                if (j % 2 != 0) {
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
    }
}
