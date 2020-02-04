package rajesh.homework;

import rajesh.main.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    private List list;

    public Problem3()
    {
        list = new ArrayList();
    }

    int add(Object o)
    {
        if( o.equals(null))
            return -1;
        if(list.contains(o))
            return -1;
        list.add(o);
        int index =-1;
        for(int i=0;i < list.size();i++)
        {
            if(o == list.get(i)){
                index = i;
                break;
            }

        }
        return index;
    }

    int remove(Object o)
    {
        if(list.isEmpty())
            return 0;
        if(!list.contains(o))
            return 0;
        list.remove(o);
        return 1;
    }

    void showAll()
    {
        for(int i=0;i < list.size();i++)
        {
           System.out.println(list.get(i));

        }
    }

    public void run()
    {
        boolean exit =true;
        do{

            System.out.println("Enter 1 to add element to list");
            System.out.println("Enter 2 to remove element from  list");
            System.out.println("Enter 0 to exit from this problem");

            int value = Scanner.getInteger("Enter the number");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            switch (value)
            {
                case 1:
                   System.out.println("Enter the element to be added");

                    int x =-1;
                    if(scanner.hasNextBoolean())
                    {
                       x=add(scanner.nextBoolean());
                    }else if (scanner.hasNextInt()){
                       x= add(scanner.nextInt());

                    }else if(scanner.hasNextFloat() || scanner.hasNextDouble())
                    {
                        x=add(scanner.nextFloat());
                    }else if(scanner.hasNext())
                    {
                       x=add(scanner.next());
                    }


                    if(x >=0)
                    {
                        System.out.println("Element is added at position"+x);
                    }
                    else
                        System.out.println("Error in addind the element");
                    break;
                case 2:

                    System.out.println("Enter the element to be removed");

                    int ret =-1;
                    if(scanner.hasNextBoolean())
                    {
                        ret=remove(scanner.nextBoolean());
                    }else if (scanner.hasNextInt()){
                        ret= remove(scanner.nextInt());

                    }else if(scanner.hasNextFloat() || scanner.hasNextDouble())
                    {
                        ret=remove(scanner.nextFloat());
                    }else if(scanner.hasNext())
                    {
                        ret=remove(scanner.next());
                    }

                    if(ret ==1)
                        System.out.println("Element removed");
                    else
                        System.out.println("Error in removing the element");

                    break;
                case 0:
                    exit =false;
                    break;
            }
            showAll();

        }while (exit);
    }
}
