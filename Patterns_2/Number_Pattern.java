import java.util.Scanner;
public class Number_Pattern {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int val=i;
            int space=1;
            while(space<=n-i)
            {
                System.out.print(" " );
                space=space+1;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print(val);
                System.out.print(" ");
                val++;
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
