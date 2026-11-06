
// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 02
// Task 3: Check whether a year is a leap year

public class task3 {
    public static void main(String[] args) {

        int year = 2024;

        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
