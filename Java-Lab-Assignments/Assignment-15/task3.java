// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 15
// Task 3: Insert text at the beginning

public class task3 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Programming");

        System.out.println("Original Text: " + sb);

        sb.insert(0, "Hello ");

        System.out.println("After Inserting: " + sb);
    }
}