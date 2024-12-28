// Test class for unit testing
class Tests {
    public static void main(String[] args) {
        testCalculator();
        testTaskManager();
    }

    private static void testCalculator() {
        Calculator calculator = new Calculator();
        assert calculator.add(2, 3) == 5 : "Addition test failed";
        assert calculator.subtract(5, 3) == 2 : "Subtraction test failed";
        assert calculator.multiply(4, 2) == 8 : "Multiplication test failed";
        assert calculator.divide(10, 2) == 5.0 : "Division test failed";

        try {
            calculator.divide(10, 0);
            assert false : "Division by zero did not throw an exception";
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("Division by zero is not allowed.") : "Wrong exception message";
        }
        System.out.println("Calculator tests passed.");
    }

    private static void testTaskManager() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Task 1");
        taskManager.addTask("Task 2");
        assert taskManager.getAllTasks().size() == 2 : "Add task test failed";

        taskManager.completeTask(0);
        assert taskManager.getAllTasks().size() == 1 : "Complete task test failed (remaining tasks count)";
        assert taskManager.getCompletedTasks().size() == 1 : "Complete task test failed (completed tasks count)";
        assert taskManager.getCompletedTasks().contains("Task 1") : "Completed task not found";

        try {
            taskManager.completeTask(10);
            assert false : "Completing non-existent task did not throw an exception";
        } catch (IndexOutOfBoundsException e) {
            assert e.getMessage().equals("Invalid task index.") : "Wrong exception message";
        }
        System.out.println("TaskManager tests passed.");
    }
}
