package rajesh.model;

public class Employee {
    private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;

    public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    // Setters and Getters


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee : " + "ID: "+id + "  firstname: " + firstName + " LastName: " + lastName
                + " Age: " + age ;
    }


}
