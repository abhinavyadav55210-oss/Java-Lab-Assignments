// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 13
// Task 4: Print all substrings of a word

public class task4 {
    public static void main(String[] args) {

        String word = "JAVA";

        System.out.println("All Substrings:");

        for (int i = 0; i < word.length(); i++) {

            for (int j = i + 1; j <= word.length(); j++) {

                System.out.println(word.substring(i, j));
            }
        }
    }
}