package rajesh.main;

import rajesh.homework.Problem1;
import rajesh.homework.Problem2;
import rajesh.homework.Problem3;
import rajesh.homework.Problem4;

public class Facade {
   public static void main(String[] args)
   {
       boolean exit =true;
      do{
          System.out.println("Press 1 for Problem no 1");
          System.out.println("Press 2 for Problem no 2");
          System.out.println("Press 3 for Problem no 3");
          System.out.println("Press 4 for Problem no 4");
          System.out.println("Press 0 to exit");
          int value = Scanner.getInteger("Enter  the options");
          switch (value)
          { case 1:
              Problem1 p1=new Problem1();
              p1.run();
              break;
              case 2:
                  Problem2 p2 = new Problem2();
                  p2.run();
                  break;
              case 3:
                  Problem3 p3 = new Problem3();
                  p3.run();
                  break;
              case 4:
                  Problem4 p4 =new Problem4();
                  p4.run();
                  break;
              case 0:
                  exit =false;
                  break;

          }


      }while(exit);

   }

}
