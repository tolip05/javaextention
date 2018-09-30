package companyRoster;

public class Employee {
    private static final String DEAFAULT_EMAIL_VALUE = "n/a";
    private static final int DEFAULT_AGE_VALUE = -1;

    private String name;
    private double salary;
    private String position;
    private String departmen;
    private String email;
    private int age;

    public Employee(String name, double salary, String position, String departmen) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.departmen = departmen;
        this.email = DEAFAULT_EMAIL_VALUE;
        this.age = DEFAULT_AGE_VALUE;
    }

    public Employee(String name, double salary, String position, String departmen, String email) {
        this(name,salary,position,departmen);
        this.email = email;
    }
    public Employee(String name, double salary, String position, String departmen, int age) {
        this(name,salary,position,departmen);
        this.age = age;
    }

    public Employee(String name, double salary, String position, String departmen, String email, int age) {
        this(name,salary,position,departmen);
        this.email = email;
        this.age = age;
    }

    public String getDepartmen() {
        return departmen;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this
        .age);
    }
}
