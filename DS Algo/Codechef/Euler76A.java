import java.util.*;
import java.io.*;
public class Euler76A
{
  static long sum(long n)
  {
    if(n==1) return 0;
    else return n/2+sum(n-1);
  }
  public static void main(String[] args)
  {
    System.out.println(sum(100));
  }
}
  