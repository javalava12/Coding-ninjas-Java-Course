package Strings_Assignments;

import java.util.Scanner;

public class reverse_each_word {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String[] words;
        words = str.split("\\s");
        String reversed = "";
        for(int i=0; i< words.length;i++){
            if(i== words.length -1)
                reversed = words[i] +reversed;
            else
                reversed= " " + words[i] + reversed;
        }
        System.out.println(reversed);
    }
}
