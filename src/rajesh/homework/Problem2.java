package rajesh.homework;

import rajesh.model.AgeSort;
import rajesh.model.Employee;
import rajesh.model.FirstNameSort;
import rajesh.model.LastNameSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {

    List<Employee> employees = new ArrayList<Employee>();

    public void display()
    {
        for(int i = 0;i<employees.size();i++)
        {
            System.out.println(employees.get(i));
        }
    }

    public void run()
    {
        Employee e1 = new Employee(1, "apple", "camry", 34);
        Employee e2 = new Employee(2, "banana", "ford", 30);
        Employee e3 = new Employee(3, "apple", "ford", 31);
        Employee e4 = new Employee(4, "mango", "camry", 25);


        employees.add(e2);
        employees.add(e3);
        employees.add(e1);
        employees.add(e4);

        Collections.sort(employees, new AgeSort());
        System.out.println("Sorted by age name");
        display();

        Collections.sort(employees, new FirstNameSort());
        System.out.println("Sorted by first name");
        display();


        Collections.sort(employees, new LastNameSort());
        System.out.println("Sorted by last name");
        display();
    }
}


