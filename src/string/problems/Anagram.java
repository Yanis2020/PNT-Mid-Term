package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "CAT";
        String b = "ACT";

        Anagram anagram= new Anagram();
        anagram.CheckIfAnagram(a, b);
    }

    public  void CheckIfAnagram(String a, String b) {
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        System.out.println(arrayA);
        System.out.println(arrayB);

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        System.out.println(arrayA);
        System.out.println(arrayB);

        boolean ifAnangram = Arrays.equals(arrayA, arrayB);

        if (ifAnangram) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }


    }
}
