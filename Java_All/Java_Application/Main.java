
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main application class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two numbers:-");
        double x = input.nextDouble(),y = input.nextDouble();
        // Sample usage of the Calculator class
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(x, y));
        System.out.println("Subtraction: " + calculator.subtract(x, y));
        System.out.println("Multiplication: " + calculator.multiply(x, y));
        System.out.println("Division: " + calculator.divide(x, y));

        input.close();

        // Sample usage of the TaskManager class
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Complete Java Project");
        taskManager.addTask("Write Unit Tests");
        System.out.println("All Tasks: " + taskManager.getAllTasks());
        taskManager.completeTask(0);
        System.out.println("Completed Tasks: " + taskManager.getCompletedTasks());
    }
}




