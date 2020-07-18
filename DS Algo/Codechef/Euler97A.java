import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Euler97A
{
  public static long binPow(long a,long b,long n)
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
//    long a=2;
//    long b=7830457;    
//    long c=Long.parseLong("10000000000");
//    
    BigInteger a=new BigInteger("2");
    BigInteger b=new BigInteger("7830457");
    BigInteger c=new BigInteger("10000000000");
    BigInteger d=new BigInteger("28433");
    BigInteger e=new BigInteger("1");
    
    System.out.println(((d.multiply(a.modPow(b,c))).mod(c)).add(e));
      
    
//    System.out.print(binPow(a,b,c));
      
  }
}
  
  