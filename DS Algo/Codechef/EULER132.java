import java.math.BigInteger;
import java.util.Scanner;
public class EULER132
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    BigInteger f=new BigInteger("0");
    for(int i=0;i<n;i++)
    {
      f=f.add(sc.nextBigInteger());
    }
    System.out.println(f.toString().substring(0,10));
  }
}
      