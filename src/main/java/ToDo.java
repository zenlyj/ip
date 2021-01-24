public class ToDo extends Task {

    public ToDo(String description) {
        super(description, "0");
    }

    /**
     * Constructor of the ToDo class
     * @param description A brief description of the ToDo task
     */

    public ToDo(String description, String isDone) {
        super(description, isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}