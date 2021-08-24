package duke.task;

public abstract class Task {

    private final String DESCRIPTION;
    private boolean isDone;

    /**
     * A constructor for this Task.
     *
     * @param description the description of what the task is.
     */
    public Task(String description) {
        this.DESCRIPTION = description;
        this.isDone = false;
    }

    /**
     * Marks this task as completed.
     */
    public void markAsDone() {
        this.isDone = true;
    }

    /**
     * Returns the string representation of this Task, which follows the following format:
     * [Task status] Task Description
     *
     * @return string representation of this Task, which is its status and its description.
     */
    @Override
    public String toString() {
        String statusIcon = this.isDone ? "X" : " ";
        return "[" + statusIcon + "] " + this.DESCRIPTION;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public String getDescription() {
        return this.DESCRIPTION;
    }
}