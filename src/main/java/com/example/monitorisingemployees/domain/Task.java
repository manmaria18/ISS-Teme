package com.example.monitorisingemployees.domain;

public class Task {

    int id;
    String name;
    String description;
    String deadline;
    TaskStatus status;
    String observations;
    int employeeId;

    public Task(int id, String name,String description,String deadline, TaskStatus status,String observations, int employeeId) {

        this.id = id;
        this.name=name;
        this.description = description;
        this.deadline=deadline;
        this.status = status;
        this.observations=observations;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
