package rajesh.model;

import java.util.Comparator;

public class FirstNameSort implements Comparator<Employee> {



    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getFirstName().equalsIgnoreCase(o2.getFirstName()))
            return o1.getLastName().compareTo(o2.getLastName());
        else
            return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
