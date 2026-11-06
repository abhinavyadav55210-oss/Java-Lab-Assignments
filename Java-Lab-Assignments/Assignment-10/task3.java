// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 10
// Task 3: Update and remove ArrayList elements

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original ArrayList: " + fruits);

        fruits.set(1, "Grapes");

        System.out.println("After updating: " + fruits);

        fruits.remove(2);

        System.out.println("After removing: " + fruits);
    }
}