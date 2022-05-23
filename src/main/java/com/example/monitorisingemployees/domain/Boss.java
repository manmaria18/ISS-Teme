package com.example.monitorisingemployees.domain;

public class Boss {

    int id;
    String name;
    String password;
    float income;

    public Boss(int id, String name, String password,float income) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.income=income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
}
