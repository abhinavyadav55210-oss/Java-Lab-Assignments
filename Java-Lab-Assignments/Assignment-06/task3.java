
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 06
// Task 3: Check for a repeated value

public class task3 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Duplicate value found");
        }
        else {
            System.out.println("No duplicate value found");
        }
    }
}
