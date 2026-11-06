// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 14
// Task 2: Count occurrences of the letter g

public class task2 {
    public static void main(String[] args) {

        String str = "Google Programming";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'g') {
                count++;
            }
        }

        System.out.println("String: " + str);
        System.out.println("Occurrences of g: " + count);
    }
}