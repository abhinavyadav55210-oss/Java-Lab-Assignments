
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 05
// Task 3: Count values greater than 10

public class task3 {
    public static void main(String[] args) {

        int[] arr = {5, 12, 18, 7, 25, 10, 30};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count of values greater than 10: " + count);
    }
}
