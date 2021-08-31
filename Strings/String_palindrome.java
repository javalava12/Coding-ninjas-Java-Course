package Strings;

public class String_palindrome {
    public static void main(String[] args) {
        String s= "abcdcb";
        boolean flag = true;

        for (int i=0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length() - i-1)) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

}
