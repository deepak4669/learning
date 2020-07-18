import java.util.Scanner;
import java.math.BigInteger;
public class Main20
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    BigInteger[] res=new BigInteger[10];
    BigInteger[] res2=new BigInteger[10];
    int t=1;
    for(int i=0;i<t;i++)
    {
      BigInteger a=sc.nextBigInteger();
      BigInteger b=sc.nextBigInteger();
      res[i]=ans(a,b);
      res2[i]=res[i].subtract(b);
    }
    for(int i=0;i<t;i++)
    {
      System.out.println(res[i]);
      System.out.println(res2[i]);
    }
  }
  public static BigInteger ans(BigInteger a,BigInteger b)
  {
   BigInteger c=a.add(b);
   BigInteger f=new BigInteger("2");
   return c.divide(f);
  }
}
   
  