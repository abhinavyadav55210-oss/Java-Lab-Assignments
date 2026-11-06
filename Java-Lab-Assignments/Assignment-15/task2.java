// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 15
// Task 2: Append numbers and remove the last comma

public class task2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
            sb.append(",");
        }

        System.out.println("Before removing comma: " + sb);

        sb.deleteCharAt(sb.length() - 1);

        System.out.println("After removing comma: " + sb);
    }
}