import java.util.Scanner;
import java.math.BigInteger;
public class Euler152
{
  static int f=1000000007;
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      BigInteger ans=fact(n+m).divide(fact(n).multiply(fact(m))).mod(BigInteger.valueOf(f));
      System.out.println(ans);
    }
  }
  public static BigInteger fact(int x)
  {
    BigInteger t=BigInteger.ONE;
    for(int i=1;i<=x;i++)
    {
      t=t.multiply(BigInteger.valueOf(i));
    }
    return t;
  }
}
      