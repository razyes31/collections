package rajesh.model;

public class Person {
    private int id;
    private String name;
    private Double salary;

    Person(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary =salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
