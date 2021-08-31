package Strings;

public class all_substrings {
    public static void substring(String s){
        for(int i =0; i<s.length();i++){
            for(int j=i;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        substring(str);

    }
}
