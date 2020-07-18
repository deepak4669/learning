import java.util.Scanner;
import java.math.BigInteger;
public class GCD2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      BigInteger a=sc.nextBigInteger();
      BigInteger b=sc.nextBigInteger();
      System.out.println(gcd(a,b));
    }
  }
  public static BigInteger gcd(BigInteger a,BigInteger b)
  {
    if(b.equals(BigInteger.ZERO)) return a;
    else return gcd(b,a.mod(b));
  }
}
      