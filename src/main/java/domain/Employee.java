package domain;

public class Employee {

    int id;
    String name;
    String password;

    public Employee(int id, String name,String password) {
        this.id = id;
        this.name = name;
        this.password=password;
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
