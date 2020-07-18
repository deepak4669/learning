import java.util.*;
import java.lang.*;
import java.io.*;

public class Euler73
{
  public static int gcd(int a,int b)
  {
    if(a==0) return b;
    else return gcd(b%a,a);
  }
    
  public static void main(String[] args)
  {
    int d=12000;
    int count=0;
    for(int i=12000;i>=2;i--)
    {
      int min=i/3;
      int max=i/2;
      
      for(int j=min;j<=max+1;j++)
      {
        if(gcd(j,i)==1)
        {
          if(3*j>i&&2*j<i)
            count++;
        }
      }
    }
    System.out.println(count);
  }
}
        