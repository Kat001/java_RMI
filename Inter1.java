
//Remote Interface for simple calculator

import java.rmi.Remote;
public interface Inter1 extends Remote
  {
  public int add(int x,int y) throws Exception;
  public int sub(int x,int y) throws Exception;
  public int mul(int x,int y) throws Exception;
  public int div(int x,int y) throws Exception;
  }
