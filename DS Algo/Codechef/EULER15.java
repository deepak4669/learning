import java.util.Scanner;
import java.math.BigInteger;
public class EULER15
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      BigInteger ans=solve(n);
      System.out.println(ans);
    }
  }
  public static BigInteger solve(int n)
  {
    return fact(2*n).divide(fact(n).multiply(fact(n)));
  }
  public static BigInteger fact(int n)
  {
    BigInteger f=BigInteger.ONE;
    while(n>0)
    {
      f=f.multiply(BigInteger.valueOf(n));
      n--;
    }
    return f;
  }
}
    