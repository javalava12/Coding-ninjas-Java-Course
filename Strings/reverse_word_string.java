package Strings;

public class reverse_word_string {
    public static String reverseWordwise(String s){
        int i = s.length()-1;
        int start, end=i+1;
        String result = "";
        while(i>=0){
            if(s.charAt(i)==' '){
                start=i+1;
                while(start!=end)
                    result += s.charAt(start++);

                result +=' ';
                end = i;
            }
            i--;
        }
        start = 0;
        while(start != end)
            result += s.charAt(start++);

        return result;
    }

    public static void main(String[] args) {
        String s= "avantika is awesome .";
        System.out.println(reverseWordwise(s));
    }
}
