package string.problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        // Check for anagram
        System.out.println("Check for anagram");
        Anagram anagram= new Anagram();
        anagram.CheckIfAnagram("ARMY", "MARY");

        // Check for duplicate
        System.out.println("Check for duplicate word");
        DuplicateWord duplicateWord = new DuplicateWord();
        duplicateWord.duplicateCheck("Hello, how are you. you are the best");

        // Check for palindrome
        System.out.println("Check for palindrome");
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindrom("cat");

        // Check for permutation
        System.out.println("Check for permutation");
        Permutation permutation = new Permutation();
        permutation.IfPermutaion("JAVA");




    }
}
