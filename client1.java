//Client program for imlementing the RMI client side 

import java.rmi.*;

public class client1
{
  public static void main(String[] args) throws Exception
  {
    Inter1 obj = (Inter1)Naming.lookup("clc");

    int m = obj.add(10,5);
    System.out.println("Addition is:"+m);

    int m1 = obj.sub(10,5);
    System.out.println("Subtration is:"+m1);

    int m2 = obj.mul(10,5);
    System.out.println("multiplication is:"+m2);

    int m3 = obj.div(10,5);
    System.out.println("Division is:"+m3);

  }
}
