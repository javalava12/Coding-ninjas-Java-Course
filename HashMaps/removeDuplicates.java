package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {
    public static ArrayList<Integer> remove(int[] a){
        ArrayList<Integer> output= new ArrayList<>();
        HashMap<Integer, Boolean> seen= new HashMap<>();
        for (int j : a) {
            if (seen.containsKey(j)) {
                continue;
            }
            output.add(j);
            seen.put(j, true);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] a = {1,3,4,5,5,4,3,2,1,6,6,7};
        ArrayList<Integer> output= remove(a);
        for(int i=0; i<a.length;i++){
            System.out.println(output.get(i));
        }
    }
}
