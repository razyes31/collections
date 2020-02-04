package rajesh.homework;

import rajesh.main.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    private List list;
    private Scanner sc;

    public Problem1() {
        list = new  ArrayList( Arrays.asList("One",2,"Three",67.986,'Z', "ABC",123,true, "xyz"));
        sc = new Scanner();
    }


     public void display()
    {
       for(int i = 0;i<list.size();i++)
       {
           System.out.println("Element["+i+"]:"+list.get(i));
       }
    }

    public void check(Object o, int position)
    {
        if(o instanceof Boolean)
        {
            Boolean b = (Boolean)o;
            if(b)
                b=false;
            else
                b=true;
            list.set(position,b);

        } else if(o instanceof Integer)
        {
            Integer i = (Integer)o;
            list.set(position,i+1);

        }else if(o instanceof Double || o instanceof Float)
        {
            Float f =(Float)o;
            list.set(position,f+2.0);

        }else if(o instanceof String) {
            String temp = (String) o;
            if (temp.length() == 1) {
                char c = temp.toCharArray()[0];

                if (c == '#') {
                    System.out.println("Exiting the program");
                    System.exit(0);

                } else {

                    list.set(position, (char)(c+1));
                }

            } else {
                StringBuilder sb = new StringBuilder();
                for (Character c : temp.toCharArray()) {
                    if (Character.isUpperCase(c))
                        sb.append(Character.toLowerCase(c));
                    else
                        sb.append(Character.toUpperCase(c));

                }
                list.set(position, sb.toString());
            }
        }

    }

    public void run()
    {
        this.display();
        boolean exit =true;


        do{
            int position=0;

            do{
                position  =Scanner.getInteger("Enter the position to be replaced range 1-5");

            }while(!(position <6 && position >=0));
            System.out.println("Enter the element to be replaced or # to exit");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            if(scanner.hasNextBoolean())
            {
                check(scanner.nextBoolean(),position);
            }else if (scanner.hasNextInt()){
                check(scanner.nextInt(),position);

            }else if(scanner.hasNextFloat() || scanner.hasNextDouble())
            {
                check(scanner.nextFloat(),position);
            }else if(scanner.hasNext())
            {
                check(scanner.next(),position);
            }

            System.out.println("changing value at position "+position);


            this.display();
            int value =Scanner.getInteger("Enter 0 to exit this problem or else to continue ");
            if(value ==0)
                exit =false;

        }while(exit);


    }





}