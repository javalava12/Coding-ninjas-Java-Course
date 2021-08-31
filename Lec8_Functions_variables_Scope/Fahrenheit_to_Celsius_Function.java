package Lec8_Functions_variables_Scope;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Function {
    public static void temp_conversion(int start, int end, int step){
        int f;
        int C;
        for(f=start;f<=end;f=f+step){
            C=((f-32)*5)/9;
            System.out.println(f+"\t"+C);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        int e= sc.nextInt();
        int w= sc.nextInt();
    }

}
