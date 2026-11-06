// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 14
// Task 3: Print each character with its position

public class task3 {
    public static void main(String[] args) {

        String str = "JAVA";

        for (int i = 0; i < str.length(); i++) {

            System.out.println("Character: " + str.charAt(i)
                    + " | Position: " + i);
        }
    }
}