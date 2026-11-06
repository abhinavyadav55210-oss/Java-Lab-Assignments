
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 03
// Task 4: Print an upside-down triangle of stars

public class task4 {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
