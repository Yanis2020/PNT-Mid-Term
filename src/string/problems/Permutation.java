package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        Permutation permutation = new Permutation();
        permutation.IfPermutaion("ABC");
    }

    public  void IfPermutaion(String str) {
        checkIfPerm("", str);
    }

    private static void checkIfPerm(String c, String b) {
        int n = b.length();
        if (n == 0) System.out.print(c+" ");
        else {
            for (int i = 0; i < n; i++)
                checkIfPerm(c + b.charAt(i), b.substring(0, i) + b.substring(i + 1, n));
        }

    }
}