package domain;

public class Task {

    int id;
    String description;
    TaskStatus status;
    int employeeId;

    public Task(int id, String description, TaskStatus status, int employeeId) {

        this.id = id;
        this.description = description;
        this.status = status;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
