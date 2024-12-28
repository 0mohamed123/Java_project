// TaskManager class for managing tasks

import java.util.ArrayList;
import java.util.List;

class TaskManager {
    private final List<String> tasks = new ArrayList<>();
    private final List<String> completedTasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    public void completeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Invalid task index.");
        }
        completedTasks.add(tasks.remove(index));
    }

    public List<String> getCompletedTasks() {
        return new ArrayList<>(completedTasks);
    }
}