// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 14
// Task 1: Count vowels in a string

public class task1 {
    public static void main(String[] args) {

        String str = "Hello Java Programming";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Total vowels: " + count);
    }
}