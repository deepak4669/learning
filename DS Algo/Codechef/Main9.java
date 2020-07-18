import java.math.BigInteger;
import java.util.Scanner;
public class Main9
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    BigInteger[] res=new BigInteger[t];
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      res[i]=fact(a);
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
  }
  public static BigInteger fact(int a)
  {
    BigInteger res=BigInteger.ONE;
    while(a>0)
    {
      res=res.multiply(BigInteger.valueOf(a));
      a--;
    }
    return res;
  }
}