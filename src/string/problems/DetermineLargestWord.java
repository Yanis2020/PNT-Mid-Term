package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        findTheLargestWord(s);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String tmp;
        System.out.println(wordGiven);
        char[] arrayA = wordGiven.toCharArray();
        char[] arrayB = " ".toCharArray();
        System.out.println(arrayA);
        //  int j=0;
        while (arrayA != arrayB) {
            int j = 1;
            map.put(j, wordGiven);
            j++;
        }
        //  for (int i =0; i< map.size();i++){
        // map.get(i);
        //    System.out.println(map.get(i));
        // }
        //implement

        return map;
    }
}
