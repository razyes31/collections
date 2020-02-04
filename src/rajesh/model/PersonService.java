package rajesh.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {

   public PersonService()
    {
    }

    public List<Person> generateList()
    {
        List<Person> persons=  new ArrayList<Person>();
        Person p1 = new Person(1,"rajesh",20000);
        Person p2 = new Person(1,"anil",20000);
        Person p3 = new Person(1,"hari",20000);
        Person p4 = new Person(1,"gauri",20000);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        return persons;
    }

    public Map<Float,Person> transform(List<Person> list)
    {
        Map<Float,Person> map =new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(Person p: list)
        {

          if(map1.isEmpty() || !map1.containsKey(p.getId()))
          {
              map1.put(p.getId(),0);
              //map.put((float)p.getId(),p);

          }
          else
          {
              int count =map1.get(p.getId())+1;
              map1.put(p.getId(),count);

          }
          float value = 0;
            if(map1.get(p.getId())==0)
                value = (float) 0.0;
           for(int i = 1;i <=map1.get(p.getId());i++)
           {
              value += Math.pow(10,-i);
           }


            float id = (float)(p.getId() + value);
            map.put(id,p);

        }

        return map;
    }

    public void show(List<Person> list)
    {
        for(int i = 0;i<list.size();i++)
        {
            System.out.println("Person["+i+"]:"+list.get(i));
        }
    }

    public void show(Map<Float,Person> list)
    {
        for (Map.Entry<Float,Person> entry : list.entrySet()){
            System.out.print("id = " + entry.getKey());
            System.out.println(  ", Person = " + entry.getValue());

        }




    }




}
