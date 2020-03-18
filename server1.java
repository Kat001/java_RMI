import java.rmi.*;

public class server1
{
  public static void main(String args[]) throws Exception
  {
    imple1 obj = new imple1();
    Naming.rebind("clc",obj);
    System.out.println("Server is done!");
  }
}
