package team;

public class Teams {
    private static final String DEFAULT_EMAIL_VALUE = "n/a";
    private static final int DEFAULT_AGE_VALUE = -1;

    private String name;
    private double salary;
    private String position;
    private String departament;
    private String email;
    private int age;

    public Teams(String name, double salary, String position, String departament) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.departament = departament;
        this.email = DEFAULT_EMAIL_VALUE;
        this.age = DEFAULT_AGE_VALUE;
    }

    public Teams(String name, double salary, String position, String departament, String email) {
        this(name,salary,position,departament);
        this.email = email;
    }

    public Teams(String name, double salary, String position, String departament, int age) {
        this(name,salary,position,departament);
        this.age = age;
    }

    public Teams(String name, double salary, String position, String departament, String email, int age) {
        this(name,salary,position,departament);
        this.email = email;
        this.age = age;
    }

    public String getDepartament() {
        return departament;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",
                this.name,this.salary,this.email,this.age);
    }
}
