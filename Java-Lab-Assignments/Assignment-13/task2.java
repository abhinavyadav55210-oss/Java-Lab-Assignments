// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 13
// Task 2: Reverse a word using charAt()

public class task2 {
    public static void main(String[] args) {

        String word = "JAVA";

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("Original Word: " + word);
        System.out.println("Reversed Word: " + reverse);
    }
}