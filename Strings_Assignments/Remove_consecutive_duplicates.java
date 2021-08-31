package Strings_Assignments;

public class Remove_consecutive_duplicates {
    public static String removeDupli(String input){
        String result = "";
        char ch= input.charAt(0);
        result+=ch;
        for(int i=1; i< input.length(); i++){
            if(input.charAt(i)==ch);
            else
                result+=input.charAt(i);
            ch= input.charAt(i);

        }
        return result;
    }
    public static void main(String[] args) {
        String s = " aaabccdeefghhhhhi";
        String result = removeDupli(s);
        System.out.println(result);
    }

}
