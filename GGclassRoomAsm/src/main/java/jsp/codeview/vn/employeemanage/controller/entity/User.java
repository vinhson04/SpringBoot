package jsp.codeview.vn.employeemanage.controller.entity;

import jakarta.persistence.*;


@Entity
@Table(name ="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private int age;
    @Column(name = "Salary")
    private double salary;

    public User() {
    }

    public User(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }


    @Override
    public String toString() {
        return "User [id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary + "]";
    }

}
