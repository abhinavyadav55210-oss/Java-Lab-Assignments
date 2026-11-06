// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 15
// Task 1: Append text and display its length

public class task1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        sb.append(" Programming");

        System.out.println("String: " + sb);
        System.out.println("Length: " + sb.length());
    }
}