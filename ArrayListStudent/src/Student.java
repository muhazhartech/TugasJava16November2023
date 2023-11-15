import java.util.ArrayList;
import java.util.Collections;

public class Student {
    public static void main(String[] args) {
        // Create an ArrayList to hold student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Call the addStudents method to add names to the ArrayList
        addStudents(studentNames);

        // Display the unsorted list of students
        System.out.println("List of students (unsorted):");
        displayStudents(studentNames);

        // Sort the list of students
        Collections.sort(studentNames);

        // Display the sorted list of students
        System.out.println("List of students (sorted):");
        displayStudents(studentNames);
    }

    // Method to add students to the ArrayList
    static void addStudents(ArrayList<String> studentNames) {
        // Add the names of everyone in your class
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
    }

    // Method to display students from the ArrayList
    static void displayStudents(ArrayList<String> studentNames) {
        for (String name : studentNames) {
            System.out.println(name);
        }
        System.out.println(); // Add a newline for better formatting
    }
}
