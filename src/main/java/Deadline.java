import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Deadline extends Task{

    private String by;
    private LocalDate date;

    /**
     * A constructor for this deadline Task.
     *
     * @param description the description of what the task is.
     * @param by the specific date/time that this task has to be done by.
     */
    public Deadline(String description, String by) throws InvalidParamException {
        super(description);
        this.by = by;

        try {
            this.date = LocalDate.parse(by);
            this.by = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy"));
        } catch (DateTimeParseException e) {
            throw new InvalidParamException("\n\nThe deadline should be a valid date in the form: yyyy-mm-dd\n"
                    + "i.e. 2021-12-25");
        }
    }

    /**
     * Returns the string representation of this Task, which follows the following format:
     * [D][Task status] Task Description (by: Task deadline)
     *
     * @return string representation of this Task, which is the type of task (Deadline),
     *         its status, its description, and its deadline.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by + ")";
    }

}
