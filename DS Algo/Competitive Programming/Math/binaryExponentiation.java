import java.util.*;

public class binaryExponentiation
{
  static long binPowRecursive(long a,long n)//Recursive Slower.
  {
    if(n==0)
      return 1;
    else if(n%2==0)
    {
      long res=binPow(a,n/2);
      return res*res;
    }
    else
    {
      long res=binPow(a,(n-1)/2);
      return res*res*a;
    }
  }
  
  static long binPow(long a,long n)
  {
    long res=1;
    while(n>0)
    {
      if(n%2!=0)
      {
        res=res*a;
      }
      a*=a;
      n/=2;
    }
    return res;
  }
  static long binPow(long a,long b,long n)
  {
    if(b==0)
    {
      if(n==1) return 0;
      else return 1;
    }
    long res=1;
    while(b>0)
    {
      if(b%2!=0)
      {
        res=(res*a)%n;
      }
      a=(a*a)%n;
      b/=2;
    }
    return res;
  }
        
  
  
  public static void main(String[] args)
  {
    System.out.println(binPow(71045970,41535484,64735492));
  }
}
    
  