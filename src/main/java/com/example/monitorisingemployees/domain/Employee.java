package com.example.monitorisingemployees.domain;

public class Employee {

    int id;
    String name;
    String password;
    WorkingSection workingSection;
    EmployeeStatus status;
    float income;

    public Employee(int id, String name,String password,WorkingSection section,EmployeeStatus status,float income) {
        this.id = id;
        this.name = name;
        this.password=password;
        this.workingSection=section;
        this.status=status;
        this.income=income;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
}
