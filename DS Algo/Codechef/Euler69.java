import java.lang.*;
//import java.util.*;
import java.io.*;

public class Euler69
{
  public static void main(String[] args)
  {
    double max=0;
    int id=0;
    int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++)
    {
      int phi=totient(i);
      if(((double)i)/phi>max)
      {
        max=((double)i)/phi;
        id=i;
      }
    }
    System.out.println(id);
    System.out.println(max);
  }
  public static int totient(int n)
  {
    int result=n;
    for(int i=2;i*i<=n;i++)
    {
      if(n%i==0)
      {
        while(n%i==0)
          n/=i;
        result-=result/i;
      }
    }
    if(n>1)
      result-=result/n;
    return result;
  }
}