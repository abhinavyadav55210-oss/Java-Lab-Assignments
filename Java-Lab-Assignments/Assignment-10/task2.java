// Name: Abhinav Yadav
// Roll No: 2510303021
// Experiment No: 10
// Task 2: Create and access an ArrayList

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("ArrayList: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        System.out.println("Total fruits: " + fruits.size());
    }
}