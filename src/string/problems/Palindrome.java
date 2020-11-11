package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String a = "MADAM";
        String b = "";

        char[] arrayA = a.toCharArray();
        for (int i = arrayA.length - 1; i >= 0; i--) {
            b = b + arrayA[i];

        }
        System.out.println("a is " + a);
        System.out.println("b is " + b.trim());


        if (a.equalsIgnoreCase(b)) {
            System.out.println("it is a palindrom");
        } else {
            System.out.println("It is not a palindrom");
        }

    }
}
