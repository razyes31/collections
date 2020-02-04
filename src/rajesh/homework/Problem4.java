package rajesh.homework;

import rajesh.model.Person;
import rajesh.model.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Problem4 {

    public void run()
    {
        PersonService ps = new PersonService();
        List<Person> test = ps.generateList();
        ps.show(test);
        Map<Float,Person> test2 = ps.transform(test);
        ps.show(test2);

    }


}
