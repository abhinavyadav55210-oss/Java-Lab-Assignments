
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 06
// Task 2: Find the smallest value and its index

public class task2 {
    public static void main(String[] args) {

        int[] arr = {25, 10, 45, 5, 30};

        int smallest = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest value: " + smallest);
        System.out.println("Index: " + index);
    }
}
