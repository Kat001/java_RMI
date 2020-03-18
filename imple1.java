
//Implementation of Remote Interface of simple calculator


import java.rmi.server.*;

public class imple1 extends UnicastRemoteObject implements Inter1
  {
      public imple1() throws Exception
      {
        super();
      }
      public int add(int x,int y)
      {
        return(x+y);
      }
      public int sub(int x,int y)
      {
        return(x-y);
      }
      public int mul(int x,int y)
      {
        return(x*y);
      }
      public int div(int x,int y)
      {
        return(x/y);
      }
  }
