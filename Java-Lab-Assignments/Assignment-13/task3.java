// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 13
// Task 3: Check whether a word is a palindrome

public class task3 {
    public static void main(String[] args) {

        String word = "MADAM";

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }
    }
}