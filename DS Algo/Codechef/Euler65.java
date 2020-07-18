import java.lang.*;
import java.math.BigInteger;
public class Euler65
{
  public static void main(String[] args)
  {
    long[] a=new long[102];
    a[1]=1;
    a[2]=2;
    a[0]=2;
    int k=2;
    
    for(int i=3;i<=101;i++)
    {
      if(i%3==0||i%3==1)
        a[i]=1;
      else
      {
        a[i]=2*k;
        k++;
      }
    }
    BigInteger[] prev=new BigInteger[2];
    prev[0]=BigInteger.ONE;
    String s=a[99]+"";
    prev[1]=new BigInteger(s);
    for(int i=99;i>0;i--)
    {
      BigInteger x=prev[0];
      BigInteger y=prev[1];
      
      prev[0]=y;
      prev[1]=y.multiply(BigInteger.valueOf(a[i-1])).add(x);
     
      
     
    }
    BigInteger val=prev[0].gcd(prev[1]);
    prev[0]=prev[0].divide(val);
    prev[1]=prev[1].divide(val);
    String num=prev[1].toString();
    int ans=0;
    for(int i=0;i<num.length();i++)
    {
      ans+=Integer.parseInt(num.substring(i,i+1));
    }
    System.out.println(prev[0]+" "+prev[1]);
    System.out.println(ans);
//    for(int i=1;i<=50;i++)
//      System.out.println(a[i]+" ");
  }
  public static long gcd(long a,long b)
  {
    if(b==0) return a;
    else
      return gcd(b,a%b);
  }
  
}
        